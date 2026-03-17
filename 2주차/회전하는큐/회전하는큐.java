package 회전하는큐;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Deque<Integer> dq = new ArrayDeque<>();
        for (int i = 1; i <= N; i++) dq.addLast(i);

        st = new StringTokenizer(br.readLine());

        int answer = 0;

        for(int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());

            int movesLeft = 0;
            int movesRight = 0;

            Deque<Integer> dqLeft = new ArrayDeque<>(dq);
            while(dqLeft.peekFirst() != target) {
                dqLeft.addLast(dqLeft.removeFirst());
                movesLeft++;
            }
            dqLeft.removeFirst();

            Deque<Integer> dqRight = new ArrayDeque<>(dq);
            while(dqRight.peekFirst() != target) {
                dqRight.addFirst(dqRight.removeLast());
                movesRight++;
            }
            dqRight.removeFirst();

            if(movesLeft <= movesRight) {
                answer += movesLeft;
                dq = dqLeft;
            } else {
                answer += movesRight;
                dq = dqRight;
            }
        }

        System.out.println(answer);
    }
}
