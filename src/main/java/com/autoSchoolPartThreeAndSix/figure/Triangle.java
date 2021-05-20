package com.autoSchoolPartThreeAndSix.figure;
import com.autoSchoolPartThreeAndSix.Coordinates;
import java.util.Arrays;

public class Triangle extends Figures {

    private int point;
    double countArea;

    public Triangle() {
        this.name = "Triangle";
        this.point = 3;
        this.arrayX = Coordinates.getArray(3);
        this.arrayY = Coordinates.getArray(3);
    }

    public double countedArea(int[] x, int[] y){
        double area = Math.round((Math.pow((x[1]- x[0]),2)*(Math.pow(arrayY[0] - arrayY[1], 2)))/2);{
        } return area;
    }

//    public String toString() {
//        return this.name+ " Coordinates X: " + Arrays.toString(this.arrayX) + " Coordinates Y: "+Arrays.toString(this.arrayY) + " Area " + countedArea();
//    }
}
