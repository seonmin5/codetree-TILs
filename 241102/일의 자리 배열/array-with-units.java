import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int sum(int a, int b) {
        return (a+b) % 10;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine().trim());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int arr[] = new int[10];

        arr[0] = a;
        arr[1] = b;

        for (int i = 2; i < 10; i++) {
            arr[i] = sum(arr[i-2], arr[i-1]);
        }

        for (int i = 0; i< 10; i++) {
            System.out.printf("%d ", arr[i]);
        }

        br.close();
    }
}