package ushtrimi13;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        String str = "This is my test!";

        String[] words = str.split("\\s+");

        for (int i=0;i<words.length;i++){
            System.out.print(words[i] + " " + words[i] + " ");
        }
    }
}
