package task_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");

        int value = new Scanner(System.in).nextInt();

        for (int i = 1; i <= value; i++) {


            for (int j = value; j >= 1; j--) {
                if (value % j != 0)
                    continue;

                if (value == i * j)
                    System.out.println(i + "*" + j);
            }
        }
    }
}


