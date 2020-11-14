package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Van").print();
        createObject("Bicycle").print();
        createObject("Car").print();
    }

    public static Printable createObject(String className) {
        Printable printable = null;
        switch (className) {
            case "Van":
                printable = new Van(3.5, 2015);
                break;
            case "Car":
                printable = new Car(4.5, "coupe");
                break;
            case "Bicycle":
                printable = new Bicycle(0.0, 27);
                break;
        }
        ;
        return printable;
    }
}