package 카드;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> dq = new ArrayDeque<>();

        for(int i = N; i > 0; i--) {
            dq.addFirst(i);

            int size = dq.size();
            int mod = i % size;

            for(int j = 0; j < mod; j++) {
                dq.addFirst(dq.removeLast());
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!dq.isEmpty()) {
            sb.append(dq.removeFirst());
            if(!dq.isEmpty())
                sb.append(' ');
        }

        System.out.println(sb.toString());
    }
}
