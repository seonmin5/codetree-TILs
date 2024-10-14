import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(br.readLine());
        System.out.printf("%.2f", a+1.5);
        br.close();
    }
}