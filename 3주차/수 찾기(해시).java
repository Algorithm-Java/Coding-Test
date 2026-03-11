import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> set = new HashSet<>();
        int N = Integer.parseInt(re.readLine());
        StringTokenizer st = new StringTokenizer(re.readLine());
        for (int i = 0; i <N; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        int M = Integer.parseInt(re.readLine());
        st = new StringTokenizer(re.readLine());
        for (int i = 0; i <M ; i++) {
            if(set.contains(Integer.parseInt(st.nextToken()))){
                System.out.println("1");
            }else
                System.out.println("0");
        }
    }
}
