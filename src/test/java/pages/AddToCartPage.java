package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.CommonMethods;

public class AddToCartPage extends CommonMethods {


@FindBy(xpath="//*[@class='hm-icon-label']")
public WebElement dropD;

@FindBy (id="twotabsearchtextbox")
    public WebElement searchField;
@FindBy(id="nav-search-submit-button")
    public WebElement searchButton;
@FindBy(xpath = "//*[contains(text(),'555088-404')]")
    public WebElement jordan;
@FindBy(id="size_name_2-announce")
    public WebElement size;
@FindBy(id="add-to-cart-button")
    public WebElement addCart;
@FindBy(xpath="//*[@class='a-size-medium-plus a-color-base sw-atc-text a-text-bold']")
    public WebElement addedText;
@FindBy(xpath="//*[@id='sw-gtc']")
    public WebElement goCart;





}
