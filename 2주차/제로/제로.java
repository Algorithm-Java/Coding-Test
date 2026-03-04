package 제로;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int k = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        long sum = 0;

        for(int i = 0; i < k; i++) {
            int x = Integer.parseInt(br.readLine());

            if( x == 0)
                sum -= stack.pop();
            else {
                stack.push(x);
                sum += x;
            }
        }

        System.out.println(sum);
    }
}
