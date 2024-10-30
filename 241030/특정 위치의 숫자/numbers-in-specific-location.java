import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int arr[] = new int[10];

        for (int i = 0; i <10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        System.out.print(arr[2] + arr[4] + arr[9]);
        br.close();
    }
}