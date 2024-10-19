import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    // 수학점수가 더 높은 학생
    // 수학점수가 동일하면 영어점수가 더 높은 학생
    private static String compare(int mathA, int engA, int mathB, int engB) {
        if (mathA > mathB || (mathA == mathB && engA > engB)) {
            return "A";
        } else {
            return "B";
        }
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine() + " " + br.readLine() + "\n" + br.readLine() + " " + br.readLine());
        int mathA = Integer.parseInt(st.nextToken());
        int engA = Integer.parseInt(st.nextToken());
        int mathB = Integer.parseInt(st.nextToken());
        int engB = Integer.parseInt(st.nextToken());
        br.close();

        System.out.print(compare(mathA, engA, mathB, engB));
        
    }
}