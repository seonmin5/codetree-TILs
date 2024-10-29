import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            int j = Integer.parseInt(st.nextToken());
            if (n % 2 == 0) {
                arr[i] = j;
            }
        }

        for (int i = arr.length-1; i >= 0; i--) {
            System.out.printf("%d ", arr[i]);
        }

        br.close();
    }
}