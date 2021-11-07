package com.company;

public class Son_1 extends Parent{
    public Son_1(String name, int age, String surname) {
        super(name, age, surname);
    }


    @Override
    public void print() {
        System.out.println("Name: " + getName() +
        " Age: " + getAge() +
                " Surname: " + getSurname());
    }
}
