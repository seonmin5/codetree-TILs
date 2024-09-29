import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;

        for (int i = 1; i <= n; i++) {
            if (i%100==0 && i%400!=0) {
            } else if (i%4==0) {
                cnt++;
            } else {
            }
        }

        System.out.println(cnt);
    }
}