import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        br.close();

        if (m > 2 && m < 6) {
            System.out.print("Spring");
        } else if (m >= 6 && m < 9) {
            System.out.print("Summer");
        } else if (m >= 9 && m < 12) {
            System.out.print("Fall");
        } else {
            System.out.print("Winter");
        }
    }
}