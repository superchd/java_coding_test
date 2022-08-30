import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int n;
    public static int[][] grid = new int[10][10];
    public static boolean[][] visited = new boolean[10][10];

    public static boolean can_go(int row, int col){

        if (visited[row][col]) {return false;}
        for (int i = 0; i < n; i++){
            if (visited[i][col]) {return false;}
        }
        for (int j = 0; j < n; j++){
            if (visited[row][j]) {return false;}
        }
        return true;
    }

    public static void choose(int row, int col, int currNum, int currSum){

        if (currNum == n){
            return;
        }

        for (int i = 0; i < n; row++){
            for (int j = 0; j< n; col++){
                if (can_go(row, col)){
                    visited[i][j] = true;
                    choose(i, j, currNum + 1, currSum + grid[row][col]);
                    visited[i][j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int row = 0; row < n; row++){
            for (int col = 0; col < n; col++){
                grid[row][col] = sc.nextInt();
            }
        }
        choose(0, 0, 0, 0);
    }
}
