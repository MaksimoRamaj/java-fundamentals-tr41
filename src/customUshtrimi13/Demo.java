package customUshtrimi13;

import javax.print.DocFlavor;

public class Demo {
    public static void main(String[] args) {
        String string = "This is my test";

        String[] words = mySplitter(string);

        for (int i = 0 ; i < words.length ; i++){
            if (words[i]!= null) {
                System.out.print(words[i] + " " + words[i] + " ");
            }
        }
    }

    public static String[] mySplitter(String str){

        OurStringsResizableArray array = new OurStringsResizableArray();

        int ptr1=0;
        int ptr2;
        int current = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for (ptr2 = 0;ptr2 < str.length();ptr2++){
            if (Character.isWhitespace(str.charAt(ptr2))){
                for (ptr1 = current; ptr1 < ptr2; ptr1++){
                    stringBuilder.append(str.charAt(ptr1));
                    current++;
                }
                array.add(stringBuilder.toString());
                //ta zeroj
                stringBuilder = new StringBuilder();
            }else if (ptr2 == str.length()-1){
                for (ptr1 = current; ptr1 <= ptr2; ptr1++){
                    stringBuilder.append(str.charAt(ptr1));
                }
                array.add(stringBuilder.toString());
                //ta zeroj
                stringBuilder = new StringBuilder();
            }
        }

        return array.getStrings();
    }
}
