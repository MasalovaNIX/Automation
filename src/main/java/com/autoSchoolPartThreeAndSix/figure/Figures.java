package com.autoSchoolPartThreeAndSix.figure;


public abstract class Figures {
    private String name;
    private int[] arrayX;
    private int[] arrayY;

    public Figures(String name, int[] arrayX, int[] arrayY) {
        this.name = name;
        this.arrayX = arrayX;
        this.arrayY = arrayY;
    }

    public abstract double countArea(int[] arrayX, int[] arrayY);

    public void setName(String name) {
        this.name = name;
    }

    public void setArrayX(int[] arrayX) {
        this.arrayX = arrayX;
    }

    public void setArrayY(int[] arrayY) {
        this.arrayY = arrayY;
    }

    public int[] getArrayX() {
        return arrayX;
    }

    public int[] getArrayY() {
        return arrayY;
    }

    public String getName() {
        return name;
    }

}


