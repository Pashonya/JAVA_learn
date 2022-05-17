package tasck_01;

public class Main {

    public static void main(String[] args) {
        Basket pasha = new Basket();
        pasha.add("Масло", 140, 1,0.5);
        pasha.add("Молоко", 100);
        pasha.add("Колбаска", 250, 2, 0.25);
        pasha.print("Корзина Паши:");
    }
}