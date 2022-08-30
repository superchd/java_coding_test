import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int VERTICES_NUM;
    public static int EDGES_NUM;
    public static ArrayList<Integer>[] graph = new ArrayList[1001];
    public static boolean[] visited = new boolean[1001];
    public static int v_cnt = 0;
    public static void dfs(int vertex){
        for (int i = 0; i < graph[vertex].size(); i++){
            int curr = graph[vertex].get(i);
            if (!visited[curr]){
                visited[curr] = true;
               
                v_cnt++;
                dfs(curr);
            }
        }
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        VERTICES_NUM = sc.nextInt();
        EDGES_NUM = sc.nextInt();
        for (int i = 1; i<= VERTICES_NUM + 1; i++){
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < EDGES_NUM; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph[start].add(end);
            graph[end].add(start);
        }
        int rootVertex = 1;
        visited[rootVertex] = true;
        
        dfs(rootVertex);
        System.out.print(v_cnt);
    }
}
