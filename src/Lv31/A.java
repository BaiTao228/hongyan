package Lv31;

public interface A{
    public double area();
    double PI = 3.14;
}

       interface B{
    public void setColor(String C);
}

interface C extends A,B{
    void volume();
}