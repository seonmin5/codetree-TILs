import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static String compare(int s, int a) {
        if (s == 0 && a >= 19) {
            return "MAN";   
        } else if (s == 0) {
            return "BOY";
        } else if (s == 1 && a >= 19) {
            return "WOMAN";
        } else {
            return "GIRL";
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + "\n" + br.readLine());
        int sex = Integer.parseInt(st.nextToken());
        int age = Integer.parseInt(st.nextToken());
        br.close();

        System.out.print(compare(sex, age));
    }
}