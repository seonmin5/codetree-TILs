import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int result = a;

        if (a % 2 == 1) {
            result = a + 3;
        }
        if (result % 3 == 0) {
            result /= 3;
        } else if (a % 3 == 0) {
            result = a / 3;
        }
        
        System.out.println(result);

        br.close();
    }
}