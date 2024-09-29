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

        int prod = 1;
        for (int i = a; i <= b; i++) {
            prod *= i;
        }

        System.out.println(prod);
    }
}