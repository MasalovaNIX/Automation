package com.autoSchoolPartFiveAndTwo;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SixTask {

        private String number;
        public SixTask(String number) {
            this.number = number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getNumber() {
            return number;
        }

        public static void sixTask() throws IOException {
            System.out.println("Task 6");
            HashMap<String, SixTask> cats = new HashMap<String, SixTask>();

            cats.put("Name: A", new SixTask("8kg"));
            cats.put("Name: B", new SixTask("4kg"));
            cats.put("Name: D", new SixTask("3kg"));
            cats.put("Name: E", new SixTask("9kg"));
            cats.put("Name: F", new SixTask("7kg"));
            cats.put("Name: G", new SixTask("5kg"));
            cats.put("Name: H, это самый пышный кот", new SixTask("11kg"));
            cats.put("Name: I", new SixTask("2kg"));
            cats.put("Name: J, это котенок", new SixTask("1kg"));
            cats.put("Name: C", new SixTask("6kg"));

            for (Map.Entry<String, SixTask> item : cats.entrySet()) {
                System.out.printf(" %s   %s \n", item.getKey(), item.getValue().getNumber());
            }
        }

    }
