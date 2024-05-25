package ushtrimi18;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("User input: ");
        String word = scanner.next();

        if (word.matches("acho+")){
            System.out.println("Shendet!");
        }else {
            System.out.println(word);
        }
    }
}
