package tasck_01;

public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 10000;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {

        if (!contains(name) && (totalPrice + count * price < limit)) {

            items = items + "\n" + name + " - " +
                    count + " шт. - " + price + " руб." + ", масса - ";
            totalPrice = totalPrice + count * price;
        } else {
            System.out.println("Error occured :(");
            return;
        }
    }

    public void add(String name, int price, int count, double weight) {

        if (!contains(name) && (totalPrice + count * price < limit)) {

            items = items + "\n" + name + " - " +
                    count + " шт. - " + price + " руб." + ", масса - " + weight + " кг";
            totalPrice = totalPrice + count * price;
            totalWeight = totalWeight + weight * count;
        } else {
            System.out.println("Error occured :(");
            return;
        }

    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
            System.out.println("Общий вес товаров: " + totalWeight + " кг");
        }
    }
}

