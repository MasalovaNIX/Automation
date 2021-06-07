package com.autoSchoolPartFiveAndTwo;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {

    public static void main(String[] args) throws IOException, ParseException {

        taskOne();
        taskTwo();
        Cat.taskThree();
        taskFour();
        taskFive();
        SixTask.sixTask();
        taskSeven();
        taskEight();
        taskNine();
        taskTen();
        taskEleven();
        taskTwelve();
        taskThirteen();
        taskFourteen();
        taskFifteen();
        taskSixteen();
        taskSeventeen();
    }

    public static void taskOne() throws IOException {
        System.out.println("Task 1");
        Set<String> set = new HashSet<String>();
        set.add("арбуз");
        set.add("банан");
        set.add("вишня");
        set.add("груша");
        set.add("дыня");
        set.add("ежевика");
        set.add("жень-шень");
        set.add("земляника");
        set.add("ирис");
        set.add("картофель");

        for (String text : set) {
            System.out.println(text);
        }

    }

    public static void taskTwo() throws IOException {
        System.out.println("Task 2");
        Set<String> set = new HashSet<String>();
        set.add("арбуз – ягода");
        set.add("банан – трава");
        set.add("вишня – ягода");
        set.add("груша – фрукт");
        set.add("дыня – овощ");
        set.add("ежевика – куст");
        set.add("жень-шень – корень");
        set.add("земляника – ягода");
        set.add("ирис – цветок");
        set.add("картофель – клубень");

        for (String text : set) {
            System.out.println(text);
        }

    }

    public static void taskFour() throws IOException {
        System.out.println("Task 4");
        System.out.println("Cписок ключей:");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name: A", " - 1st");
        map.put("Name: B", " - 2nd");
        map.put("Name: C", " - 3rd");
        map.put("Name: D", " - 4th");
        map.put("Name: E", " - 5th");
        map.put("Name: F", " - 6th");
        map.put("Name: G", " - 7th");
        map.put("Name: H", " - 8th");
        map.put("Name: I", " - 9th ");
        map.put("Name: J", "- 10th");

        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.printf(" %s  \n", item.getKey());
        }
    }

    public static void taskFive() throws IOException {
        System.out.println("Task 5");
        System.out.println("Cписок значений:");
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Name: A", " - 1st");
        map.put("Name: B", " - 2nd");
        map.put("Name: C", " - 3rd");
        map.put("Name: D", " - 4th");
        map.put("Name: E", " - 5th");
        map.put("Name: F", " - 6th");
        map.put("Name: G", " - 7th");
        map.put("Name: H", " - 8th");
        map.put("Name: I", " - 9th ");
        map.put("Name: J", "- 10th");

        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.printf(" %s  \n", item.getValue());
        }
    }

    public static void taskSeven() throws IOException {
        System.out.println("Task 7");
        List<String> list = new ArrayList<String>();
        list.add("Name: A");
        list.add("Name: B");
        list.add("Name: C");
        list.add("Name: D");
        list.add("Name: E");
        System.out.println("List size: " + list.size());
        for (String text : list) {
            System.out.println(text);
        }
    }

    public static void taskEight() throws IOException {
        System.out.println("Task 8");
        List<String> listOne = new ArrayList<String>();
        Scanner listTwo = new Scanner(System.in);
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            listOne.add(listTwo.nextLine());
        }
        int j = listOne.get(0).length();
        for (String stringMax : listOne)
            if (stringMax.length() > j)
                j = stringMax.length();
        for (String stringMax : listOne)
            if (stringMax.length() == j)
                System.out.println("Самая длинная строка: " + stringMax);
    }

    public static void taskNine() throws IOException {
        System.out.println("Task 9");
        List<String> listOne = new ArrayList<String>();
        Scanner listTwo = new Scanner(System.in);
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            listOne.add(listTwo.nextLine());
        }
        int j = listOne.get(0).length();
        for (String stringMin : listOne)
            if (stringMin.length() < j)
                j = stringMin.length();
        for (String stringMin : listOne)
            if (stringMin.length() == j)
                System.out.println("Самая короткая строка: " + stringMin);
    }

    public static void taskTen() throws IOException {
        System.out.println("Task 10");
        List<String> list = new ArrayList<String>();
        Scanner yourList = new Scanner(System.in);
        System.out.println("Enter ten strings:");
        for (int i = 0; i < 10; i++) {
            String s = yourList.nextLine();
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    public static void taskEleven() throws IOException {
        System.out.println("Task 11");
        List<String> list = new ArrayList<String>();
        Scanner yourList = new Scanner(System.in);
        System.out.println("Enter five strings:");
        for (int i = 0; i < 5; i++) {
            list.add(yourList.nextLine());
        }
        for (int i = 0; i < 13; i++) {
            String s = list.get(4);
            list.remove(4);
            list.add(0, s);
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    public static void taskTwelve() throws IOException {
        System.out.println("Task 12");
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            //так добавляет случайный символ, но он может повторяться(
            //Random r = new Random();
            //int c = r.nextInt(Short.MAX_VALUE * 2) + (byte) 'a';
            //set.add("Л" + (char) c);

            //так добавляется цифра
            set.add("Л" + i);
        }
        for (String text : set) {
            System.out.println(text);
        }
    }


    public static void taskThirteen() throws IOException {
        System.out.println("Task 13");
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            set.add(i);
        }
        System.out.println("Первоначальный сэт: ");
        System.out.println(set);
        System.out.println("Остались только числа меньше 10 и 10: ");
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            if (it.next() > 10) {
                it.remove();
            }
        }
        System.out.println(set);
    }

    public static void taskFourteen() throws IOException {
        System.out.println("Task 14");
        System.out.println(createHashMap());
        System.out.println("Проверяем фамилию Surname0 и имя Name0");
        Map<String, String> map = createHashMap();
        System.out.println("Имя повторяется " + countSameName((HashMap<String, String>) map, "Name0") + " раз/а.");
        System.out.println("Фамилия повторяется " + countSameSurname((HashMap<String, String>) map, "Surname0") + " раз/а.");
    }

    public static Map<String, String> createHashMap() {
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 9; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        map.put("Surname9", "Name0");
        return map;
    }

    public static int countSameName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int countSameSurname(HashMap<String, String> map, String surname) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String key = pair.getKey();
            if (key.equals(surname)) {
                count++;
            }
        }
        return count;
    }

    public static void taskFifteen() throws ParseException {
        System.out.println("Task 15");
        System.out.println("First map");
        Map<String, Date> map = createHashMapWithDate();
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println("Second map");
        Map<String, Date> mapTwo = createHashMapWithDate();
        sortedDayOfBirth((HashMap<String, Date>) map);
        for (Map.Entry<String, Date> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

    public static Map<String, Date> createHashMapWithDate() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMMM-dd");
        // я не смогла изменить формат, чтобы убрать секуды(...
        Map<String, Date> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put("Surname" + i, dateFormat.parse("2012-MAY-01"));
        }
        map.put("Surname9", dateFormat.parse("2012-JUNE-01"));
        return map;
    }

    public static void sortedDayOfBirth(HashMap<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int rad = value.getMonth();
            if (rad == 5 || rad == 6 || rad == 7)
                iterator.remove();
        }

    }

    public static void taskSixteen() {
        System.out.println("Task 16");
        System.out.println("First map");
        Map<String, String> map = createHashMapWithName();
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
        System.out.println("Second map");
        Map<String, String> mapTwo = createHashMapWithName();
        sortedName((HashMap<String, String>) map, "Name0");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }

    public static Map<String, String> createHashMapWithName() {
        Map<String, String> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        map.put("Surname9", "Name0");
        return map;
    }

    public static void sortedName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> pair = iterator.next();
            String value = pair.getValue();
            if (value.equals(name)) {
                iterator.remove();
            }
        }
    }

    public static void taskSeventeen() {
        System.out.println("Task 17");
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < 7; i++) {
            map.put("Surname" + i, "Name" + i);
        }
        map.put("Surname7", "Name0");
        map.put("Surname0", "Name7");
        map.put("Surname0", "Name0");
        for (Map.Entry<String, String> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}












