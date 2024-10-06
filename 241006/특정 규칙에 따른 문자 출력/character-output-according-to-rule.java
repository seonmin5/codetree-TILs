import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    private static void printPattern(int n) {
        // 위쪽 패턴 수정
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n - i - 1; j++) {System.out.print("  ");}
            for(int j = 0; j <= i; j++) {System.out.print("@ ");}
            System.out.println();
        }

        // 아래쪽 패턴 출력
        for(int i = n - 2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {System.out.print("@ ");}
            System.out.println();
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        printPattern(n);
    }
}