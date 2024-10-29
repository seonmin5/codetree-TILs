import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int isMultipleOf2(int n) {
        if (n % 2 == 0) return 1;
        else return 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int sum = 0;
        int index = 0;
        int count = 0;
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                index += i;
                break;
            }
        }

        if (index > 0) {
            for (int i = 0; i < index; i++) {
                if (isMultipleOf2(arr[i]) == 1) {
                    count++;
                    sum += arr[i];
                }
            }
        } else {
            for (int i = 0; i < 10; i++) {
                if (isMultipleOf2(arr[i]) == 1) {
                    count++;
                    sum += arr[i];
                }
            }
        }

        System.out.printf("%d %d", count, sum);
        br.close();
    }
}