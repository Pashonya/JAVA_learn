package tasck_06;

public class Product {



    private final String name;
    private int price;
    private int barCode;

    public Product(String name) {
        this.name = name;

    }
    public int getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString () {
        return name + " - " + price;
    }

}
