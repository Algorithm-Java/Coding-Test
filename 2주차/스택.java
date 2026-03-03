import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] stack = new int[n];
        int top = 0;


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            switch(cmd) {
                case "push":
                    int x = Integer.parseInt(st.nextToken());
                    stack[top++] = x;
                    break;
                case "pop":
                    if(top != 0)
                        System.out.println(stack[--top]);
                    else
                        System.out.println(-1);
                    break;
                case "size":
                    System.out.println(top);
                    break;
                case "empty":
                    if(top == 0)
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "top":
                    if(top == 0)
                        System.out.println(-1);
                    else
                        System.out.println(stack[top - 1]);
                    break;
            }
        }
    }
}