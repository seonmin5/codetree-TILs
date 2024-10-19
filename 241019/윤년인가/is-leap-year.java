import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static boolean isLeapYear(int n) {
        if (n % 100 == 0 && n % 400 != 0) {
            return false;
        } else if (n % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y = Integer.parseInt(br.readLine());
        br.close();
        System.out.print(isLeapYear(y));
    }
}