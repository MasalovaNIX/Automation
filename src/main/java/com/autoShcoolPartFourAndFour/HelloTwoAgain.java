package com.autoShcoolPartFourAndFour;

public class HelloTwoAgain {

    private static String userName;

    public static void main(String[] args) {
        welcome();
        byeBay();

    }

    public static void welcome() {
        userName = "Алексей)";
        System.out.println("Hello," + userName + ".");
        try {
            Thread.sleep(3000);
        }
       catch (InterruptedException e){
       }
    }

    public static void byeBay() {
        userName = "Алексей)";
        System.out.println("Bye," + userName + ".");
    }

}




