import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[] arr = new int[n * 10];
        int count = 0;
        int i = 0;

        while (count < 2) {
            arr[i] = n * (i + 1) * 2;
            if (arr[i] % 5 == 0) {
                count++;
            }
            i++;
        }

        for (int j = 0; j < i; j++) {
            System.out.printf("%d ", arr[j]);
        }

        br.close();
    }
}