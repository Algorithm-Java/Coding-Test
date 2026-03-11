import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(re.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(re.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(re.readLine());
        st = new StringTokenizer(re.readLine());
        for (int i = 0; i < M; i++) {
            System.out.println(search(arr,Integer.parseInt(st.nextToken())));
        }
    }
    public static int search(int[] arr, int num) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == num) return 1;
            else if (num > arr[mid]) left = mid + 1;
            else right = mid - 1;
        }
        return 0;
    }
}
