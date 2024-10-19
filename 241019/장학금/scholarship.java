import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine());
        int midExam = Integer.parseInt(st.nextToken());
        int finalExam = Integer.parseInt(st.nextToken());
        br.close();

        if (midExam >= 90) {
            if (finalExam >= 95) {
                System.out.print("100000");
            } else if (finalExam >= 90) {
                System.out.print("50000");
            } else {
                System.out.print("0");
            }
        } else {
            System.out.print("0");
        }
    }
}