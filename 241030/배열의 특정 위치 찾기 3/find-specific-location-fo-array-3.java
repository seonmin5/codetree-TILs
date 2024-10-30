import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        
        int arr[] = new int[100];
        int index = 0;
        int sum = 0;

        for (int i = 0; i < 100; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                index = i;
                break;
            }
        }

        for (int i = index-1; i > index-4; i--) {
            sum += arr[i];
        }

        System.out.print(sum);
        br.close();
    }
}