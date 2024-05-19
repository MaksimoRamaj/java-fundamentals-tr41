package patterns;

public class Patterns {
    public static void main(String[] args) {
        int i = 97;
        System.out.println((char) i);
    }

    static void pattern1(int n){

        for (int row = 0 ; row < n ; row++){
            //cikli pergjegjes per hapsirat

            for (int h = 0; h < row ; h++){
                System.out.print(" ");
            }

            //cikli pergjegjes per yjet

            for (int y = 0 ; y < n - row ; y++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
