import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void printNumber(String c, int n) {
        if (c.equals("A")) {
            for (int i = 1; i <= n; i++) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = n; i >= 1; i--) {
                System.out.printf("%d ", i);
            }
        }  
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        String c = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        br.close();
        printNumber(c, n);
    }
}