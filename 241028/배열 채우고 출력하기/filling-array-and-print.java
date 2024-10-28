import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        String arr[] = new String[10];

        for (int i = 9; i >= 0; i--) {
            arr[i] = st.nextToken();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i]);
        }

        br.close();
    }
}