import java.util.Scanner;


public class Main {

    public static int n, cnt;
    public static String str;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        str = sc.next();
        cnt = 0;

        for(int i = 0; i < str.length() - 1; i++){
            if (str.charAt(i) == '('){
                for (int j = i + 1; j < str.length(); j++){
                    if (str.charAt(j) == ')'){
                        cnt++;
            
                    }
                }
            }    
        }
        System.out.print(cnt); 
        // Your Program Goes Here
    }
}
