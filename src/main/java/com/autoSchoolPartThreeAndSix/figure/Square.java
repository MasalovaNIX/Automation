package com.autoSchoolPartThreeAndSix.figure;
import com.autoSchoolPartThreeAndSix.Coordinates;
import java.util.Arrays;

public class Square extends Figures {

    private static int point;
    double countArea;

    public Square() {
       this.name = "Square";
       this.point = 4;
       this.arrayX = Coordinates.arrayX(4);
       this.arrayY = Coordinates.arrayY(4);
       this.countArea = countedArea();
    }

    public double countedArea()  {
        double area = Math.round(Math.pow((arrayX[1]- arrayX[0]),2));{
        } return area;
    }

//    public String toString() {
//        return this.name+ " Coordinates X: " + Arrays.toString(this.arrayX) + " Coordinates Y: "+Arrays.toString(this.arrayY) + " Area " + countedArea();
//    }
//тут был найдет метод ту стринг, поскольку эррей не выводился на печать через обьект, получалась фигня в виде хэша( (типа такого com.autoSchoolPartThreeAndSix.figure.Triangle@4554617c)
// а теперь вот красота какая) я там законентировала в мэйне, если хочешь - глянь
}