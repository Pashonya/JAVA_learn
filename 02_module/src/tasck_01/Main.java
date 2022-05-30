package tasck_01;


public class Main {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 500; // g
        int eggsCount = 20; // items
        int sugarAmount = 30; // g
        int oilAmount = 50; // ml
        int appleCount = 10;

        int appleJuiceRequired = 5;

        // Example
        // appleCount - 5
        boolean enoughApple = (appleCount >= appleJuiceRequired);

        if (enoughApple) {
            System.out.println("Яблочный сок");
        }
        if (!enoughApple) {
            System.out.println("Яблочный сок не приготовить. Нехватает яблок");
        }
//powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        int powderPancakesRequired = 400;
        int sugarPancakesRequired = 10;
        int milkPancakesRequired = 1000;
        int oilPancakesRequired = 30;

        boolean enoughPowderPancakes = (powderAmount >= powderPancakesRequired);
        boolean enoughSugarPancakes = (sugarAmount >= sugarPancakesRequired);
        boolean enoughMilkPancakes = (milkAmount >= milkPancakesRequired);
        boolean enoughOilPancakes = (oilAmount >= oilPancakesRequired);

        boolean hasErrorPancakes = false;

        if (enoughPowderPancakes && enoughSugarPancakes && enoughMilkPancakes && enoughOilPancakes)
            hasErrorPancakes = true;

            //пудра проверка

