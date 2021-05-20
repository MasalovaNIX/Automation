package com.autoSchoolPartThreeAndSix;
import java.util.Map;
import java.util.TreeMap;
import java.util.Collections;
import java.util.*;

import com.autoSchoolPartThreeAndSix.figure.Circle;
import com.autoSchoolPartThreeAndSix.figure.Figures;
import com.autoSchoolPartThreeAndSix.figure.Square;
import com.autoSchoolPartThreeAndSix.figure.Triangle;

public class Main {


    public static void main(String[] args) {


        createRandomFigures(10)

        public static Figures createRandomFigure(int numbers) {
        Figures[] list = new Figures[numbers];
        for (int i = 0; i < list.length; i++) {
            int a = 2 + (int) (Math.random() * 3);
            if (a == 2) {
                list[i] = new Square();
            }
            if (a == 3) {
                list[i] = new Circle();
            }
            if (a == 4) {
                list[i] = new Triangle();
            }
            return list;
        }
           // System.out.println(list[i]);

    sortFigures(int[] unsortedFigures){
            TreeMap<Double, String> sortedArea = new TreeMap<Double, String>();

            sortedArea.put(list[0].getCountedArea(), list[0].getName());
            sortedArea.put(list[1].getCountedArea(), list[1].getName());
            sortedArea.put(list[2].getCountedArea(), list[2].getName());
            sortedArea.put(list[3].getCountedArea(), list[3].getName());
            sortedArea.put(list[4].getCountedArea(), list[4].getName());
            sortedArea.put(list[5].getCountedArea(), list[5].getName());
            sortedArea.put(list[6].getCountedArea(), list[6].getName());
            sortedArea.put(list[7].getCountedArea(), list[7].getName());
            sortedArea.put(list[8].getCountedArea(), list[8].getName());
            sortedArea.put(list[9].getCountedArea(), list[9].getName());

            for (Map.Entry m : sortedArea.entrySet()) {
                System.out.println(m.getValue() + " " + m.getKey());
            }
            return int[] sortedFigures;
        }


    }
}
