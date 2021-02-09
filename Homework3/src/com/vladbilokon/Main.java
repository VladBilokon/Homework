package com.vladbilokon;

public class Main {

    public static void main(String[] args) {

        Vector3d vect = new Vector3d(1, 3, -3, 2, 4, 5);
        System.out.println(vect.toString());

        Vector3d vect2 = new Vector3d();
        vect2.setACoordinates(2, 4, 6);
        vect2.setBCoordinates(-1, 2, 8);
        System.out.println(vect2.toString());
    }
}
