import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean count(int n) {
        if (n % 2 == 1 && n % 3 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 0; i < n; i++) {
            int j = Integer.parseInt(br.readLine());
            if (count(j)) {
                result += j;
            }
        }

        System.out.print(result);
        br.close();
    }
}