package tasck_01;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Elevator elevator = new Elevator(-3, 26);

        while (true) {
            System.out.println("Введите номер этажа: ");
            int floor = new Scanner(System.in).nextInt();
            elevator.move (floor);
        }
    }
}
