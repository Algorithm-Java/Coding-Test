import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader re = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<String> arr = new ArrayList<String>();
       
        String s = re.readLine();
        Collections.addAll(arr, "c=","c-","dz=","d-","lj","nj","s=","z="); 
        for(String arr1 : arr) {
        	s=s.replace(arr1, "*");
        }
        int result = s.length();
        bw.write(result+" ");

        re.close();
        bw.flush();
        bw.close();
    }
}
