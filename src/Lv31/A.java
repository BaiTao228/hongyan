package Lv31;

public abstract interface A {
    abstract double area();

    double PI = 3.14;
}

interface B {
    String setColor(String C);
}

interface C extends A, B {
    double volume();
}