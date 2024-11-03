import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int arr2[] = new int[10];

        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        for (int i = 0; i < n; i++) {
            n2 = Integer.parseInt(st.nextToken());
            for (int j = 0; j < 10; i++) {
                if (n2 == arr[j]) {
                    arr2[j]++;
                }
            }
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr2[i]);
        }

        br.close();
    }
}