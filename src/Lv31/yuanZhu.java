package Lv31;

import java.sql.SQLOutput;
import java.util.Scanner;

public class yuanZhu {
    public static void main(String[] args) {
        int array[] = new int[2];
        System.out.println("请依次输入该圆柱体底面半径，高（回车再输入下一个）");
        for (int i = 0; i <= 1; i++) {
            Scanner scanner = new Scanner(System.in);
            String a = scanner.nextLine();
            int A = Integer.parseInt(a);
            array[i] = A;
        }
        System.out.println("输入该圆柱体颜色：");
        Scanner scanner1 = new Scanner(System.in);
        String A = scanner1.nextLine();
        Cylinder cylinder = new Cylinder(array[0], array[1]) {
            @Override
            public String setColor(String A) {
                this.color = A;
                return this.color;
            }

            @Override
            public double volume() {
                double volume = a.PI * radius * radius * height;
                return volume;
            }

            @Override
            public double area() {
                double area = 2 * a.PI * radius * radius + 2 * a.PI * radius * height;
                return area;
            }

        };
        System.out.println("这是一个" + A + "的圆柱体,它的area = " + cylinder.area() + ",volume = " + cylinder.volume());
    }
}
