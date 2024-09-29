import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int classrommCount = 0;
        int corridorCount = 0;
        int bathroomCount = 0;

        for (int i = 1; i <= n; i++) {
            if (i%12 == 0) {
                bathroomCount++;
            } else if (i%3 == 0) {
                corridorCount++;
            } else if (i%2 == 0) {
                classrommCount++;
            }
        }

        System.out.printf("%d %d %d", classrommCount, corridorCount, bathroomCount);

    }
}