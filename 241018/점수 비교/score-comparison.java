import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        int mathA = Integer.parseInt(st.nextToken());
        int engA = Integer.parseInt(st.nextToken());
        int mathB = Integer.parseInt(st.nextToken());
        int engB = Integer.parseInt(st.nextToken());
        br.close();

        System.out.print((mathA > mathB && engA > engB) ? 1 : 0);
    }
}