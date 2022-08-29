
import java.util.Scanner;

public class Main {
    public static final int MAX_N = 20;
    public static int N;
    public static int[][] grid = new int[MAX_N][MAX_N];
    public static int getNumOfGold(int rowS, int colS, int rowE, int colE) {
        int numOfGold = 0;

        for(int row = rowS; row <= rowE; row++) {
            for(int col = colS; col <= colE; col++) {
                numOfGold += grid[row][col];
            }
        }
        
        return numOfGold;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();

        // complete grid
        for (int row = 0; row < N; row++){
            for (int col = 0; col < N; col++){
                grid[row][col] = sc.nextInt();
            }
        }
        int max_num = 0;
        for (int row = 0; row < N; row++){
            for (int col = 0; col < N; col++){
                
                if (row + 2 >= N || col + 2 >= N){
                    continue;
                }

                int num_of_gold = getNumOfGold(row, col, row + 2, col + 2);
                max_num = Math.max(max_num, num_of_gold);
            }
        }

        System.out.print(max_num);
    }
}
