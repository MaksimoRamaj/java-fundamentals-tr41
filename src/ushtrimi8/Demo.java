package ushtrimi8;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        System.out.println((54321%10));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep numrin e pare: ");
        float numri1 = scanner.nextFloat();

        System.out.println("Jep numrin e dyte: ");
        float numri2 = scanner.nextFloat();

        System.out.println("Jep operatorin: ");
        String stringOperatori = scanner.next();

        char charOperatori = stringOperatori.charAt(0);

        //ose perdorim valueOf per te kaluar nga char ne String
        //ose ndryshojm argumentin e metodes simpleCalculator String operatori -> char operatori
       float rezultati = simpleCalculator(String.valueOf(charOperatori),numri1,numri2);
       System.out.println("Rezultati: " + rezultati);
    }

    public static float simpleCalculator(String operatori,float numri1,float numri2){

        float rezultati = Integer.MIN_VALUE;

        switch (operatori){
            case ("+"):
                rezultati = numri1 + numri2;
                break;
            case ("-"):
                rezultati = numri1 - numri2;
                break;
            case ("*"):
                rezultati = numri1 * numri2;
                break;
            case ("/"):
                if (numri2 == 0) {
                    System.out.println("Pjestimi me zero i pamundur!");
                }else {
                    rezultati = numri1 / numri2;
                }
                break;
            default:
                System.out.println("Operatori jo i pershtatshem!");
            }

            return rezultati;
        }
}

