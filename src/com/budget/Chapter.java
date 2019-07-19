package com.budget;

public class Chapter {

    private static int id;
    private String name;

    public Chapter() {
        id++;
    }

    public static int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
