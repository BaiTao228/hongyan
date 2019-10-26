
import java.sql.SQLOutput;
import java.util.*;
public class Lv11 {
    public static void main(String[] args) {
        System.out.print("1.输入行：");
        Scanner scannerq = new Scanner(System.in),
                scannerw = new Scanner(System.in);
        int a = scannerq.nextInt();
        System.out.print("  输入列：");
        int b = scannerw.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------");
        int array1[][]= new int [a][b];
        System.out.println("请从左往右，从上至下输入第一个矩阵：");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <b ; j++) {
                Scanner in = new Scanner(System.in);
                int c = in.nextInt();
                 array1[i][j] = c;
            }
        }
        System.out.print("2.输入行：");
        Scanner scannere = new Scanner(System.in),
                scannerr = new Scanner(System.in);
        int A = scannere.nextInt();
        System.out.print("  输入列：");
        int B = scannerr.nextInt();
        System.out.println("-------------------------------------------------------------------------------------------------");
        int array2[][]= new int [A][B];
        System.out.println("请从左往右，从上至下输入第二个矩阵：");
        for (int i = 0; i <A ; i++) {
            for (int j = 0; j <B ; j++) {
                Scanner in = new Scanner(System.in);
                int C = in.nextInt();
                array2[i][j] = C;
            }
        }
        int array3[][] =new int[a][B];
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <B ; j++) {
                int sum = 0;
                for (int k = 0;k<b;k++){
                    sum = array1[i][k]*array2[k][j]+sum;
                }
                    array3[i][j]=sum;
            }
        }
        System.out.println("这两个矩阵的乘积为：");
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <B ; j++) {
                    int k = array3[i][j];
                    System.out.print(" "+k);
            }
            System.out.println();
        }
    }
}
