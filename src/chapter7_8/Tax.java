package chapter7_8;

public class Tax {
    private final int number;
    private final String name;
    private final int shotoku;

    public Tax(int number, String name, int shotoku, int koujo) {
        this.number = number;
        this.name = name;
        this.shotoku = shotoku;
        this.koujo = koujo;
    }
    public int zeigaku() {

        return (int) ((shotoku - koujo) * 0.1);
    }
    private final int koujo;

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getShotoku() {
        return shotoku;
    }

    public int getKoujo() {
        return koujo;
    }


}