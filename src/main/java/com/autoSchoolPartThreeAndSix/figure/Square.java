package com.autoSchoolPartThreeAndSix.figure;


public class Square extends Figures {


    public Square(String name, int[] arrayX, int[] arrayY) {
        super(name, arrayX, arrayY);
    }

    public double countArea(int[] arrayX, int[] arrayY) {
        return Math.round(Math.pow((arrayX[1] - arrayX[0]), 2));
    }

}











