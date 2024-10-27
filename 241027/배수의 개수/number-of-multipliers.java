import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count3 = 0;
        int count5 = 0;
        
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n % 3 == 0) {
                count3++;
            }
            if (n % 5 == 0) {
                count5++;
            }
        }
        
        System.out.printf("%d %d", count3, count5);
        br.close();
    }
}