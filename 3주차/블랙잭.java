import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(re.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int MaxSum = 0;
        st = new StringTokenizer(re.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            for (int j = i+1; j < N; j++) {
                for (int k = j+1; k <N; k++) {
                   int sum = arr[i]+arr[j]+arr[k];
                    if(sum>MaxSum && sum<=M){
                        MaxSum = sum;
                    }
                }
            }
        }

        System.out.println(MaxSum);
    }
}
