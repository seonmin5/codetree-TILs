import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int sum = 0;
        int index = 0;
        float avg = 0;
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                index += i;
                break;
            } else {
                sum += arr[i];
            }
        }
        if (index > 0) {
            avg = (float) sum/index;   
        } else {
            avg = (float) sum/10;
        }
        System.out.printf("%d %.1f", sum, avg);
        br.close();
    }
}