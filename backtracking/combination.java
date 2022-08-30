import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int N;
    public static int M;
    public static ArrayList<Integer> combination = new ArrayList<>();

    public static void print(){
        for (int i = 0; i < combination.size(); i++)
            System.out.print(combination.get(i) + " ");
        System.out.println();
    }

    public static void comb(int currNum, int cnt){
        
        if (currNum == N + 1){
            if (cnt == M)
                print();
            return;
        }
        combination.add(currNum);
        comb(currNum + 1, cnt + 1);
        combination.remove(combination.size() - 1);
        comb(currNum + 1, cnt);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        comb(1, 0);
        // Your Program Goes Here
    }
}
