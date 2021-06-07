package com.autoSchoolPartFiveAndTwo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Cat {

    private String name;
    public Cat(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void taskThree() throws IOException {
        System.out.println("Task 3");
        HashMap<Cat, String> cats = new HashMap<Cat, String>();

        cats.put(new Cat("Name: A"), " - 1st cat ");
        cats.put(new Cat("Name: B"), " - 2nd cat: ");
        cats.put(new Cat("Name: C"), " - 3rd cat: ");
        cats.put(new Cat("Name: D"), " - 4th cat: ");
        cats.put(new Cat("Name: E"), " - 5th cat: ");
        cats.put(new Cat("Name: F"), " - 6th cat: ");
        cats.put(new Cat("Name: G"), " - 7th cat: ");
        cats.put(new Cat("Name: H"), " - 8th cat: ");
        cats.put(new Cat("Name: I"), " - 9th cat: ");
        cats.put(new Cat("Name: J"), " - 10th cat: ");

        for (Map.Entry<Cat, String> item : cats.entrySet()) {
            System.out.printf(" %s   %s \n", item.getKey().getName(), item.getValue());
        }
    }
}
