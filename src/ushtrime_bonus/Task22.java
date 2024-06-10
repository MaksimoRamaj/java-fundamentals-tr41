package ushtrime_bonus;

public class Task22 {
    public static void main(String[] args) {
        int[][] matrica = new int[][]{
                {8, 3, 9, 0, 10},
                {3, 5, 17, 1, 1},
                {2, 8, 6, 23, 1},
                {15, 7, 3, 2, 9},
                {6, 14, 2, 6, 0},
        };

        gjejShumenRjeshtit(matrica); //30 27 40 36 28

        gjejShumenColones(matrica); //34 37 37 32 21
    }

    private static void gjejShumenRjeshtit(int[][] matrica){
        for (int row = 0 ; row < matrica.length ; row ++){
            int shuma = 0;
            for (int col = 0 ; col < matrica[row].length ; col ++){
                shuma = shuma + matrica[row][col];
            }
            System.out.print("Shuma e rrjeshtit: " + row + ": " + shuma + " ");
        }
        System.out.println();
    }

    private static void gjejShumenColones(int[][] matrica) {
        for (int row = 0 ; row < matrica.length ; row ++){
            int shuma = 0;
            for (int col = 0 ; col < matrica[row].length ; col++){
                shuma = shuma + matrica[col][row];
            }
            System.out.print("Shuma e kolones: " + row + ": " + shuma +" ");
        }
        System.out.println();
    }

}
