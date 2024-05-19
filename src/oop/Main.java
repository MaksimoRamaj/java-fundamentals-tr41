package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jep emrin: ");
        String emri = scanner.next();

        Human obj = new Human(emri,"A",22);

        System.out.println("Jep emrin: ");
        String emri2 = scanner.next();
        Human human2 = new Human(emri2, "B" , 20);

        System.out.println("Popullsia: " + Human.popullsia);
        Human.getPopullsia();
        //nuk mundet
//        Human.sleep();
        obj.setMosha(28);
        System.out.println(obj.getMosha());
    }
}
