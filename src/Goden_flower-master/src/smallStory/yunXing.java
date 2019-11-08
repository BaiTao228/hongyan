package smallStory;

import java.util.ArrayList;

abstract public class yunXing implements Others {
    Character character1= new Character();

    public void weather() {
        ArrayList list1 = new ArrayList();
        list1.add("晴朗");
        list1.add("下雨");
        list1.add("多云");
        for (int i = 0; i <=2 ; i++) {
            System.out.println(i+1+"."+list1.get(i));
        }
    }
    public void withdraw(){
        System.out.println("输入取钱金额：");
    };
    public int withdraw(int money){
        System.out.println("您取了 "+money+" 元！");
        return money;
    }
    public void over(){
        System.out.println("交易成功！请取走您的银行卡，欢迎下次光临！");
    }
}
