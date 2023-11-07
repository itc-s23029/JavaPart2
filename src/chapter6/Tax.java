package chapter6;

public class Tax {
    private int unmber;  //納税者番号
    private String name; //氏名
    private int shotoku; //取得額
    private int koujo;   //控除額

    public Tax(int unmber, String name, int shotoku, int koujo) {
        this.unmber = unmber;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }

    public int zeigaku(){
        return (int) ((shotoku - koujo)* 0.1);
    }
}
