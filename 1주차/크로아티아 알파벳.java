import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int cnt = 0;

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);

            switch (now) {
                case 'c':
                    if (i + 1 < str.length() && (str.charAt(i + 1) == '=' || str.charAt(i + 1) == '-')) {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                case 'd':
                    if (i + 2 < str.length() && str.charAt(i + 1) == 'z' && str.charAt(i + 2) == '=') {
                        cnt++;
                        i += 2;
                    } else if (i + 1 < str.length() && str.charAt(i + 1) == '-') {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                case 'l':
                    if (i + 1 < str.length() && str.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                case 'n':
                    if (i + 1 < str.length() && str.charAt(i + 1) == 'j') {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                case 's':
                    if (i + 1 < str.length() && str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                case 'z':
                    if (i + 1 < str.length() && str.charAt(i + 1) == '=') {
                        cnt++;
                        i++;
                    } else {
                        cnt++;
                    }
                    break;

                default:
                    cnt++;
                    break;
            }
        }

        System.out.println(cnt);
    }
}