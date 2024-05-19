package ushtrimi2;

import java.util.Scanner;

//Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
//Your application should read two variables: weight (in kilograms, type float) and height
//(in centimeters, type int). BMI should be calculated given following formula:
//The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
//values. Your program should write "BMI optimal" or "BMI not optimal", according to the
//assumptions above.

public class Demo {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Jep peshen");
        double pesha = scanner.nextDouble();
        System.out.println("jep gjatesine ne cm : ");
        int gjatesia = scanner.nextInt();
        boolean bmiOptimal = vlersoBMI(pesha,gjatesia);
        if(bmiOptimal == true){
            System.out.println("BMI optimal");
        }else{
            System.out.println("BMI not optimal");
        }
    }
    public static boolean vlersoBMI(double pesha,int gjatesia){
        float height =(float) gjatesia/100;
        double bmi = pesha /(height*height);
        System.out.println("vlera e gjatesise "+height);
        System.out.println(bmi);
        if(bmi>18.5 && bmi<24.9){
            return true;
        }else{
            return false;
        }
    }
}
