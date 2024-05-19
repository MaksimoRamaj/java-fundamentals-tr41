package ushtrimi6;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep emeruesin e fundit te serise: ");
        int n = scanner.nextInt();

        double shuma = shumaSeriseHarmonike(n);
        System.out.println("Shuma: " + shuma);
    }

    public static double shumaSeriseHarmonike(int n){
        double shuma = 0;
        //fillojme nga 1 der ne n
        for (int i = 1; i <= n ; i++){
            shuma = shuma + 1/(double)i;
        }
        return shuma;
    }
}
