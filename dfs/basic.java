import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static int VERTICES_NUM;
    public static int EDGES_NUM;
    public static ArrayList<Integer>[] graph = new ArrayList[VERTICES_NUM + 1];
    public static boolean[] visited = new boolean[VERTICES_NUM + 1];
    
    public static void dfs(int vertex){
        for (int i = 0; i < graph[i].size(); i++){
            int curr = graph[vertex].get(i);
            if (!visited[curr]){
                visited[curr] = true;
                System.out.println(curr);
                dfs(curr);
            }
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i<= VERTICES_NUM + 1; i++){
            graph[i] = new ArrayList<>();
        }
        Scanner sc = new Scanner(System.in);
        VERTICES_NUM = sc.nextInt();
        EDGES_NUM = sc.nextInt();
        

        for (int i = 0; i < EDGES_NUM; i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            graph[start].add(end);
            graph[end].add(start);
        }
        int rootVertex = 1;
        visited[rootVertex] = true;
        System.out.println(rootVertex);
        dfs(rootVertex);
    }
}
