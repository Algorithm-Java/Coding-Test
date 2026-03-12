package 숫자카드2;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        HashMap<Integer,Integer> map = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            int x = Integer.parseInt(st.nextToken());
            map.put(x,map.getOrDefault(x,0)+1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < M; i++) {
            int x = Integer.parseInt(st.nextToken());
            sb.append(map.getOrDefault(x,0));

            if(i != M - 1)
                sb.append(' ');
        }

        System.out.print(sb.toString());
    }
}
