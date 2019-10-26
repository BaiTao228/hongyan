package test;
public class Customer implements Notify{
        long phoneNum=1234567;
        @Override
        public void call(){
        System.out.println("打电话给"+phoneNum+"通知到货了");
        }

        public void goShopping(){
        System.out.println("出门购物");
        }
}
