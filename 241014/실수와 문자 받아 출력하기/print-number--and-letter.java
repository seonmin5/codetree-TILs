import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        System.out.println(c);
        for (int i = 0; i < 2; i++) {
            Double n = Double.parseDouble(br.readLine());
            System.out.printf("%.2f\n", n);
        }
        br.close();
    }
}