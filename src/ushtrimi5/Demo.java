package ushtrimi5;

import java.util.Scanner;

public class Demo {
    static public void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendosni nje numer: ");
        int n=scanner.nextInt();
        for(int  i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println("Numri eshte prime: "+i);
            }
        }
    }

    static public boolean isPrime (int a){
        for (int i =2;i<=Math.sqrt(a);i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }

    //ose

    static public boolean isPrime_aSecondApproach(int a){
        for (int i =2;i<a;i++){
            if(a%i==0){
                return false;
            }
        }
        return true;
    }
}
