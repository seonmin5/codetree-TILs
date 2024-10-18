import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int mathA = Integer.parseInt(st1.nextToken());
        int engA = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int mathB = Integer.parseInt(st2.nextToken());
        int engB = Integer.parseInt(st2.nextToken());
        br.close();

        if (mathA > mathB && engA > engB) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}