package com.alfa.work3;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    public Triangle(String color, double a, double b, double c) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() +
                " a=" + a +
                ", b=" + b +
                ", c=" + c +
                ';';
    }

    @Override
    public double calcArea() {

        if(a + b > c|| b + c > a|| a + c > b) {
            return Math.sqrt(((a+b+c)/2)*(((a+b+c)/2)-a)*(((a+b+c)/2)-b)*(((a+b+c)/2)-c));

        }  else {

            return 0.0;
            //System.out.println("Wrong triangle");

        }

    }

    @Override
    public String draw() {
        return this.toString();
    }

    public static Shape parseTriangle(String string) {

        String[] words = string.split(":");
        String color = words[1];
        String sides = words[2];
        double a1 = Double.parseDouble(sides.split(",")[0]);
        double b1 = Double.parseDouble(sides.split(",")[1]);
        double c1 = Double.parseDouble(sides.split(",")[2]);
        return new Triangle(color, a1, b1, c1);
    }
}
