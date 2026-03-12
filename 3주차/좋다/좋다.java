package 좋다;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;

        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        for(int i = 0; i < N; i++) {
            int left = 0;
            int right = N - 1;
            long target = arr[i];

            while(left < right) {
                if(left == i) {
                    left++;
                    continue;
                }
                if(right == i) {
                    right--;
                    continue;
                }

                long sum = arr[left] + arr[right];

                if(sum == target) {
                    answer++;
                    break;
                } else if(sum < target)
                    left++;
                  else
                    right--;
            }
        }

        System.out.print(answer);
    }
}
