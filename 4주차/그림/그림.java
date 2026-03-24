package 그림;

import java.io.*;
import java.util.*;

public class Main {
    static int n,m;
    static int[][] board;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node{
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static int bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x,y));
        visited[x][y] = true;
        int area = 1;

        while(!queue.isEmpty()) {
            Node now = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;
                if(visited[nx][ny])
                    continue;
                if(board[nx][ny] == 0)
                    continue;

                visited[nx][ny] = true;
                queue.offer(new Node(nx,ny));
                area++;
            }
        }

        return area;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        board = new int[n][m];
        visited = new boolean[n][m];

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < m; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        int count = 0;
        int maxArea = 0;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(board[i][j] == 1 && !visited[i][j]) {
                    count++;
                    int area = bfs(i, j);
                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        StringBuilder sb = new StringBuilder();

        sb.append(count).append('\n').append(maxArea);

        System.out.println(sb.toString());
    }
}
