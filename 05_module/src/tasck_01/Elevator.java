package tasck_01;

public class Elevator {

    public int maxFloor = 26;
    public int minFloor = -3;
    public int currentFloor = 1;


    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public void moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
    }

    public void moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
    }

    public void move(int floor) {
        if (floor > maxFloor || floor < minFloor || floor == 0) {
            System.out.println("Данного этажа нет");
        } else if (floor == currentFloor) {
            System.out.println("Текущей этаж");
        } else if (floor < currentFloor) {
            while (true) {
                moveDown();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if (floor == currentFloor) {
                    break;
                }
            }
        } else if (floor > currentFloor) {
            while (true) {
                moveUp();
                if (currentFloor != 0) {
                    System.out.println(currentFloor + " этаж");
                }
                if ((floor == currentFloor)) {
                    break;
                }
            }
        }
    }
}