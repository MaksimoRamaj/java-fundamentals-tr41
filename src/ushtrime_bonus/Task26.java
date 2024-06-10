package ushtrime_bonus;

import java.util.Scanner;

public class Task26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vendos vleren e pare :");
        int vleraPare = scanner.nextInt();

        System.out.println("Vendos vleren e dyte :");
        int vleraDyte = scanner.nextInt();
        System.out.println("Para shkembimit");
        int[] arr = new int[]{vleraPare,vleraDyte};
        System.out.println("Vlera e pare: " + arr[0]);
        System.out.println("Vlera e dyte: " + arr[1]);

        System.out.println("Pas skembimit");
        shkembe(0, 1 ,arr);

        System.out.println("Vlera e pare: " + arr[0]);
        System.out.println("Vlera e dyte: " + arr[1]);

    }

    public static void shkembe(int number1, int number2,int[] arr){
        int temp;
        temp = arr[number1];
        arr[number1] = arr[number2];
        arr[number2] = temp;
    }

    //pass by reference dhe pass by value
}
