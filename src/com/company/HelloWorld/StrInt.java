package com.company.HelloWorld;

import java.util.Scanner;

public class StrInt {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String a = scanner.nextLine();
    int b = a.length();
    int array[] = new int [(b+1)/2];
        for(int i=0,j=0;i<=b;i+=2,j++) {
        String c = a.substring(i,i+1);
        int C = Integer.parseInt(c);
        array[j] = C;
        }
    }
}
