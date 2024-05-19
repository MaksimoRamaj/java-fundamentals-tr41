package ushtrimi11;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fjala ="";
        String maxLengthfjala ="";


        while (
                !fjala.equals("enough")) {
            System.out.println("venods nje fjale ");
            fjala = scanner.nextLine();
            if (
                    !fjala.equals("enough")&&fjala.length() > maxLengthfjala.length()
            ) {
                maxLengthfjala = fjala;
            }

        }
        if (maxLengthfjala.equals("")){
            System.out.println("not text provided");
        }else {
            System.out.println(maxLengthfjala);
        }

    }
}
