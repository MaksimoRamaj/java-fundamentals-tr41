package patterns;

public class Patterns {
    public static void main(String[] args) {
        pattern2(5);
    }

    static void pattern2(int n){

        for (int row = 0 ; row < n ; row ++ ){
            for (int col = 0 ; col < row + 1 ; col ++ ){
                System.out.print(row + 1);
            }
            System.out.println();
        }
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
