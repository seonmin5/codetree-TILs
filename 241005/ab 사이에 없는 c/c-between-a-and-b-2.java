import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static boolean isMultiple(int n, int c) {
        // true
        return n % c == 0;
        }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        
        br.close();

        for (int i = a; i <= b; i++) {
            if (isMultiple(i, c)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}