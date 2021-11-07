package com.company;

public abstract class Parent implements Printable {
    private String name;
    private int age;
    private String surname;

    public Parent(String name, int age, String surname) {
        this.name = name;
        this.age = age;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }
}
