package patterns;

import java.util.Scanner;

public class Ush9 {
    public static void vizatimivalve(int length) {

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < length; j++) {
                if (j % 8 == i || j % 8 == 6 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("shkr gjatesin e valve: ");
        int length = scanner.nextInt();
        scanner.close();

        if (length > 0) {
            vizatimivalve(length);
        } else {
            System.out.println("shkr nr pozitiv.");
        }
    }
}
