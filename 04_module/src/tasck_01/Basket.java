package tasck_01;

public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0;

    private static int basketCount = 0;

    private static class AllBaskets {
        static int totalCost;
        static int totalProducts;
        static int averagePrice;
        static int averageCost;
    }

    public Basket() {
        increaseCount(1);
        basketCount = basketCount + 1;
        items = "Список товаров:";
        this.limit = 10000;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public void add(String name, int price) {
        add(name, price, 1);
        AllBaskets.totalProducts += count;
        AllBaskets.totalCost += price * count;
        AllBaskets.averageCost = AllBaskets.totalCost / basketCount;
        AllBaskets.averagePrice = AllBaskets.totalCost / AllBaskets.totalProducts;
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
        AllBaskets.totalProducts += count;
        AllBaskets.totalCost += price * count;
        AllBaskets.averageCost = AllBaskets.totalCost / basketCount;
        AllBaskets.averagePrice = AllBaskets.totalCost / AllBaskets.totalProducts;
    }

    public static int getItemCountForAllBaskets() {
        return AllBaskets.totalProducts;
    }

    public static int getCostForAllBaskets() {
        return AllBaskets.totalCost;
    }

    public static int getAverageCostForAllBaskets() {
        return AllBaskets.averageCost;
    }

    public static int getAveragePriceForAllBaskets() {
        return AllBaskets.averagePrice;
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
        AllBaskets.totalProducts += count;
        AllBaskets.totalCost += price * count;
        AllBaskets.averageCost = AllBaskets.totalCost / basketCount;
        AllBaskets.averagePrice = AllBaskets.totalCost / AllBaskets.totalProducts;
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
            System.out.println("Общее количество всех товаров - " + Basket.getItemCountForAllBaskets());
            System.out.println("Общаа стоисмость всех товаров - " + Basket.getCostForAllBaskets());
            System.out.println();
            System.out.println("Общее количество корзин - " + basketCount);
            System.out.println("Средняя стоимость корзины  - " + Basket.getAverageCostForAllBaskets());
            System.out.println("Средняя цена товара - " + Basket.getAveragePriceForAllBaskets());
            System.out.println();
        }
    }

}
