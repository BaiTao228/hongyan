package pokerBox;

public class pokerBox {
    public String style(int i){
        String Style[] = {"♠","♣","♥","♦"};
        return Style[i];
    }
    public String number(int i){
       String Number[] = {"3","4","5","6","7","8","9","10","J","Q","K","A","2","smallKing","bigKing"};
       return Number[i];
    }
}
