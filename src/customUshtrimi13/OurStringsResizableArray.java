package customUshtrimi13;

public class OurStringsResizableArray {

    private final int SIZE = 6;
    private String[] strings;
    private int currentIndex;

    public OurStringsResizableArray(){
        strings = new String[SIZE];
        currentIndex = 0;
    }

    public OurStringsResizableArray(int size){
        strings = new String[size];
        currentIndex = 0;
    }

    public void add(String str){
        if (currentIndex < strings.length){
            strings[currentIndex] = str;
            currentIndex++;
        }else {
            String[] newString = kopjoElementet(strings);
            strings = newString;
            strings[currentIndex] = str;
            currentIndex++;
        }
    }

    public static String[] kopjoElementet(String[] origin){
        String[] dest = new String[origin.length * 2];
        for (int i= 0 ; i < origin.length ; i++){
            dest[i] = origin[i];
        }
        return dest;
    }

    //dsh kryej fshirjen e elementeve remove();

    public String[] getStrings() {
        return strings;
    }

}
