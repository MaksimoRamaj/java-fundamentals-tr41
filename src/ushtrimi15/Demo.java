package ushtrimi15;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        readNumbersAndVerify();
    }

    public static void readNumbersAndVerify(){
        //marrim input nga perdoruesi
        Scanner scanner = new Scanner(System.in);

        int[] numrat = new int[10];
        int[] frq = new int[10];

        for (int i = 0 ; i < 10 ; i++){
            System.out.println("Jep numrin e radhes: ");
            int vlera = scanner.nextInt();
            int index = contains(numrat,vlera);
            //nuk ndodhet
            if (index == -1){
                numrat[i] = vlera;
                frq[i] = frq[i] + 1;
            }else {
                //ndodhet ne index
                frq[index] = frq[index] + 1;
            }
        }

        printoNumrat(frq,numrat);
    }

    private static int contains(int[] arr,int vlera){
        for (int i = 0; i < arr.length ; i++){
            if (arr[i] == vlera){
                return i;
            }
        }
        return -1;
    }
    //printon numrat ku frq me e madhe se 1
    private static void printoNumrat(int[] frq,int[] arr){
        for (int i = 0 ; i < frq.length ; i++){
            if (frq[i] > 1){
                System.out.println("Numri: " + arr[i] + ", frq: " + frq[i] + ",");
            }
        }
    }
}
