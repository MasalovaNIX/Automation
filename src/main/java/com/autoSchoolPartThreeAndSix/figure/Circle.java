package com.autoSchoolPartThreeAndSix.figure;


public class Circle extends Figures {


    public Circle(String name, int[] arrayX, int[] arrayY) {
        super(name, arrayX, arrayY);
    }

    public double countArea(int[] arrayX, int[] arrayY) {
        return Math.round(Math.PI * ((Math.pow((arrayX[0] - arrayX[1]), 2) + (Math.pow(arrayY[0] - arrayY[1], 2)))));
    }
}








