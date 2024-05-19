package ushtrimi14;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jep karakterin e pare: ");
        char firstChar = scanner.next("[a-z]").charAt(0);
        System.out.print("Jep karakterin e dyte: ");
        char secondChar = scanner.next("[a-z]").charAt(0);

        int differenca = Math.abs(((int)secondChar - (int)firstChar));

        System.out.print("Differenca: " + differenca);
    }
}
