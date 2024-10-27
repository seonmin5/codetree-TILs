import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            if ((i % 2 == 0 && i % 4 != 0) || ((i / 8) % 2 == 0) || ((i % 7) < 4)) {
                continue;
            } else {
                System.out.printf("%d ", i);
            }
        }

        br.close();
    }
}