import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static void descNumber(int a, int b) {
        if (b >= a) {
            for (int i = b; i >= a; i--) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = a; i >= b; i--) {
                System.out.printf("%d ", i);
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();
        descNumber(a, b);
    }
}