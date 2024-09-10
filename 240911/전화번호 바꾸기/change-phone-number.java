import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tel = sc.nextLine();
        String telLine[] = tel.split("-");
        System.out.printf("%s-%s-%s", telLine[0], telLine[2], telLine[1]); 
    }
}