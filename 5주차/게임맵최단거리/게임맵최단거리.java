package 게임맵최단거리;

import java.util.*;

class Solution {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{0,0});

        while(!queue.isEmpty()) {
            int[] now = queue.poll();
            int x = now[0];
            int y = now[1];

            for(int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                if(nx < 0 || ny < 0 || nx >= n || ny >= m)
                    continue;
                if(maps[nx][ny] == 0)
                    continue;
                if(maps[nx][ny] > 1)
                    continue;

                maps[nx][ny] = maps[x][y] + 1;
                queue.offer(new int[]{nx,ny});
            }
        }

        if(maps[n-1][m-1] == 1)
            return -1;

        return maps[n-1][m-1];
    }
}
