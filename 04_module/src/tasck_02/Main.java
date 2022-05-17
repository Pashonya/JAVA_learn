package tasck_02;

public class Main {
    public static void main(String[] args) {
        Arithmetic top = new Arithmetic(100,50);
        System.out.println("Сумма чисел равна: " + top.sum());
        System.out.println("Произведение чисел равно: " + top.multiplication());
        System.out.println("Максимальное число равно: " + top.max());
        System.out.println("Минимальное число равно: " + top.min());
    }
}
