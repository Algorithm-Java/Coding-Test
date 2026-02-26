import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String result = str.replace("c=", "*")
                .replace("c-", "*")
                .replace("dz=", "*")
                .replace("d-", "*")
                .replace("lj", "*")
                .replace("nj", "*")
                .replace("s=", "*")
                .replace("z=", "*");

        System.out.println(result.length());
    }
}
