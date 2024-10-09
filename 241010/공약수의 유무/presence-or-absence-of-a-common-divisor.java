import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        br.close();
        
        boolean hasCommonDivisor = false;
        int gcd = 960;
        for (int i = a; i <= b; i++) {
            if (gcd % i == 0) {
                hasCommonDivisor = true;
                break;
            }
        }

        if (hasCommonDivisor) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}