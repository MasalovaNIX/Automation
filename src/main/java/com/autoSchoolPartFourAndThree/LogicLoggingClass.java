package com.autoSchoolPartFourAndThree;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;


public class LogicLoggingClass  {

   private static final Logger logger = LogManager.getLogger(LogicLoggingClass.class);


    private  static void methodPrivate()  {
        System.out.println("Я вызываю тебя - private метод!");

}

    public static void methodPublic() {
        System.out.println("Я вызываю тебя - public метод!");
        methodPrivate();
        logger.error("Didn't do it.");
        logger.info("Test message");
        logger.trace("Entering application.");

    }
}
