import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int n;
    public static int m;
    public static int ans;
    public static int[] arr = new int[20];
    public static ArrayList<Integer> answer = new ArrayList<>();
    public static ArrayList<Integer> xor_val = new ArrayList<>();

    public static void print(){
        for (int i = 0; i < answer.size(); i++){
            System.out.print(answer.get(i) + " ");
        }
        System.out.println();
    }
    
    public static int calc(){
        int val = 0;
        for(int i = 0; i < m; i++){
            val ^= answer.get(i);
        }
        return val;
    }

    public static void xor_comb(int currIdx, int cnt){

        if (currIdx == n){
            if (cnt == m){
                ans = Math.max(calc(), ans);
                //print();
            }
            return;
        }

        answer.add(arr[currIdx]);
        xor_comb(currIdx + 1, cnt + 1);
        answer.remove(answer.size() - 1);
        xor_comb(currIdx + 1, cnt);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ans = 0;
        for (int i = 0; i < n; i++){
            int k = sc.nextInt();
            arr[i] = k;
        }
        xor_comb(0, 0);
        System.out.print(ans);
    }
}
