package com.autoSchoolPartFiveAndFour;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {

        List<String> list = new ArrayList<String>();
        for (int i = 0; i <= 50; i++) {
            list.add("Л" + i);
        }
        list.add("Add");
        list.add("B");
        list.add("C");
        list.add("Dd");
        list.add("");
        list.add("");
        list.add("Лdddd");

        System.out.println("Длина каждого элемента списка:");
        list.stream().forEach(elem -> System.out.println(elem.length()));

        System.out.println("Не пустые элементы списка,не содержащие символ d:");
        list = list.stream().filter((s) -> !s.contains("d") && !s.trim().isEmpty()).collect(Collectors.toList());
        System.out.println(list);

        System.out.println("Элементы списка в алфавитном порядке:");
        list.stream().sorted().forEach(System.out::println);
    }
}
