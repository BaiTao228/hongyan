package demo;

public class Canteen {
    public void welcome() {
        System.out.println("欢迎光临红高粱餐厅，这是今天的菜品：");
    }

    public void menu() {
        String[] 菜单 = {"1.糖醋里脊", "2.韭菜炒蛋", "3.鱼香肉丝", "4.干锅土豆片", "5.干锅千叶豆腐"};
        for (int i = 0; i <= 4; i++) {
            System.out.println(菜单[i] + " " + money(i + 1) + " 元");
        }
    }
    public String menu(int i) {
        String[] 菜单 = {"1.糖醋里脊", "2.韭菜炒蛋", "3.鱼香肉丝", "4.干锅土豆片", "5.干锅千叶豆腐"};
       return 菜单[i-1];
    }
    public int money(int i) {
        int Money[] = {0, 18, 12, 15, 18, 18};
        return Money[i];
    }

    public int pay1(int x, int array[]) {
        int sum = 0;
        for (int i = 0; i <= (x - 1) / 2; i++) {
            sum = money(array[i]) + sum;
        }
        return sum;
    }

    public int pay2(int y, int array1[], int sum) {
        int sum1 = sum;
        for (int i = 0; i <= (y - 1) / 2; i++) {
            sum1 = money(array1[i]) + sum1;
        }
        System.out.println("共计 " + sum1 + " 元");
        return sum1;
    }

    public void 提示语1() {
        System.out.println("请输入想要点的菜的序号（空格键分割，回车结束）");
    }

    public void 提示语2() {
        System.out.println("还有需要点的菜吗？");
    }

    public void 提示语3(int x,int array[], int y,int array1[]) {
        System.out.println("你一共选择了：");
        for (int i = 0; i <=(x-1)/2 ; i++) {
            System.out.println(menu(array[i]));
        }
        for (int i = 0; i <=(y-1)/2 ; i++) {
            System.out.println(menu(array1[i]));
        }
    }

    public void 提示语4() {
        System.out.println("请选择付款方式：");
        String 付款 [] = {"1.人脸识别","2.支付宝","3.微信"};
        for (int j = 0; j <=2 ; j++) {
            System.out.println(付款[j]);
        }
    }

    public void 提示语5(int j) {
        if(j==2||j==3) {
            System.out.println("请出示付款码------" +
                    "di~~~~支付成功！");
        }
        else {
            System.out.println("请看摄像头------");
        }
    }
    public void 提示语6(){
        System.out.println("祝你用餐愉快，欢迎下次光临！");
    }
}
