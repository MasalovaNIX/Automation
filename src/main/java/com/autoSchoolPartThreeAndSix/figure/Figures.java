package com.autoSchoolPartThreeAndSix.figure;

public abstract class Figures {
    String name;
    int[] arrayX;
    int[] arrayY;

    public Figures(String name, int[] arrayX, int[] arrayY) {
        this.name = name;
        this.arrayX = arrayX;
        this.arrayY = arrayY;
   }

    public abstract double getArea();

}


//    static String name;
//    static int[] arrayX;
//    static int[] arrayY;
//    private static double countedArea;
//
//    public Figures() {
//
//    }
//
//    public void setName(String name) {
//        Figures.name = name;
//    }
//
//    public static String getName() {
//        return name;
//    }
//
//    public static int[] getArrayX() {
//        return arrayX;
//    }
//
//    public static int[] getArrayY() {
//        return arrayY;
//    }
//
//    public double countedArea(){
//        return countedArea;
//    }
//
//    public static double getCountedArea() {
//        return countedArea;
//    }
