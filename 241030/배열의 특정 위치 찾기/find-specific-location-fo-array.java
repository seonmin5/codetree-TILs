import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int arr[] = new int[10];
        int isEven = 0;
        int isMultipleOf3 = 0;
        float avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < 10; i+=2) {
            isEven += arr[i];
        }

        isMultipleOf3 = arr[2] +arr[5] + arr[8];
        avg = (float) isMultipleOf3 / 3;

        System.out.printf("%d %.1f", isEven, avg);
        br.close();
    }
}