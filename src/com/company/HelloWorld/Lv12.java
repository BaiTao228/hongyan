public class Lv12 {
    public static void main(String[] args) {
        DrawFunctionTool drawFunctionTool = new DrawFunctionTool();
        drawFunctionTool.drawFunction("y=x^2");
    }
}
class DrawFunctionTool {
    public void drawFunction(String function) {
        char a = '*';
        int array1[][] = new int[100][100];
        for (int y = 0; y <=10; y++) {
            for (int x = 0; x <=100; x++) {
                if (x-10 == -y) {
                    array1[y][x] = a;
                    System.out.print((char) array1[y][x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("y=x");
        System.out.println("-------------------------------------------------------------------------------------------");
        int array[][] = new int[50][50];
        for (int y = 0; y <= 25; y++) {
            for (int x = 0; x <= 50; x++) {
                if ((x * (x - 10)) == -y) {
                    array[y][x] = a;
                    System.out.print((char) array[y][x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println(function);
        System.out.println("-------------------------------------------------------------------------------------------");
        int array2[][] = new int[50][50];
        for (int y = 0; y <= 10; y++) {
            for (int x = 0; x <= 50; x++) {
                if ((y-5)*(y-5) == x) {
                    array2[y][x] = a;
                    System.out.print((char) array2[y][x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("y^2=x");
        System.out.println("-------------------------------------------------------------------------------------------");
        int array3[][] = new int[100][100];
        for (int y = 0; y <= 10; y++) {
            for (int x = 0; x <= 10; x++) {
                if (x*x*x == y) {
                    array3[y][x] = a;
                    System.out.print((char) array3[y][x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("y=x^3");
        System.out.println("-------------------------------------------------------------------------------------------");
        int array4[][] = new int[100][100];
        for (int y = 0; y <= 9; y++) {
            for (int x = 0; x <= 10; x++) {
                if ((x-4)*(x-5)+(y-5)*(y-2) == 10) {
                    array4[y][x] = a;
                    System.out.print((char) array4[y][x]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println("x*x+y*y=1");
    }
}
