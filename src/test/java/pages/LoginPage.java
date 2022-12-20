package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {
    @FindBy(id="nav-link-accountList-nav-line-1")
    public WebElement signInMain;
@FindBy(id="ap_email")
public WebElement usernameTextField;
@FindBy(id="continue")
public WebElement proceed;
@FindBy (id="ap_password")
public WebElement passwordTextField;
@FindBy (id="signInSubmit")
public WebElement submit;

@FindBy(xpath = "//span[contains(text(),'Hello')]")
public WebElement welcome;
//span[contains(text(),'Hello')]

    public LoginPage() {
        //call selenium page factory
        PageFactory.initElements(driver, this);
    }
}