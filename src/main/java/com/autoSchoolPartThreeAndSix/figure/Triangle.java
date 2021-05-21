package com.autoSchoolPartThreeAndSix.figure;


public class Triangle extends Figures {


    public Triangle(String name, int[] arrayX, int[] arrayY) {
        super(name, arrayX, arrayY);
    }

    public double countArea(int[] arrayX, int[] arrayY) {
        return Math.round((Math.pow((arrayX[1] - arrayX[0]), 2) * (Math.pow(arrayY[0] - arrayY[1], 2))) / 2);
    }

}









