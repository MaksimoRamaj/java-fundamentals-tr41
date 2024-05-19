package ushtrimi10;

import java.util.Scanner;

public class Demo {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Vendosni nje numer: ");
        int n = sc.nextInt();
        int shuma = 0;
      while(n>0) {

          shuma = shuma + (n % 10);
          n = n / 10;
      }
        System.out.println("Shuma eshte : " + shuma);
    }
}
