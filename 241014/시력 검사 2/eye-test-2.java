import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double eye = Double.parseDouble(br.readLine());
        if (eye >= 1.0) {
            System.out.print("High");
        } else if (eye >= 0.5) {
            System.out.print("Middle");
        } else {
            System.out.print("Low");
        }
        br.close();
    }
}