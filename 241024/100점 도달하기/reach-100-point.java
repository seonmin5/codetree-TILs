import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void grade(int n) {
        for (int i = n; i <= 100; i++) {
            if (i >= 90) {
                System.out.printf("%s ", "A");
            } else if (i >= 80) {
                System.out.printf("%s ", "B");
            } else if (i >= 70) {
                System.out.printf("%s ", "C");
            } else if (i >= 60) {
                System.out.printf("%s ", "D");
            } else {
                System.out.printf("%s ", "F");
            }
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        grade(n);
        br.close();
    }
}