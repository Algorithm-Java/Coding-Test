package 토마토;

import java.io.*;
import java.util.*;

public class Main {
    static int M, N;
    static int[][] box;
    static int[] dx = {-1, 1, 0 , 0};
    static int[] dy = {0, 0, -1, 1};

    static class Node{
        int x, y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    static void bfs(Queue<Node> queue) {
        while (!queue.isEmpty()) {
            Node now = queue.poll();

            for(int i = 0; i < 4; i++) {
                int nx = now.x + dx[i];
                int ny = now.y + dy[i];

                if(nx < 0 || ny < 0 || nx >= N || ny >= M)
                    continue;
                if(box[nx][ny] != 0)
                    continue;

                box[nx][ny] = box[now.x][now.y] + 1;
                queue.offer(new Node(nx,ny));
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        Queue<Node> queue = new LinkedList<>();

        for(int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());

                if(box[i][j] == 1) {
                    queue.offer(new Node(i,j));
                }
            }
        }

        bfs(queue);
        int maxDay = 0;

        for(int i = 0; i < N; i++) {
            for(int j = 0; j < M; j++) {
                if(box[i][j] == 0) {
                    System.out.println(-1);
                    return;
                }
                maxDay = Math.max(maxDay,box[i][j]);
            }
        }

        System.out.println(maxDay - 1);
    }
}
