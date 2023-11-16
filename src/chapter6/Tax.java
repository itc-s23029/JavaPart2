package chapter6;

import java.util.Objects;

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


    public int getUnmber() {
        return unmber;
    }

    public void setUnmber(int unmber) {
        this.unmber = unmber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public void setShotoku(int shotoku) {
        this.shotoku = shotoku;
        //if (koujo > this )
    }

    public int getKoujo() {
        return koujo;
    }

    public void setKoujo(int koujo) {
        if (shotoku < koujo) {
            this.koujo = shotoku;
        } else {
            this.koujo = koujo;
        }
    }

    @Override
    public String toString() {
        return "Tax{" +
                "unmber=" + unmber +
                ", name='" + name + '\'' +
                ", shotoku=" + shotoku +
                ", koujo=" + koujo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tax tax = (Tax) o;
        return unmber == tax.unmber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(unmber);
    }

    public int zeigaku(){

        return (int) ((shotoku - koujo)* 0.1);
    }
}
