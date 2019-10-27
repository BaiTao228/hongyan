package Lv31;

import java.util.Scanner;

abstract class Cylinder implements C {
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    double radius, height;
    String color;
    public A a;

    public String setColor(String color) {
        this.color = color;
        return color;
    }
}

