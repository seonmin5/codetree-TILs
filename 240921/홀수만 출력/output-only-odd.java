import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    
    public static boolean isOdd(int n) {
        return n % 2 == 1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a, b;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());

        for (int i = a; i <= b; i++) {
            if (isOdd(i)) {
                System.out.printf("%d ", i);
            }
        }
        
    }
}