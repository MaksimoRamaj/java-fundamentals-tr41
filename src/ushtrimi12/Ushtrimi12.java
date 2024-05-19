package ushtrimi12;

import java.util.Scanner;

public class Ushtrimi12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        System.out.println("shkruaj dicka");
        String str=scanner.nextLine();
        int  count=0;
        for (int i = 0; i < str.length(); i++) {
            if( str.charAt(i)==' '){
               count++;
            }
        }
        double percentage = count*100/str.length();
        System.out.println("Perqindja e hapsirave eshte : " +percentage);
    }
}
