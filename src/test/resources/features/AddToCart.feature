Feature: Search for a product and add to the Cart

  Background:
   // Given user is navigated to Amazon application
    When user clicks sign in button
    When user enters valid username and clicks continue
    And user enters valid password and clicks on sign in button
    Then user is successfully logged in
   @addcart1
  Scenario: Searching for a products and adding to the shopping cart

    When user enters the keyword in search text field and clicks
    And user clicks on specific product
    And user selects the size of the product and clicks on add to cart button
    And user verifies its added
    Then user clicks on cart button and verifies the product is in the shopping cart

