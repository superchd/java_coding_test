import java.util.Scanner;

public class Main {
    public static final int INT_MIN = Integer.MIN_VALUE;
    public static final int INT_MAX = Integer.MAX_VALUE;
    public static int n;
    public static int[] arr = new int[100];

    public static void main(String[] args) {
        // Your Program Goes Here
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int min_sum;
        int dist_sum;

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        min_sum = INT_MAX;
        for (int i = 0; i < n; i++){
            dist_sum = 0;
            for (int j = 0; j < n; j++){
                if (j != i) {
                    dist_sum += Math.abs(j - i) * arr[j];        
                }
            }
            if (dist_sum < min_sum){
                min_sum = dist_sum;
            }
        }
        System.out.print(min_sum);
    }
}
