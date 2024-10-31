import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int idx = 0;
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] % 3 == 0) {
                idx += i;
                break;
            }
        }

        System.out.print(arr[idx-1]);

        br.close();
    }
}