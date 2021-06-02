package com.alfa.work3;

public class Rectangle extends Shape implements Cloneable{

    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    public Rectangle(Rectangle other){
        super(other.getColor());
        this.width = other.getWidth();
        this.height = other.getHeight();
    }

    @Override
    public String toString() {
        return super.toString() +
                " width=" + width +
                ", height=" + height +
                ';';
    }

    @Override
    public double calcArea() {
        return this.height*this.width;
    }

    @Override
    public String draw() {
        return this.toString();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static Shape parseRectangle(String string) {

        String[] words = string.split(":");
        String color = words[1];
        String sides = words[2];
        double a = Double.parseDouble(sides.split(",")[0]);
        double b = Double.parseDouble(sides.split(",")[1]);
        return new Rectangle(color, a, b);

    }
}
