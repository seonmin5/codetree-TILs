import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        float arr[] = new float[8];
        float sum = 0;

        for (int i = 0; i < 8; i++) {
            arr[i] = Float.parseFloat(st.nextToken());
            sum += arr[i];
        }

        float avg = (float) sum/8;
        System.out.printf("%.1f", avg);
        br.close();
    }
}