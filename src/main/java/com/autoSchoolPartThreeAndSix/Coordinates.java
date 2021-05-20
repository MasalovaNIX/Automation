package com.autoSchoolPartThreeAndSix;
import java.util.Random;

public class Coordinates {

    static int[] arrayX;
    static int[] arrayY;
    private static int i;
    static int points;

    public static int[] getArray(int points) { // тут мне подсказали сделать массив с параметром, но зато теперь я знаю
                                            // я же делала массивы по 4 координаты, а в формулы брала нужное кол-во только

        int[] arrayX = new int[points];
        Random random = new Random();
        for (int i = 0; i < arrayX.length; i++) {
            arrayX[i] = random.nextInt(50 + 1);
        }
        return arrayX;
    }
}
