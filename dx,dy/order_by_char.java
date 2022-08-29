import java.util.Scanner;

public class Main {
    public static int n, x, y;
    public static String str;
    public static int[] dx = new int[] {1, 0, -1, 0};
    public static int[] dy = new int[] {0, -1, 0, 1};
    public static int dirNum = 3;

    public static void main(String[] args) {
        // Your Program Goes Here
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'L'){
                dirNum = (dirNum + 3) % 4;
            }
            else if (str.charAt(i) == 'R'){
                dirNum = (dirNum + 1) % 4;
            }
            else {
                x = x + dx[dirNum];
                y = y + dy[dirNum];
            } 
        }
        System.out.print(x + " " + y);
    }
}
