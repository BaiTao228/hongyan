package pokerBox;

import java.util.Random;

public class game {
    public static void main(String[] args) {
        pokerBox newplay = new pokerBox();
        for (int i = 0; i <=3 ; i++) {
            for (int j = 0; j <=12 ; j++) {
                if(i==0||i==2) {
                    System.err.println("[" + newplay.style(i) + "  " + newplay.number(j) + "]");
                }
                else {
                    System.out.println("[" + newplay.style(i) + "  " + newplay.number(j) + "]");
                }
            }
        }
        for (int j = 13; j <=14; j++) {
            if(j==13) {
                System.out.println("[" + newplay.number(j) + "]");
            }
            else {
                System.err.println("[" + newplay.number(j) + "]");
            }
        }
        Random random = new Random();
        int pickedNumber = random.nextInt(12);
        System.out.println(pickedNumber);
    }
}
