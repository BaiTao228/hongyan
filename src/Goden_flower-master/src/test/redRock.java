package test;

import java.util.ArrayList;
import java.util.Scanner;

public class redRock {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            list.add(a);
        }
        System.out.println(list.get(0)+list.get(1));
        System.out.println(list);
    }
}
