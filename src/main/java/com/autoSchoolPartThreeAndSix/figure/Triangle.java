package com.autoSchoolPartThreeAndSix.figure;
import java.util.Arrays;

public class Triangle extends Figures {

    private double area;

    public Triangle(String name, int[] arrayX, int[] arrayY) {
        super(name, arrayX, arrayY);
    }

    public double countArea(int[] arrayX, int[] arrayY) {
        return Math.round((Math.pow((arrayX[1] - arrayX[0]), 2) * (Math.pow(arrayY[0] - arrayY[1], 2))) / 2);
    }
}









//    public double countedArea(){
//        double area = Math.round((Math.pow((arrayX[1]- arrayX[0]),2)*(Math.pow(arrayY[0] - arrayY[1], 2)))/2);{
//        } return area;
//    }
//
//    public String toString() {
//        return this.name+ " Coordinates X: " + Arrays.toString(this.arrayX) + " Coordinates Y: "+Arrays.toString(this.arrayY) + " Area " + countedArea();
//    }

