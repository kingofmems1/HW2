package com.company;

public class Daughter extends Parent{
    public Daughter(String name, int age, String surname) {
        super(name, age, surname);
    }

    @Override
    public void print() {
        System.out.println("Name: " + getName() +
                " Age: " + getAge() +
                " Surname: " + getSurname());
    }
}
