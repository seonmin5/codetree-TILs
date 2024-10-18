import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + "\n" + br.readLine());
        float a = Float.parseFloat(st.nextToken());
        float b = Float.parseFloat(st.nextToken());
        br.close();

        if (a >= 1.0 && b >= 1.0) {
            System.out.println("High");
        } else if (a >= 0.5 && b >= 0.5) {
            System.out.println("Middle");
        } else {
            System.out.println("Low");
        }

    }
}