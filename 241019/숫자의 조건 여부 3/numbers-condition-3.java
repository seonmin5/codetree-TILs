import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        br.close();

        if (a % 13 == 0 || a % 19 == 0) {
            System.out.print("True");
        } else {
            System.out.print("False");
        }
    }
}