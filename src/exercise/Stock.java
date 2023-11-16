package exercise;

public class Stock {
    private final Product product;
    private final int number;
    public Stock(Product product, int number){
        this.product = new Product(product.getNumber(), product.getPrine(), product.getName());
        this.number = number;
    }

    public Product getProduct() {
        return product;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "product=" + product +
                ", number=" + number +
                '}';
    }
}
