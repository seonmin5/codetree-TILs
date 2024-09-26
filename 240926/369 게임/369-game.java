import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i=1; i<=n; i++) {
            // 3의 배수이거나 3,6,9 중 하나 -> 0
            if (i % 3 == 0 || String.valueOf(i).contains("3") || String.valueOf(i).contains("6") || String.valueOf(i).contains("9")) {
                System.out.printf("%d ", 0);
            } else {
                System.out.printf("%d ", i);
            }
        }
    }
}