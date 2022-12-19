package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

public class Hooks extends CommonMethods {

    @Before
    public void preCondition(){
openBrowserAndLaunchApplication();

    }
    @After
    public void postCondition(Scenario scenario){
        byte []pic;
        //here we use special class called scenario class from cucumber
        //this class holds the complete information of your execution
        if(scenario.isFailed()){
         pic=   takeScreenshot("failed/"+scenario.getName());
        }else {
            pic = takeScreenshot("passed/" + scenario.getName());
        }
        scenario.attach(pic,"image/png", scenario.getName());
        closeBrowser();
    }
}