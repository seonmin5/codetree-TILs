import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        char arr[] = new char[10];
        
        for (int i = 0; i < 10; i++) {
            arr[i] = st.nextToken().charAt(0);
        }

        System.out.printf("%c %c %c", arr[1], arr[4], arr[7]);
        br.close();
    }
}