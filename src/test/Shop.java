package test;
    public class Shop{
        private Notify notify;

        public void registrationNoticeMethod(Notify notify){
        this.notify=notify;
        }

        public void tellCustomerOutOfStock(){
        System.out.println("对不起，我们这没有货了");
        }

        public void arrivalNotice(){
            if(notify!=null){
        notify.call();
            }
        }
}