package smallStory;

 public class Character{
    int age;
    String name;
    int yuE =999999;

    public String setName(String name) {
        this.name = name;
        return name;
    }
    public int setAge(int age) {
        this.age = age;
        return age;
    }
    public void search(){
        System.out.println(name+age+"岁,"+yuE);
    }
    public int yuE(int withdraw){
        this.yuE = yuE-withdraw;
        return yuE;
    }
}
