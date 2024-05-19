package patterns;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        String myString = "string1";

        String myString2 = "string1";

        String myString3 = new String("string1");

        System.out.println("Krahasimi 1: " + myString == myString2);
        System.out.println("Krahasimi 2: " + myString == myString3);


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vendosni nje numer pozitiv; ");
//        int number = scanner.nextInt();
//        if (number < 0) {
//            System.out.println("Ju nuk vendoset nje numer pozitiv! ");
//        }
//
//        int gjatesi = number;
//        int gjeresi = number;
//        int x = gjatesi - 1;
//
//        for (int i = 0; i <=gjatesi; i++) {
//            for (int j = 0; j < gjatesi * gjeresi * 2; j++) {
//                if(j%(gjatesi*2) == x || j%(gjatesi*2) == gjatesi + i){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }x--;
//            System.out.println(" ");
//        }
//
    }
}
