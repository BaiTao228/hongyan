package test;

public class Main {
    public static void main(String[] args) {
//实例化对象
        Customer customer = new Customer();
        Shop shop = new Shop();
//顾客出门购物
        customer.goShopping();
        shop.tellCustomerOutOfStock();
        shop.registrationNoticeMethod(customer);
//第二天到货了
        System.out.println("第二天");
        shop.arrivalNotice();
    }
}

