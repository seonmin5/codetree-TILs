import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int getSum(int a, int n) {
        return a += n;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        br.close();

        for (int i = 0; n > i; i++) {
            int temp = getSum(a, n);
            System.out.println(temp);
            a += n;
        }

    }
}