package ushtrimi7;

public class FibonnaciDemo {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,21....

        System.out.println(fibo(100));
    }

    public static double fibo(int index){
        double first = 0;
        double second = 1;
        double third = 0;
        if (index < 0){
            System.out.println("Nuk mund te japesh index negativ!");
        };
        for (int i=0;i < index ;i++){
            third = first + second;
            first = second;
            second = third;
        }

        return first;
    }
}
