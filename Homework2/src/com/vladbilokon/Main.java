package com.vladbilokon;

public class Main {

    public static void main(String[] args) {

        Triangle t1 = new Triangle(3, 4, 5);
        System.out.println(t1.toString());

        Triangle t2 = new Triangle();
        t2.setA(10);
        t2.setB(10);
        t2.setC(10);
        System.out.println(t2.toString());

    }
}
