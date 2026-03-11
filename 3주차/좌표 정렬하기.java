import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(re.readLine());
        int[][] arr = new int[A][2];
        for (int i = 0; i < A; i++) {
            StringTokenizer st = new StringTokenizer(re.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }
        Arrays.sort(arr, (a, b) -> {
                    if (a[0] != b[0]) return a[0] - b[0];
                    return a[1] - b[1];

                }
        );
        for (int[] ints : arr) {
            System.out.println(ints[0] + " " + ints[1]);
        }

    }
}
