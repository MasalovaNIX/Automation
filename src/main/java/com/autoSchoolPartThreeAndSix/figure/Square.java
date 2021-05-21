package com.autoSchoolPartThreeAndSix.figure;

import java.util.Arrays;

public class Square extends Figures {

    private double area;

    public Square(String name, int[] arrayX, int[] arrayY) {
        super(name, arrayX, arrayY);

    }

    public double countArea(int[] arrayX, int[] arrayY) {
        return Math.round(Math.pow((arrayX[1] - arrayX[0]), 2));
    }
}











//    public double countedArea()  {
//        double area = Math.round(Math.pow((arrayX[1]- arrayX[0]),2));{
//        } return area;
//    }

//    public String toString() {
//        return this.name+ " Coordinates X: " + Arrays.toString(this.arrayX) + " Coordinates Y: "+Arrays.toString(this.arrayY) + " Area " + countedArea();
//    }
//тут был найдет метод ту стринг, поскольку эррей не выводился на печать через обьект, получалась фигня в виде хэша( (типа такого com.autoSchoolPartThreeAndSix.figure.Triangle@4554617c)
// а теперь вот красота какая) я там законентировала в мэйне, если хочешь - глянь
