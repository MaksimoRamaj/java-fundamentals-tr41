package ushtrimi1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        //Write an application that will read diameter
        // of a circle (variable of type float) and
        //calculate perimeter of given circle.
        //Firstly, assume π = 3.14. Later, use value of π from built-in Math class.

        //merr diamterin me ane te nje objecti te klases Scanner

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Jep diametrin: ");
//        Float diametri = scanner.nextFloat();
//
//        //gjej rrezen
//
//        Float rreze = diametri / 2;
//
//        //dhe me pas perimetrin
//
//        Float perimetri = (float) (2 * Math.PI * rreze);
//
//        System.out.println("Perimetri: " + perimetri);

      float p = perimetri();
      System.out.println("Perimetri: " + p);


    }

    public static float perimetri(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jep diametrin: ");
        Float diametri = scanner.nextFloat();

        //gjej rrezen

        Float rreze = diametri / 2;

        //dhe me pas perimetrin

        Float perimetri = (float) (2 * Math.PI * rreze);

        return perimetri;
    }
}
