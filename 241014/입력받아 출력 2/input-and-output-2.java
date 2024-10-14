import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputs = br.readLine();
        String [] input = inputs.split("-");
        
        int firstNumber = Integer.parseInt(input[0]);
        int secondNumber = Integer.parseInt(input[1]);

        System.out.printf("%d%d", firstNumber, secondNumber);

        br.close();
    }
}