package com.vladbilokon;

public class Main {

    public static void main(String[] args) {

        Cat catBarsik = new Cat();
        System.out.println(catBarsik.toString());

        Cat catAlyosha = new Cat();
        catAlyosha.setAge(2);
        catAlyosha.setName("Alyosha");
        catAlyosha.setWeight(3.2);
        System.out.println(catAlyosha.toString());

        Cat catNikolay = new Cat();
        catNikolay.setName("Nikolay");
        catNikolay.setAge(13);
        System.out.println(catNikolay.toString());

    }
}
