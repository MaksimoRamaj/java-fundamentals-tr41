package ushtrimi18;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Teshtij: ");
        String pergjigje = scanner.next();

        String o = "o";
        String fund = "";
        boolean kaO = false;


        for (int i = 0; i < pergjigje.length() ; i++) {
            fund = String.valueOf(pergjigje.charAt(pergjigje.length() - (i + 1)));
            if(o.equals(fund)) {
                kaO = true;
                if (kaO){
                    System.out.println("Shendet !");}
                break;
            }
            kaO = false;
        }

    }
}
