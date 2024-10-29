import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int arr[] = new int[10];
        int index = 0;
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] >= 250) {
                index += i;
                break;
            }
        }

        if (index > 0) {
            for (int i = 0; i < index; i++) {
                sum += arr[i];
            }
            avg = (double) sum / index;
        } else {
            for (int i = 0; i < 10; i++) {
                sum += arr[i];
            }
            avg = (double) sum / 10;            
        }
        System.out.printf("%d %.1f", sum, avg);
        br.close();
    }
}