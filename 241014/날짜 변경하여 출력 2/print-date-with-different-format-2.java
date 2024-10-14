import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] dateParts = input.split("-");
        
        int mm = Integer.parseInt(dateParts[0]);
        int dd = Integer.parseInt(dateParts[1]);
        int yyyy = Integer.parseInt(dateParts[2]);
        
        System.out.printf("%d.%d.%d", yyyy, mm, dd);
        br.close();
    }
}