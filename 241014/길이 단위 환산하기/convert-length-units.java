import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float n = Float.parseFloat(br.readLine());
        System.out.printf("%.1f", n*30.48);
        br.close();
    }
}