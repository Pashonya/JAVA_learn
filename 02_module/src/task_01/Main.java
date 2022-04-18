package task_01;


public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Система расчета стоимости топлива");

        int fuelType = 95;
        int amount = 420;

        double fuel92price = 60.2;
        double fuel95price = 67.33;

        double discount = 0.1;

        double fuelPrice = 0.0;
        int maxAmount = 400;

        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Указан неверный тип топлива");
        }

        if (amount > 10) {
            fuelPrice = fuelPrice - discount * fuelPrice;
        }

        if (amount < 1) {
            System.out.println("Слишком малое количество топлива");
            amount = 0;
        }
        if (amount > maxAmount) {
            System.out.println("Указанное количество топлива превышает максимально допустимое");
        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + " руб.");
        double totalPrice = fuelPrice * (double)amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + " руб.");
    }
}

