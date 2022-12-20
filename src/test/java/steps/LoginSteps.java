package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utils.CommonMethods;
import utils.ConfigReader;

import static utils.ConfigReader.getPropertyValue;

public class LoginSteps extends CommonMethods {
    @Given("user is navigated to Amazon application")
    public void user_is_navigated_to_amazon_application() {
openBrowserAndLaunchApplication();
    }
    @When("user clicks sign in button")
    public void user_clicks_sign_in_button() {
        String title1= driver.getTitle();
        System.out.println("Title 1 is ; "+title1);
        click(login.signInMain);

    }
    @When("user enters valid username and clicks continue")
    public void user_enters_valid_username_and_clicks_continue() {
        sendText(login.usernameTextField, getPropertyValue("username"));
        click(login.proceed);
    }

    @When("user enters valid password and clicks on sign in button")
    public void user_enters_valid_password_and_clicks_on_sign_in_button() {
        sendText(login.passwordTextField, getPropertyValue("password"));
click(login.submit);
       // click(login.signinButton);
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {




        String expMsg=ConfigReader.getPropertyValue("expectedMessage");


if(expMsg.equalsIgnoreCase(login.welcome.getText())){

        System.out.println("I'm INSIDE AMAZON");

    }else{
    System.out.println("You are not inside Amazon");}

        Assert.assertEquals(login.welcome.getText(),expMsg);
        System.out.println("i am here after 1st assertion");

Assert.assertTrue(login.welcome.isDisplayed());
        System.out.println("after second...");
    }

}
