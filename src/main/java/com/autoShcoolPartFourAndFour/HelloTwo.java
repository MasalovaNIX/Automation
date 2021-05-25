package com.autoShcoolPartFourAndFour;
import java.lang.Thread;

public class HelloTwo {

    private static String userName;

    public static void main(String[] args) throws InterruptedException {
        welcome();
        byeBay();
        divideByZero();

    }

    public static void welcome() throws InterruptedException {
        userName = "Алексей)";
        System.out.println("Hello," + userName + ".");
        Thread.sleep(3000);
    }

    public static void byeBay() {
        userName = "Алексей)";
        System.out.println("Bye," + userName + ".");
    }

    public static void divideByZero() {
        try {
            int zero = 5 / 0;
        } catch (ArithmeticException e) {
            System.out.println("You shall not fall!");
        }
    }
}



