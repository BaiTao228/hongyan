package smallStory;

import java.util.*;

public class main extends MyException {
    public static void main(String[] args) {
        Character character = new Character(){};
        yunXing yunXing = new yunXing() {
        };
        System.out.println("《取钱记》");
        System.out.println("输入您的名字：");
        Scanner scanner1 = new Scanner(System.in);
        character.setName(scanner1.nextLine());
        System.out.println("输入您的年龄：");
        Scanner scanner2 = new Scanner(System.in);
        int i = scanner2.nextInt();
        try {
            if (i < 16 && i >= 0) {
                System.out.println("你的年龄还小，还没有银行卡呢，不能取钱噢！");
            } else if (i >= 16) {
                character.setAge(i);
                System.out.println("年龄设置成功！");
            }
        } catch (InputMismatchException e1) {
            System.out.println("输入的年龄不为数字！");
            System.exit(0);
        }
        if (i >= 16) {
            System.out.println("请选择天气：");
            yunXing.weather();
            Scanner scanner3 = new Scanner(System.in);
            int j = scanner3.nextInt();
            try {
                if (1 == 1) {
                    switch (j) {
                        case 1: {
                            System.out.println("你选择了[晴朗]");
                            break;
                        }
                        case 2: {
                            System.out.println("你选择了[下雨]");
                            break;
                        }
                        case 3: {
                            System.out.println("你选择了[多云]");
                            break;
                        }
                        default:
                            throw new MyException() {
                            };
                    }
                }
            } catch (MyException e) {
                System.out.println("选择天气异常！\n*程序结束*");
                System.exit(0);
            } catch (Exception e1) {
                System.out.println("异常!" + e1.getMessage());
                System.exit(0);
            }
            System.out.println("输入您的学号[10位]：");
            Scanner scanner4 = new Scanner(System.in);
            String s = scanner4.nextLine();
            int[] studyNumber = new int[10];
            int[] passWord = new int[6];
            for (int k = 0; k <= 9; k++) {
                String c = s.substring(k, k + 1);
                int C = Integer.parseInt(c);
                studyNumber[k] = C;
            }
            System.out.println("输入您的密码：（学号后6位）");
            Scanner scanner5 = new Scanner(System.in);
            String s1 = scanner5.nextLine();
            for (int k = 0; k <= 5; k++) {
                String c = s1.substring(k, k + 1);
                int C = Integer.parseInt(c);
                passWord[k] = C;
            }
            int K = 0;
            for (int k = 4; k <= 9; k++) {
                if (studyNumber[k] == passWord[k - 4]) {
                    K++;
                }
            }
            if (K == 6) {
                System.out.println("密码正确！");
                System.out.println("您的余额为 "+character.yuE+" 元。");
            } else {
                System.out.println("密码错误！");
            }
            yunXing.withdraw();
            Scanner scanner6 = new Scanner(System.in);
            int s2 = scanner6.nextInt();
            yunXing.withdraw(s2);
            character.yuE(s2);
            System.out.println("是否查询余额：（0否/1是）");
            Scanner scanner7 = new Scanner(System.in);
            int s3 = scanner7.nextInt();
            if(s3 ==1){
                character.search();
            }
            else if (s3==0){
                yunXing.over();
                System.exit(0);
            }
            yunXing.over();
        }
    }
}


