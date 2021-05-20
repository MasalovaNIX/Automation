package com.autoSchoolPartThreeAndSix.figure;

import com.autoSchoolPartThreeAndSix.Coordinates;

import java.util.Arrays;

public class Circle extends Figures {

    private int point;
    double countArea;


    public Circle() {
        this.name = "Circle";
        this.point = 2;
        this.arrayX = Coordinates.arrayX(2);
        this.arrayY = Coordinates.arrayY(2);
    }

    public double countedArea() {
        double area = Math.round(Math.PI *((Math.pow((arrayX[0] - arrayX[1]), 2) + (Math.pow(arrayY[0] - arrayY[1], 2)))));{
        } return area;
    }

//    public String toString() {
//        return this.name+ " Coordinates X: " + Arrays.toString(this.arrayX) + " Coordinates Y: "+Arrays.toString(this.arrayY) + " Area " + countedArea();
//    }
}
