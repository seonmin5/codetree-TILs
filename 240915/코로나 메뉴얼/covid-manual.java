import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count=0;

        for (int i=0; i<3; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String symtoms = st.nextToken();
            int temporature = Integer.parseInt(st.nextToken());

            if (symtoms.equals("Y") && temporature >= 37) {
                count++;
            }
        }

        if (count >= 2) {
            System.out.println("E");
        } else {
            System.out.println("N");
        }
    }
}