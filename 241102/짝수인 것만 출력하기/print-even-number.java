import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int idx = 0;
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(st.nextToken());
            if (j % 2 == 0) {
                arr[idx] = j;
                idx++;
            }
        }

        for (int i = 0; i < idx; i++) {
            System.out.printf("%d ", arr[i]);
        }

        br.close();
    }
}