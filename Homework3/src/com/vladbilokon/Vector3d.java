package com.vladbilokon;

public class Vector3d {

    private double aX;
    private double aY;
    private double aZ;
    private double bX;
    private double bY;
    private double bZ;
    private double aLength;
    private double bLength;
    private double i;
    private double j;
    private double k;
    private double scalar;
    private String vector;

    public Vector3d(double aX, double aY,double aZ, double bX, double bY, double bZ){
        this.aX = aX;
        this.aY = aY;
        this.aZ = aZ;
        this.bX = bX;
        this.bY = bY;
        this.bZ = bZ;
    }

    public Vector3d(){

    }

    public void setACoordinates(double aX, double aY, double aZ){
        this.aX = aX;
        this.aY = aY;
        this.aZ = aZ;
    }

    public void setBCoordinates(double bX, double bY, double bZ){
        this.bX = bX;
        this.bY = bY;
        this.bZ = bZ;
    }

    public void setAX(double aX) {
        this.aX = aX;
    }

    public double getAX() {
        return aX;
    }

    public void setAY(double aY) {
        this.aY = aY;
    }

    public double getAY() {
        return aY;
    }

    public void setAZ(double aZ) {
        this.aZ = aZ;
    }

    public double getAZ() {
        return aZ;
    }

    public void setBX(double bX) {
        this.bX = bX;
    }

    public double getBX() {
        return bX;
    }

    public void setBY(double bY) {
        this.bY = bY;
    }

    public double getBY() {
        return bY;
    }

    public void setBZ(double bZ) {
        this.bZ = bZ;
    }

    public double getBZ() {
        return bZ;
    }

    public double vectorALength(){
        aLength = Math.sqrt(aX*aX + aY*aY + aZ*aZ);
        return aLength;
    }

    public double vectorBLength(){
        bLength = Math.sqrt(bX*bX + bY*bY + bZ*bZ);
        return bLength;
    }

    public double getScalar(){
        scalar = aX*bX + aY*bY + aZ*bZ;
        return scalar;
    }

    public double getI() {
        i = aY*bZ - aZ*bY;
        return i;
    }

    public double getJ() {
        j = aZ*bX - aX*bZ;
        return j;
    }

    public double getK() {
        k = aX*bY - aY*bX;
        return k;
    }

    public String getVector() {
        vector = "{" + getI() + "; " + getJ() + "; " + getK() + "}";
        return vector;
    }

    @Override
    public String toString() {
        return "[ Vector product: " + getVector() + "; Scalar product: " + getScalar() + " ]";
    }
}
