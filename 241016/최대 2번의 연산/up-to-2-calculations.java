import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static int compute(int n) {
        if (n % 2 == 0) {
            n = n/2;
        }
        if (n % 2 == 1) {
            n = (n+1)/2;
        }
        return n;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(compute(a));
        br.close();
    }
}