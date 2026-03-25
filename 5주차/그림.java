import java.io.*;
import java.util.*;

public class Main {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static boolean[][] visited;
    static int[][] arr;
    static int count, area, maxArea;

    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(re.readLine());
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());
        visited = new boolean[N + 1][E + 1];
        arr = new int[N + 1][E + 1];
        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(re.readLine());
            for (int j = 1; j <= E; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= E; j++) {
                if (!visited[i][j] && arr[i][j] == 1) {
                    area=0;
                    DFS(i,j,N,E);
                    count++;
                    maxArea = Math.max(maxArea,area);
                }
            }
        }
        System.out.println(count);
        System.out.println(maxArea);

    }

    public static void DFS(int i, int j, int N, int E) {
        visited[i][j] = true;
        area++;
        for (int k = 0; k < 4; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if (nx >= 1 && nx <= N && ny >= 1 && ny <= E && !visited[nx][ny] && arr[nx][ny] == 1) {
                DFS(nx, ny, N, E);
            }
        }
    }
}
