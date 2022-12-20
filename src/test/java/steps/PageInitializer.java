package steps;

import pages.*;

public class PageInitializer {

    public static LoginPage login;
    public static AddToCartPage cart;



    public static void intializePageObjects(){
        login = new LoginPage();
        cart=new AddToCartPage();




    }

}
