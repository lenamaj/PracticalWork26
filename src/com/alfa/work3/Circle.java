package com.alfa.work3;

public class Circle extends Shape{

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return super.toString() +
                " radius=" + radius +
                ';';
    }

    @Override
    public double calcArea() {
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String draw() {
        return this.toString();

    }

    public static Shape parseCircle(String string) {

        String[] words = string.split(":");
        String color = words[1];
        String sides = words[2];
        return new Circle(color, Double.parseDouble(sides));
    }


}
