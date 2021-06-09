package com.autoSchoolPartFiveAndSix;
import java.lang.reflect.Field;
import java.util.Arrays;

public class Numbers {

    public static void main(String[] args) throws IllegalAccessException {

        Numbers[] ArrayOfObjects = {new FirstNumber(), new SecondNumber()};
        for (int i = 0; i < ArrayOfObjects.length; i++) {
            Program.setValues(ArrayOfObjects[i]);
            printFields(ArrayOfObjects[i]);
        }
    }

            public static <T extends Numbers>  void printFields(T object) throws IllegalAccessException{
                Field[] field = object.getClass().getDeclaredFields();
                for(int i = 0; i < field.length; i++ ){
                    field[i].setAccessible(true);
                    System.out.println(String.format("Current field is \"%s\" value: ", field[i].getName())+field[i].get(object));
                }
     }

}
