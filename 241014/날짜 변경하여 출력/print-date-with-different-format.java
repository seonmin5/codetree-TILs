import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        String [] input = inputs.split("\\.");

        int yyyy = Integer.parseInt(input[0]);
        int mm = Integer.parseInt(input[1]);
        int dd = Integer.parseInt(input[2]);

        System.out.printf("%d-%d-%d", mm, dd, yyyy);

        br.close();
    }
}