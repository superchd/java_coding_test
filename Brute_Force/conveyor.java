import java.util.Scanner;

public class Main {
    public static int n, t;
    public static final int MAX_N = 200;
    public static int[] u = new int[2 * MAX_N];
    
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        t = sc.nextInt();
        for (int i = 0; i < 2 * n; i++){
            u[i] = sc.nextInt();
        }

        for (int k = 0 ; k < t; k++){
        int temp = u[2 * n - 1];

        for (int i = 2 * n - 1; i >= 1; i--){
            u[i] = u[i - 1];
        }
        u[0] = temp;
        }

        for(int i = 0; i < n; i++)
            System.out.print(u[i] + " ");
        System.out.println();

        for(int i = n; i < 2 * n ; i++)
            System.out.print(u[i] + " ");
        








    
    
        

        // Your Program Goes Here
    }
}
