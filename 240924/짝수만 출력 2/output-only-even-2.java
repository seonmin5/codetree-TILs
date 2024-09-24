import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static int isEven(int n) {
        if (n % 2 == 0) {
            return n;
        } else {
            return n-1;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();

        int i = isEven(a);

        while (i >= b) {
            System.out.printf("%d ", i);
            i -= 2;
        }
    }
}