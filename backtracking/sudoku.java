import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static int n;
    public static int[][] grid = new int[10][10];
    public static boolean[][] visited = new boolean[10][10];
    public static ArrayList<Integer> answer = new ArrayList<>();

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

    public static void choose(int col, int currRow, int currSum){

        if (currRow == n){
            answer.add(currSum);
            return;
        }
        for (int j = 0; j< n; j++){
            if (can_go(currRow, j)){
                visited[currRow][j] = true;
                choose(j, currRow + 1, currSum + grid[currRow][col]);
                visited[currRow][j] = false;
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
        choose(0, 0, 0);
        Collections.sort(answer, Collections.reverseOrder());
        System.out.print(answer.get(0));
    }
}
