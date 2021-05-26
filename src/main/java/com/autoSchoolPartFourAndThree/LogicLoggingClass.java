package com.autoSchoolPartFourAndThree;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogicLoggingClass  {

   private static final Logger logger = Logger.getLogger("");

    private  static void methodPrivate()  {

        System.out.println("Я вызываю тебя - private метод!");
        logger.log(Level.INFO,"Test message");
           }

    public static void methodPublic() {

        System.out.println("Я вызываю тебя - public метод!");
        logger.info("Test message");
        methodPrivate();

    }
}
