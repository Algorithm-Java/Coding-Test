package 큐;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int[] q = new int[n];
        int head = 0;
        int tail = 0;
        int size = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch (cmd) {
                case "push": {
                    int x = Integer.parseInt(st.nextToken());
                    q[tail] = x;
                    tail = (tail + 1) % n;
                    size++;
                    break;
                }
                case "pop": {
                    if (size == 0) sb.append(-1).append('\n');
                    else {
                        sb.append(q[head]).append('\n');
                        head = (head + 1) % n;
                        size--;
                    }
                    break;
                }
                case "size":
                    sb.append(size).append('\n');
                    break;

                case "empty":
                    sb.append(size == 0 ? 1 : 0).append('\n');
                    break;

                case "front":
                    sb.append(size == 0 ? -1 : q[head]).append('\n');
                    break;

                case "back":
                    if (size == 0) sb.append(-1).append('\n');
                    else {
                        int backIdx = (tail - 1 + n) % n;
                        sb.append(q[backIdx]).append('\n');
                    }
                    break;
            }
        }

        System.out.print(sb.toString());
    }
}
