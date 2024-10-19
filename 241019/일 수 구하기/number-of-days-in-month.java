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

    // 31: 1, 3, 5, 7, 8, 10, 12
    // 30: 4, 6, 9, 11    
    private static int printDate(int n) {
        if (n <= 7 && n % 2 == 1 || n >= 8 && n % 2 == 0) {
            return 31;
        } else {
            return 30;
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        // 28 or 29(윤년): 2
        if (n == 2) {
            if (isLeapYear(n)) {
                System.out.print(29);
            } else {
                System.out.print(28);
            }
        } else {
            System.out.print(printDate(n));
        }
    }
}