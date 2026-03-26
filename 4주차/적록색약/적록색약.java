package 적록색약;

import java.io.*;
import java.util.*;

public class Main {
    static int N;
    static char[][] normal;
    static char[][] blind;
    static boolean[][] visited;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node {
        int x, y;
        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(int x, int y, char color, char[][] map) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x, y));
        visited[x][y] = true;

        while(!queue.isEmpty()) {
            Node now = queue.poll();

            for(int d = 0; d < 4; d++) {
                int nx = now.x + dx[d];
                int ny = now.y + dy[d];

                if(nx < 0 || ny < 0 || nx >= N || ny >= N)
                    continue;
                if(visited[nx][ny])
                    continue;
                if(map[nx][ny] != color)
                    continue;

                visited[nx][ny] = true;
                queue.offer(new Node(nx, ny));
            }
        }
    }

    static int countArea(char[][] map) {
        visited = new boolean[N][N];
        int count = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < N; j++) {
                if(!visited[i][j]) {
                    bfs(i, j, map[i][j], map);
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        normal = new char[N][N];
        blind = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                char c = s.charAt(j);
                normal[i][j] = c;

                if (c == 'G') {
                    blind[i][j] = 'R';
                } else {
                    blind[i][j] = c;
                }
            }
        }

        int normalCount = countArea(normal);
        int blindCount = countArea(blind);

        System.out.println(normalCount + " " + blindCount);
    }
}