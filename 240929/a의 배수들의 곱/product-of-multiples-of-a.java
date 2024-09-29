import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] inputs = br.readLine().split(" ");
        int a = Integer.parseInt(inputs[0]);
        int b = Integer.parseInt(inputs[1]);
        br.close();

        int result = 1;
        for (int i=1; i<=b; i++) {
            if (i%a==0) {
                result*=i;
            }
        }

        System.out.println(result);
    }
}