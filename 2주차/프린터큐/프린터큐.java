package 프린터큐;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 0; tc < T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Deque<Integer> dq = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) dq.addLast(Integer.parseInt(st.nextToken()));

            int printed = 0;

            while (true) {
                int cur = dq.removeFirst();

                boolean hasMax = false;
                for(int p : dq) {
                    if (p > cur) {
                        hasMax = true;
                        break;
                    }
                }

                if(hasMax) {
                    dq.addLast(cur);
                    if(M == 0)
                        M = dq.size() - 1;
                    else
                        M--;
                } else {
                    printed++;
                    if(M == 0) {
                        sb.append(printed).append('\n');
                        break;
                    } else {
                        M--;
                    }
                }
            }
        }

        System.out.print(sb.toString());
    }
}
