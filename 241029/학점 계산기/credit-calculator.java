import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        float arr[] = new float[n];
        float sum = 0;

        for (int i = 0; i < n; i++) { 
            arr[i] = Float.parseFloat(st.nextToken());
            sum += arr[i];
        }

        float avg = (float) sum / n;
        System.out.printf("%.1f\n", avg);
        if (avg >= 4.0) {
            System.out.print("Perfect");
        } else if (avg >= 3.0) {
            System.out.print("Good");
        } else {
            System.out.print("Poor");
        }

        br.close();
    }
}