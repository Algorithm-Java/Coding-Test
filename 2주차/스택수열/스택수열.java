package 스택수열;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        int cur = 0;

        for(int i = 0; i < n; i++){
            int x = Integer.parseInt(br.readLine());

            while(cur < x){
                stack.push(++cur);
                sb.append("+\n");
            }

            if(!stack.isEmpty() && stack.peek() == x){
                stack.pop();
                sb.append("-\n");
            } else{
                System.out.println("NO");
                return;
            }
        }

        System.out.print(sb.toString());
    }
}
