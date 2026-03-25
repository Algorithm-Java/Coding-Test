package 알파벳;

import java.io.*;
import java.util.*;

public class Main {
    static int R, C;
    static char[][] board;
    static boolean[] visited = new boolean[26];
    static int max = 0;

    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    static void dfs(int x, int y, int count) {
        max = Math.max(max,count);

        for(int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx < 0 || ny < 0 || nx >= R || ny >= C)
                continue;

            int idx = board[nx][ny] - 'A';
            if(!visited[idx]) {
                visited[idx] = true;
                dfs(nx, ny, count + 1);
                visited[idx] = false;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        board = new char[R][C];

        for (int i = 0; i < R; i++) {
            String s = br.readLine();
            for (int j = 0; j < C; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        visited[board[0][0] - 'A'] = true;
        dfs(0, 0, 1);

        System.out.println(max);
    }
}
