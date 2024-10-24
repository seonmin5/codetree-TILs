import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static void isMulti(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.printf("%d ", 1);
            } else {
                System.out.printf("%d ", 0);
            }
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        isMulti(n);
        br.close();
    }
}