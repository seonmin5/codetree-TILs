import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n >= 0 && n <= 200) {
                sum += n;
                count++;
            }
        }

        float avg = (float) sum/count;
        System.out.printf("%d %.1f", sum, avg);
        br.close();
    }
}