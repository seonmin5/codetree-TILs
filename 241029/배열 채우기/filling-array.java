import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());
        int arr[] = new int[10];
        int index = 0;

        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 0) {
                index += i;
                break;
            }
        }

        if (index > 0) {
            for (int i = index-1; i >= 0; i--) {
                System.out.printf("%d ", arr[i]);
            }
        } else {
            for (int i = arr.length-1; i >= 0; i--) {
                System.out.printf("%d ", arr[i]);
            }
        }

        br.close();
    }
}