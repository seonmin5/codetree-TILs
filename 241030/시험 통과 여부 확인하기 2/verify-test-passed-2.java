import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        int[][] arr = new int[n][4];
        float[] result = new float[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine().trim());
            for (int j = 0; j < 4; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) {
                sum += arr[i][j];
            }
            float avg = (float) sum / 4;
            result[i] = avg;

            if (result[i] >= 60) {
                System.out.println("pass");
                count++;
            } else {
                System.out.println("fail");
            }
        }

        System.out.println(count);
        br.close();
    }
}