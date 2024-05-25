package ushtrimi16;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner scanner  =  new Scanner(System.in);
        int[] numra = {1,3,8,4,2,5,6,11,13,7,Integer.MIN_VALUE};

//        for (int i = 0; i < numra.length; i++) {
//            System.out.println("Vendosni numrin " + (i+1));
//            numra[i] = scanner.nextInt();
//        }

        System.out.print("Numrat e vendosur jane: ");
        for (int i = 0; i < numra.length; i++) {
            System.out.print(" " + numra[i]);
        }
        System.out.println();

        int maxGjatesi = 1;
        int countGjatesi = 1;

        for (int i = 0; i < numra.length - 1; i++) {
            if (numra[i] < numra[i + 1]){
                countGjatesi++;
            } else if (maxGjatesi < countGjatesi) {
                maxGjatesi = countGjatesi;
            }else {
                countGjatesi = 1;
            }

        }

        int[] index = new int[maxGjatesi];
        for (int i = 0; i < index.length; i++) {
            if(numra[i] < numra[i + 1]){
                index[i] = numra[i];
            }
        }

        System.out.println("Subsequence e numrave eshte :" + maxGjatesi);
        for (int i = 0; i < index.length - 1; i++) {
            System.out.print(index[i] + " ");
        }


    }
}