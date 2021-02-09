package com.vladbilokon;

public class Triangle {

    private double a = 3;
    private double b = 4;
    private double c = 5;
    private double p;
    private double s;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle(){

    }

    public void setA(int a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public double square() {
        if (a + b > c && (a + c > b && b + c > a)) {
            p = (a + b + c) / 2;
            s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
        else{
            s = -1;
        }
        return s;
    }

    @Override
    public String toString() {
        return "Square of triangle [" + a + ", " + b + ", " + c + "] = " + square();
    }
}
