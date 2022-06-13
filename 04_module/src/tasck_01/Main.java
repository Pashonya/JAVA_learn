package tasck_01;

public class Main {

    public static void main(String[] args) {
        Basket pasha = new Basket();
        pasha.add("Масло", 140, 1,0.5);
        pasha.add("Молоко", 100,1, 0.5);
        pasha.add("Колбаска", 250, 2, 0.25);
        pasha.print("Корзина Паши:");

        Basket vika = new Basket();
        vika.add("Хлеб", 60, 1,0.5);
        vika.add("Колбаска", 250, 1, 0.25);
        vika.print("Корзина Вики:");
    }
}