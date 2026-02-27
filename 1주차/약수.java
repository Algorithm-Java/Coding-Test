import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count;
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();

        int [] numArr = new int[count];
        for (int i = 0; i < count; i++) {
            numArr[i] = sc.nextInt();
        }

        int max,min;
        min = numArr[0];
        max = numArr[0];
        for(int i=0;i<numArr.length; i++){
            if(numArr[i]<min){
                min = numArr[i];
            }
            if(numArr[i]>max){
                max = numArr[i];
            }
        }
        System.out.println(min*max);
        }
    }
