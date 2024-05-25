package ushtrimi20;

import java.util.Random;
import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomNumer = random.nextInt(0,101);//75

        while (true) {
            System.out.println("Vendos numrin: ");
            int userNumer = scanner.nextInt();
            if (userNumer > randomNumer) { //90, 60 , 75
                System.out.println("Too much!");
            } else if (userNumer < randomNumer) {
                System.out.println("Not enough!");
            }
            else{
                System.out.println("Congratulations!");
                break;
            }

        }
    }
}