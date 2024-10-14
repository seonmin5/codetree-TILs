import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        float a = Float.parseFloat(st1.nextToken());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        float b = Float.parseFloat(st2.nextToken());

        System.out.printf("%.2f", a+b);

        br.close();
        
    }
}