package com.budget;

public class Chapter {

    private static int id;
    private String name;

    public Chapter() {

    }

    public static void setId(int id) {
        Chapter.id = id;
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + " ID: " + getId() + " NAME: " +getName() ;
    }
}
