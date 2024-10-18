import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) {
            System.out.print("true");
        } else {
            System.out.print("false");
        }
    }
}