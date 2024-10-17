import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static String compute(int a) {
        if (a == 5) {
            return "A";
        } else if (a % 2 == 0) {
            return "B";
        }
        return "";
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        System.out.println(compute(a));
        br.close();
    }
}