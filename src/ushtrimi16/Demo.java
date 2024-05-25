package ushtrimi16;

public class Demo {
    public static void main(String[] args) {

        int[] numrat = {1,3,8,4,2,5,6,11,13,7,Integer.MIN_VALUE};
        int[] numrat2 = {1,3,8,4,2,5,6,11,13,Integer.MIN_VALUE};
        int[] numrat3 = {9,8,7,5,4,3,2,1,0,Integer.MIN_VALUE};

        subSqLength(numrat3);

    }

    private static void subSqLength(int[] numrat){

        int index1;
        int maxCount = 1;
        int currentCounter = 1;

        for (index1 = 1 ; index1 < numrat.length ; index1++){

            if (numrat[index1] < numrat[index1 - 1]){
                //nensq zbritese
                if (currentCounter > maxCount){
                    maxCount = currentCounter;
                    currentCounter = 1;
                }
            }else {
                //sekuenca eshte rritese
                currentCounter++;
            }
        }

        System.out.println("MaxLength subsq: " + maxCount);

        int index0 = 0;
        int maxCount2 = 1;
        int currentCounter2 = 1;

        for (index1 = 1 ; index1 < numrat.length ; index1++){

            if (numrat[index1] < numrat[index1 - 1]){
                if (currentCounter2 > maxCount2){
                    if (currentCounter2 == maxCount){
                        printoNenSqMeTeGjate(index0,numrat);
                    }
                    maxCount2 = currentCounter2;
                    currentCounter2 = 1;
                }
                index0 = index1;
            }else {
                //sekuenca eshte rritese
                currentCounter2++;
            }
        }

    }

    private static void printoNenSqMeTeGjate(int startIndex,int[] arr){
        while (startIndex < arr.length && arr[startIndex] < arr[startIndex+1]){
            System.out.println(arr[startIndex]);
            startIndex++;
        }
        System.out.println(arr[startIndex]);
        //kontrolloni me debugger ku mund te jete bug
    }
}
