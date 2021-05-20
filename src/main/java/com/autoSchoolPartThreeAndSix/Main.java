package com.autoSchoolPartThreeAndSix;
import java.util.TreeMap;
import java.util.*;
import com.autoSchoolPartThreeAndSix.figure.*;

public class Main {


    public static void main(String[] args) {

        sortFigures(createArrayOfRandomFigures(10));

    }



 public static int[] createArrayOfRandomCoordinates(int points) {

        int[] arrayOfCoordinates = new int[points];
        Random random = new Random();
        for (int i = 0; i < arrayOfCoordinates.length; i++) {
            arrayOfCoordinates[i] = random.nextInt(50 + 1);
        }
        return arrayOfCoordinates;
    }

        public static Figures[] createArrayOfRandomFigures(int numbers) {
        Figures[] arrayOfRandomFigures = new Figures[numbers];
        for (int i = 0; i < arrayOfRandomFigures.length; i++) {
            int a = 2 + (int) (Math.random() * 3);
            if (a == 2) {
                arrayOfRandomFigures[i] = new Square("Square", createArrayOfRandomCoordinates(4), createArrayOfRandomCoordinates(4));
            }
            if (a == 3) {
                arrayOfRandomFigures[i] = new Square("Circle", createArrayOfRandomCoordinates(2), createArrayOfRandomCoordinates(2));
            }
            if (a == 4) {
                arrayOfRandomFigures[i] = new Square("Triangle",createArrayOfRandomCoordinates(3), createArrayOfRandomCoordinates(3));
            }
        }
            return arrayOfRandomFigures;
    }

    public static void sortFigures(Figures[] arrayOfRandomFigures) {
    Map<Double, String> mapWithFigures = new TreeMap<Double, String>();
        for (Figures currentFigure : arrayOfRandomFigures) {
        double area = (currentFigure).countedArea();
        mapWithFigures.put(area, currentFigure.getName());
    }
        for (Map.Entry<Double, String> entry : mapWithFigures.entrySet()) {
        System.out.println(entry.getValue() + ", S = " + entry.getKey());
    }
}

//    public static void createTreeMapOfFigures() {
//            TreeMap<Double, String> sortedArea = new TreeMap<Double, String>();
//
//            sortedArea.put(list[0].getArea(), list[0].getName());
//            sortedArea.put(list[1].getArea(), list[1].getName());
//            sortedArea.put(list[2].getArea(), list[2].getName());
//            sortedArea.put(list[3].getArea(), list[3].getName());
//            sortedArea.put(list[4].getArea(), list[4].getName());
//            sortedArea.put(list[5].getArea(), list[5].getName());
//            sortedArea.put(list[6].getArea(), list[6].getName());
//            sortedArea.put(list[7].getArea(), list[7].getName());
//            sortedArea.put(list[8].getArea(), list[8].getName());
//            sortedArea.put(list[9].getArea(), list[9].getName());
//
////            for (Map.Entry m : sortedArea.entrySet()) {
////                System.out.println(m.getValue() + " " + m.getKey());
////            }
//            System.out.println(sortedArea);
//        }


    }

