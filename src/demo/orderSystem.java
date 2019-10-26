package demo;

import java.util.Scanner;

public class orderSystem {
    public static void main(String[] args) {
        Canteen chi = new Canteen();//                新建对象
        chi.welcome();
        chi.menu();//                                 第一次点餐
        chi.提示语1();
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int x = a.length();
        int array[] = new int[(x + 1) / 2];
        for (int i = 0, j = 0; i <= x; i += 2, j++) {
            String c = a.substring(i, i + 1);
            int C = Integer.parseInt(c);
            array[j] = C;
        }
        chi.pay1(x, array);
        chi.提示语2();
        chi.menu();//                                 第二次点餐
        chi.提示语1();
        Scanner scanner1 = new Scanner(System.in);
        String b = scanner1.nextLine();
        int y = b.length();
        int array1[] = new int[(y + 1) / 2];
        for (int i = 0, j = 0; i <= y; i += 2, j++) {
            String c = b.substring(i, i + 1);
            int C = Integer.parseInt(c);
            array1[j] = C;
        }
        chi.pay2( y ,array1,chi.pay1(x,array));
        chi.提示语3(x,array,y,array1);
        chi.提示语4();//                                询问支付方式
        Scanner scanner2 = new Scanner(System.in);
        String c = scanner2.nextLine();
        String d = c.substring(0, 1);
        int D = Integer.parseInt(d);
        chi.提示语5(D);
        chi.提示语6();//                                 点餐结束
    }
}
