package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

public class AddToCartSteps extends CommonMethods {

    @When("user clicks dropdown and selects category")
    public void user_clicks_dropdown_and_selects_category() {
click(cart.dropD);
   // selectDropdown(cart.dropD, "Clothing, Shoes, Jewelry & Watches");


    }
  /*  @When("user enters the keyword in search text field and clicks")
    public void user_enters_the_keyword_in_search_text_field_and_clicks() {
        sendText(cart.searchField, ConfigReader.getPropertyValue("product1"));
        click(cart.searchButton);

    }

   */

    @When("user clicks on specific product")
    public void user_clicks_on_specific_product() {
//click(cart.jordan);

    }


    @When("user selects the size of the product and clicks on add to cart button")
    public void user_selects_the_size_of_the_product_and_clicks_on_add_to_cart_button() {
//click(cart.size);
//click(cart.addCart);
    }

    @When("user verifies its added")
    public void user_verifies_its_added() {
        //verifying if added
       // Assert.assertEquals("Added to Cart", cart.addedText);


    }
    @Then("user clicks on cart button and verifies the product is in the shopping cart")
    public void user_clicks_on_cart_button_and_verifies_the_product_is_in_the_shopping_cart() {
//click(cart.goCart);

    }
}
