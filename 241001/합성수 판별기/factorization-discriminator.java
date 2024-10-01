import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static boolean compositeNumber(int n) {
        if (n<=2) return false;
        for (int i=2; i<n; i++) {
            if (n%i==0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (compositeNumber(n)) {
            System.out.println("C");
        } else {
            System.out.println("N");
        }
    }
}