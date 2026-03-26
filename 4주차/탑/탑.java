package 탑;

import java.io.*;
import java.util.*;

public class Main {
    static class Tower {
        int idx;
        int h;

        Tower(int idx, int h) {
            this.idx = idx;
            this.h = h;
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] answer = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        Stack<Tower> stack = new Stack<>();

        for(int i = 0; i < N; i++) {
            int nowH = Integer.parseInt(st.nextToken());
            int nowIdx = i + 1;

            while(!stack.isEmpty() && stack.peek().h < nowH) {
                stack.pop();
            }

            if(stack.isEmpty())
                answer[i] = 0;
            else {
                answer[i] = stack.peek().idx;
            }

            stack.push(new Tower(nowIdx,nowH));
        }

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < N; i++) {
            sb.append(answer[i]);

            if(i < N - 1)
                sb.append(' ');
        }

        System.out.print(sb.toString());
    }
}
