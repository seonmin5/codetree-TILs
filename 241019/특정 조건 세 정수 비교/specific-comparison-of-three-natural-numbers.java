import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int minimumValue(int a, int b, int c) {
        if (a < b && a < c) {
            return 1;
        } return 0;
    }

    private static int isEqual(int a, int b, int c) {
        if (a == b && b == c) {
            return 1;
        } return 0;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine() + " " + br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        br.close();

        System.out.printf("%d %d", minimumValue(a,b,c), isEqual(a,b,c));
    }
}