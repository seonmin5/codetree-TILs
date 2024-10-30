import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int arr[] = new int[10];
        int isEvenIdx = 0;
        int isOddIdx = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < 10; i+=2) {
            isOddIdx += arr[i];
        }

        for (int i = 1; i < 10; i+=2) {
            isEvenIdx += arr[i];
        }

        if (isEvenIdx >= isOddIdx) {
            System.out.print(isEvenIdx - isOddIdx);
        } else {
            System.out.print(isOddIdx - isEvenIdx);
        }

        br.close();
    }
}