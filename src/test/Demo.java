package test;

public class Demo {
    public static void main(String[] args) {
        String myString = "string1";

        String myString2 = "string1";

        String myString3 = new String("string1");

        myString3 = myString;

        System.out.println("Krahasimi 1: " + (myString == myString2));
        System.out.println("Krahasimi 2: " + (myString == myString3));

        System.out.println(myString.getClass().getName());
        System.out.println(myString3.getClass().getName());

        System.out.println("Krahasimi 3: " + (myString.equals(myString3)));
    }
}
