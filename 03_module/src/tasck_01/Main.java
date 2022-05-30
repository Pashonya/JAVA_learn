package tasck_01;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int result = 1;

        System.out.println("Введите число: ");

        int value = new Scanner(System.in).nextInt();

        for(int i = 1; i <= value; ++i)
        {
            result = result * i;
        }
        System.out.printf(value + "! = " + result);
    }
}



