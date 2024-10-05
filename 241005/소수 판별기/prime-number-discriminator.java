import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isDecimal(int n) {
        if (n <= 1) {
            return false; 
        }

        for (int i = 2; i <= n/2; i++) {
            if (n%i == 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        if (isDecimal(n)) {
            System.out.println("P");
        } else {
            System.out.println("C");
        }
    }
}