import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int age1 = Integer.parseInt(st.nextToken());
        String gender1 = st.nextToken();
        
        st = new StringTokenizer(br.readLine());
        int age2 = Integer.parseInt(st.nextToken());
        String gender2 = st.nextToken();

        if (age1 >= 19 && gender1.equals("M") || age2 >= 19 && gender2.equals("M")) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        br.close();
    }
}