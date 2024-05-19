package ushtrimi3;

public class Demo {
    public static void main(String[] args) {

        double[] vlerat = gjejRrenjet(1,5,3);

        for (int i = 0 ; i < vlerat.length ; i++){
            System.out.println("Vlera["+i+"]"+": "+vlerat[i]);
        }

    }

    public static double[] gjejRrenjet(int a,int b,int c){

        double delta = Math.pow(b,2) - 4 * a * c;

        if (delta < 0){
            System.out.println("Delta negative");
            return new double[]{Integer.MIN_VALUE};
        }

        double rrenja1 = (-b - Math.sqrt(delta))  / (2 * a);
        double rrenja2 = (-b + Math.sqrt(delta))  / (2 * a);

        double[] arr = new double[2];
        arr[0] = rrenja1;
        arr[1] = rrenja2;

        return arr;
    }
}
