package 덱;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int cap = n + 1;
        int[] dq = new int[cap];
        int head = 0;
        int tail = 0;
        int size = 0;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push_front":
                    int x = Integer.parseInt(st.nextToken());
                    head = (head - 1 + cap) % cap;
                    dq[head] = x;
                    size++;
                    break;
                case "push_back":
                    x = Integer.parseInt(st.nextToken());
                    dq[tail] = x;
                    tail = (tail + 1) % cap;
                    size++;
                    break;
                case "pop_front":
                    if(size == 0)
                        sb.append(-1).append('\n');
                    else {
                        sb.append(dq[head]).append('\n');
                        head = (head + 1) % cap;
                        size--;
                    }
                    break;
                case "pop_back":
                    if(size == 0)
                        sb.append(-1).append('\n');
                    else {
                        tail = (tail - 1 + cap) % cap;
                        sb.append(dq[tail]).append('\n');
                        size--;
                    }
                    break;
                case "size":
                    sb.append(size).append('\n');
                    break;
                case "empty":
                    sb.append(size == 0 ? 1 : 0).append('\n');
                    break;
                case "front":
                    sb.append(size == 0 ? -1 : dq[head]).append('\n');
                    break;
                case "back":
                    if (size == 0) sb.append(-1).append('\n');
                    else {
                        int back = (tail - 1 + cap) % cap;
                        sb.append(dq[back]).append('\n');
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}