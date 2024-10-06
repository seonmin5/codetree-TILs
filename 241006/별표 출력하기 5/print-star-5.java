import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static void printStars(int n) {
        StringBuilder stars = new StringBuilder();
        for (int i=1; i<=n; i++) {
            for (int j=0; j<n; j++) {
                stars.append("*");
            }
            stars.append(" ");
        }
        System.out.println(stars.toString().trim());
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        for (int i=n; i>=1; i--) {
            printStars(i);
        }
    }
}