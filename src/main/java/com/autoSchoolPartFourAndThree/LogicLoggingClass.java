package com.autoSchoolPartFourAndThree;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;


public class LogicLoggingClass  {

   private static final Logger logger = LogManager.getLogger(LogicLoggingClass.class);


    private  static void methodPrivate()  {
        System.out.println("Я вызываю тебя - private метод!");

}

    public static void methodPublic() {
        System.out.println("Я вызываю тебя - public метод!");
        methodPrivate();
        logger.error("This is Error");
        logger.info("This is Info");
        logger.warn("This is Warn");
        logger.debug("This is Debug");

    }
}
