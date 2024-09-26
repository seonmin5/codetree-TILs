import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        // 2.  정수 부분과 소수 부분의 계산 로직을 나눠서 푸는 방법
       System.out.printf("%d." ,a/b);
       a %= b;
       for (int i = 0; i < 20; i++) {
           a *= 10;
           System.out.print(a/b);
           a %= b;
       }
    }
}