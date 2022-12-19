package utils;


import org.apache.log4j.Logger;

public class Log {


    public static Logger Log= Logger.getLogger(Log.class.getName());
    public static void startTestCase(String LoginFunctionalityTest){
        Log.info("**");
        Log.info("**");
        Log.info("############   " + LoginFunctionalityTest + " ################");
        Log.info("**");
        Log.info("**");
    }

    public static void endTestCase(String testCaseName){
        Log.info("##################################");
        Log.info("##########################################");
        Log.info("############   " + testCaseName + " ################");
        Log.info("##########################");
        Log.info("##########################################");
    }

    //to print some text in between my code
    public static void info(String message){
        Log.info(message);
    }

    public static void warning(String warning){
        Log.info(warning);
    }

}
