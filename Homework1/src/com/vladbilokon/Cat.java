package com.vladbilokon;

public class Cat {

    private String name = "Barsik";
    private double weight = 4.5;
    private int age = 7;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

    public void meow(){
        System.out.println("Meoooow!");
    }

    @Override
    public String toString() {
        return "Cat [Name: " + name + ", age: " + age + ", weight: " + weight + "]";
    }
}
