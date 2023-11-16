package exercise;

public class Product {
    private int number;
    private int prine;
    private String name;

    public Product(int number, int prine, String name){
        this.number = number;
        this.prine = prine;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getPrine() {
        return prine;
    }

    public void setPrine(int prine) {
        this.prine = prine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "number=" + number +
                ", prine=" + prine +
                ", name='" + name + '\'' +
                '}';
    }
}
