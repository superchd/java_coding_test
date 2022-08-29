import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static int n;
    public static int beauti_count = 0;
    public static ArrayList<Integer> answer = new ArrayList<>();

    public static boolean is_beauti(){
        for (int i = 0; i < answer.size(); i++){
            if (answer.size())

        }
    }

    public static void count_beauti_num(currNum){

        if (currNum == n) {
            if (is_beauti()){
                beauti_count++;
            }
            return;
        }

        for (int i = 1; i < n + 1; i++){
            answer.add(i);
            count_beauti_num(currNum + 1);
            answer.remove(answer.size() - 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        count_beauti_num(0);
        System.out.print(beauti_count);
    }
}
