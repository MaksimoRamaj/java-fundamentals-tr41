package ushtrimi4;

import java.util.Scanner;

public class ushtrimi4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep nje numer pozitiv:");
        int var = scanner.nextInt();
        for (int i = 1; i <= var; i++) {
            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Fizz Buzz ");
            } else if (i % 3 == 0) {
                System.out.println("Fizz ");
            } else if (i % 7 == 0) {
                System.out.println("Buzz ");
            } else {
                System.out.println(i);
            }

        }
    }

}
