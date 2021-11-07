package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Son_1").print();
        createObject("Son_2").print();
        createObject("Daughter").print();
    }

    public static Parent createObject(String className){
        switch (className) {
            case "Son_1":
                Son_1 olderSon = new Son_1("John", 13, "Robinson");
                return olderSon;
            case "Son_2":
                Son_2 lilSon = new Son_2("Clark", 9, "Robinson");
                return lilSon;
            case "Daughter" :
                Daughter tochter = new Daughter("Lizzy", 5, "Robinson");
                return tochter;
        }
        return null;
    }


}
