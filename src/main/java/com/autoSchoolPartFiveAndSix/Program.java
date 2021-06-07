package com.autoSchoolPartFiveAndSix;

import java.lang.reflect.Field;
import java.util.UUID;

public class Program {
    static String name;
    static String colour;

    public static void main(String[] args) {
        firstNumberClassName();
        firstNumberClassColour();
        secondNumberClassColour();
        secondNumberClassColour();

    }

    public static String firstNumberClassName() {
        FirstNumber firstNumberName = new FirstNumber();
        String name = null;
        try {
            Field field = firstNumberName.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(firstNumberName);
            String uuid = UUID.randomUUID().toString();
            name = uuid;
            field.set(firstNumberName, name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Значение поля name класса FirstNumber - " +  name);
        return name;
    }

    public static String firstNumberClassColour() {
        FirstNumber firstNumberColour = new FirstNumber();
        String colour = null;
        try {
            Field field = firstNumberColour.getClass().getDeclaredField("colour");
            field.setAccessible(true);
            colour = (String) field.get(firstNumberColour);
            String uuid = UUID.randomUUID().toString();
            colour = uuid;
            field.set(firstNumberColour, colour);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Значение поля colour класса FirstNumber - " +  colour);
        return colour;
    }

    public static String secondNumberClassName() {
        SecondNumber secondNumbeName = new SecondNumber();
        String name = null;
        try {
            Field field = secondNumbeName.getClass().getDeclaredField("name");
            field.setAccessible(true);
            name = (String) field.get(secondNumbeName);
            String uuid = UUID.randomUUID().toString();
            name = uuid;
            field.set(secondNumbeName, name);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Значение поля colour класса SecondNumber - " + name);
        return name;
    }

    public static String secondNumberClassColour() {
        SecondNumber secondNumbeColour = new SecondNumber();
        String colour = null;
        try {
            Field field = secondNumbeColour.getClass().getDeclaredField("colour");
            field.setAccessible(true);
            colour = (String) field.get(secondNumbeColour);
            String uuid = UUID.randomUUID().toString();
            colour = uuid;
            field.set(secondNumbeColour, colour);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("Значение поля colour класса SecondNumber - " +  colour);
        return colour;
    }

}

