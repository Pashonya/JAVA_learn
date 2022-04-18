package task_01;


public class Main {
    public static void main(String[] args) {
        int milkAmount = 2; // ml
        int powderAmount = 2; // g
        int eggsCount = 0; // items
        int sugarAmount = 30; // g
        int oilAmount = 50; // ml
        int appleCount = 6;

        int appleJuiceRequired = 5;

        // Example
        // appleCount - 5
        boolean enoughApple = (appleCount >= appleJuiceRequired);

        if (enoughApple){
            System.out.println("Яблочный сок");
        } if (!enoughApple) {
            System.out.println("Яблочный сок не приготовить. Нехватает яблок");
        }
//powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        int powderPancakesRequired = 400;
        int sugarPancakesRequired = 10;
        int milkPancakesRequired = 1000;
        int oilPancakesRequired = 30;

        boolean enoughPowder = (powderAmount >= powderPancakesRequired);
        boolean enoughSugar = (sugarAmount >= sugarPancakesRequired);
        boolean enoughMilk = (milkAmount >= milkPancakesRequired);
        boolean enoughOil = (oilAmount >= oilPancakesRequired);

        boolean hasError = false;

        if (enoughPowder && enoughSugar && enoughMilk && enoughOil)
            hasError = true;

        //пудра проверка

        else if (!enoughPowder && enoughSugar && enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры");
            hasError = true;
        }

        else if (!enoughPowder && !enoughSugar && enoughMilk && enoughOil) {
                System.out.println("Блинчики не приготовить. Нехватает: пудры и сахара");
                hasError = true;
        }
        else if (!enoughPowder && !enoughSugar && !enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара и молока");
            hasError = true;
        }
        else if (!enoughPowder && !enoughSugar && !enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара, молока и масла");
            hasError = true;
        }
        else if (!enoughPowder && enoughSugar && !enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, молока и масла");
            hasError = true;
        }
        else if (!enoughPowder && !enoughSugar && enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара и масла");
            hasError = true;
        }
        else if (!enoughPowder && !enoughSugar && enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры и масла");
            hasError = true;
        }
        else if (!enoughPowder && enoughSugar && !enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры и молока");
            hasError = true;
        }

        //сахар проверка

        else if (enoughPowder && !enoughSugar && enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара");
            hasError = true;
        }
        else if (enoughPowder && !enoughSugar && !enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара и молока");
            hasError = true;
        }
        else if (enoughPowder && !enoughSugar && enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара и масла");
            hasError = true;
        }
        else if (enoughPowder && !enoughSugar && !enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара, молока и масла");
            hasError = true;
        }

        // молоко проверка

        else if (enoughPowder && enoughSugar && !enoughMilk && enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: молока");
            hasError = true;
        }
        else if (enoughPowder && enoughSugar && !enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: молока и масла");
            hasError = true;
        }

        // масло проверка

        else if (enoughPowder && enoughSugar && enoughMilk && !enoughOil) {
            System.out.println("Блинчики не приготовить. Нехватает: масла");
            hasError = true;
        }

        if (enoughPowder && enoughSugar && enoughMilk && enoughOil) {
            System.out.println("Блинчики");
        }

        int milkOmeletteRequired = 300;
        int powderOmeletteRequired = 5;
        int eggsOmeletteRequired = 5;

        if (milkAmount >= milkOmeletteRequired &&
                powderAmount >= powderOmeletteRequired &&
                eggsCount >= eggsOmeletteRequired) {

            //milk - 300 ml, powder - 5 g, eggs - 5
            System.out.println("Омлет");
        } else {
            System.out.println("Нехватает ингредиентов для омлета");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

        int applesApplePieRequired = 3;
        int milkApplePieRequired = 100;
        int powderApplePieRequired = 300;
        int eggsApplePieRequired = 4;

        if (appleCount >= applesApplePieRequired &&
                milkAmount >= milkApplePieRequired &&
                powderAmount >= powderApplePieRequired &&
                eggsCount >= eggsApplePieRequired) {
            System.out.println("Яблочный пирог");
        } else {
            System.out.println("Нехватает ингредиентов для яблочного пирога");
        }
    }
}