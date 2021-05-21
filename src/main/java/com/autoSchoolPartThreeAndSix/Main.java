package com.autoSchoolPartThreeAndSix;
import java.util.TreeMap;
import java.util.*;
import com.autoSchoolPartThreeAndSix.figure.*;


public class Main {

    public static void main(String[] args) {

        System.out.println("Массив фигур отсортирован в порядке возрастания площади:");
        createTreeMapOfFigures();
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
                arrayOfRandomFigures[i] = new Circle("Circle", createArrayOfRandomCoordinates(2), createArrayOfRandomCoordinates(2));
            }
            if (a == 4) {
                arrayOfRandomFigures[i] = new Triangle("Triangle", createArrayOfRandomCoordinates(3), createArrayOfRandomCoordinates(3));
            }
        }
        return arrayOfRandomFigures;
    }

    public static void createTreeMapOfFigures() {
        TreeMap<Double, String> sortedArea = new TreeMap<Double, String>();

        Figures[] arrayForSort = createArrayOfRandomFigures(10);

        for (int i = 0; i < arrayForSort.length; i++) {

            sortedArea.put(arrayForSort[i].countArea(arrayForSort[i].getArrayX(), arrayForSort[i].getArrayY()), arrayForSort[i].getName());
        }
        for (Map.Entry m : sortedArea.entrySet()) {
            System.out.println(m.getValue() + " " + m.getKey());
        }
    }
}



