import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        if (input.equals("S")) {
            System.out.println("Superior");
        } else if (input.equals("A")) {
            System.out.println("Excellent");
        } else if (input.equals("B")) {
            System.out.println("Good");
        } else if (input.equals("C")) {
            System.out.println("Usually");
        } else if (input.equals("D")) {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }

        br.close();
    }
}