        else if (!enoughPowderPancakes && enoughSugarPancakes && enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && !enoughSugarPancakes && enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры и сахара");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && !enoughSugarPancakes && !enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара и молока");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && !enoughSugarPancakes && !enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара, молока и масла");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && enoughSugarPancakes && !enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, молока и масла");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && !enoughSugarPancakes && enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры, сахара и масла");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && !enoughSugarPancakes && enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры и масла");
            hasErrorPancakes = true;
        } else if (!enoughPowderPancakes && enoughSugarPancakes && !enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: пудры и молока");
            hasErrorPancakes = true;
        }

        //сахар проверка

        else if (enoughPowderPancakes && !enoughSugarPancakes && enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара");
            hasErrorPancakes = true;
        } else if (enoughPowderPancakes && !enoughSugarPancakes && !enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара и молока");
            hasErrorPancakes = true;
        } else if (enoughPowderPancakes && !enoughSugarPancakes && enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара и масла");
            hasErrorPancakes = true;
        } else if (enoughPowderPancakes && !enoughSugarPancakes && !enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: сахара, молока и масла");
            hasErrorPancakes = true;
        }

        // молоко проверка

        else if (enoughPowderPancakes && enoughSugarPancakes && !enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: молока");
            hasErrorPancakes = true;
        } else if (enoughPowderPancakes && enoughSugarPancakes && !enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: молока и масла");
            hasErrorPancakes = true;
        }

        // масло проверка

        else if (enoughPowderPancakes && enoughSugarPancakes && enoughMilkPancakes && !enoughOilPancakes) {
            System.out.println("Блинчики не приготовить. Нехватает: масла");
            hasErrorPancakes = true;
        }

        if (enoughPowderPancakes && enoughSugarPancakes && enoughMilkPancakes && enoughOilPancakes) {
            System.out.println("Блинчики");
        }

        //milk - 300 ml, powder - 5 g, eggs - 5

        int milkOmeletteRequired = 300;
        int powderOmeletteRequired = 5;
        int eggsOmeletteRequired = 5;

        boolean enoughMilkOmelette = (milkAmount >= milkOmeletteRequired);
        boolean enoughPowderOmelette = (powderAmount >= powderOmeletteRequired);
        boolean enoughEggsOmelette = (eggsCount >= eggsOmeletteRequired);


        boolean hasErrorOmelette = false;

        if (enoughMilkOmelette && enoughPowderOmelette && enoughEggsOmelette)
            hasErrorOmelette = true;

        //молоко проверка

        else if (!enoughMilkOmelette && enoughPowderOmelette && enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: молока");
            hasErrorOmelette = true;
        }
        else if (!enoughMilkOmelette && !enoughPowderOmelette && enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: молока и пудры");
            hasErrorOmelette = true;
        }
        else if (!enoughMilkOmelette && enoughPowderOmelette && !enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: молока и яиц");
            hasErrorOmelette = true;
        }
        else if (!enoughMilkOmelette && !enoughPowderOmelette && !enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: молока, пудры и яиц");
            hasErrorOmelette = true;
        }

        //пудра проверка

        else if (enoughMilkOmelette && !enoughPowderOmelette && enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: пудры");
            hasErrorOmelette = true;
        }
        else if (enoughMilkOmelette && !enoughPowderOmelette && !enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: пудры и яиц");
            hasErrorOmelette = true;
        }

        //яйца проверка

        else if (enoughMilkOmelette && enoughPowderOmelette && !enoughEggsOmelette) {
            System.out.println("Омлет не приготовить. Нехватает: яиц");
            hasErrorOmelette = true;
        }
        if (enoughMilkOmelette && enoughPowderOmelette && enoughEggsOmelette ) {
            System.out.println("Омлет");
        }

        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

        int applesApplePieRequired = 3;
        int milkApplePieRequired = 100;
        int powderApplePieRequired = 300;
        int eggsApplePieRequired = 4;

        boolean enoughApplesApplePie = (appleCount >= applesApplePieRequired);
        boolean enoughMilkApplePie = (milkAmount >= milkApplePieRequired);
        boolean enoughPowderApplePie = (powderAmount >= powderApplePieRequired);
        boolean enoughEggsApplePie = (eggsCount >= eggsApplePieRequired);


        boolean hasErrorApplePie = false;

        if (enoughApplesApplePie && enoughMilkApplePie && enoughPowderApplePie && enoughEggsApplePie)
            hasErrorApplePie = true;

        //яблоки проверка

        else if (!enoughApplesApplePie && enoughMilkApplePie && enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && !enoughMilkApplePie && enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок и молока");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && enoughMilkApplePie && !enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок и пудры");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && enoughMilkApplePie && enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок и яиц");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && !enoughMilkApplePie && !enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок, молока и пудры");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && enoughMilkApplePie && !enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок, пудры и яиц");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && !enoughMilkApplePie && enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок, молока и яиц");
            hasErrorApplePie = true;
        }
        else if (!enoughApplesApplePie && !enoughMilkApplePie && !enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яблок, молока, пудры и яиц");
            hasErrorApplePie = true;
        }

        //молоко проверка

        else if (enoughApplesApplePie && !enoughMilkApplePie && enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: молока");
            hasErrorApplePie = true;
        }
        else if (enoughApplesApplePie && !enoughMilkApplePie && !enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: молока и пудры");
            hasErrorApplePie = true;
        }
        else if (enoughApplesApplePie && !enoughMilkApplePie && enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: молока и яиц");
            hasErrorApplePie = true;
        }
        else if (enoughApplesApplePie && !enoughMilkApplePie && !enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: молока, пудры и яиц");
            hasErrorApplePie = true;
        }

        //пудра проверка

        else if (enoughApplesApplePie && enoughMilkApplePie && !enoughPowderApplePie && enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: пудры");
            hasErrorApplePie = true;
        }
        else if (enoughApplesApplePie && enoughMilkApplePie && !enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: пудры и яиц");
            hasErrorApplePie = true;
        }
        //яйца проверка

        else if (enoughApplesApplePie && enoughMilkApplePie && enoughPowderApplePie && !enoughEggsApplePie) {
            System.out.println("Яблочный пирог не приготовить. Нехватает: яиц");
            hasErrorApplePie = true;
        }
        if (enoughApplesApplePie && enoughMilkApplePie && enoughPowderApplePie && enoughEggsApplePie ) {
            System.out.println("Яблочный пирог");
        }
    }
}
