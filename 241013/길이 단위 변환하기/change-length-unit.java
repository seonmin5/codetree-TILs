public class Main {
    private static double ftToMi(double n) {
        return n*30.48;
    }
    private static double MiToFt(double n) {
        return n*160934;
    }
    public static void main(String[] args) {
        System.out.printf("9.2ft = %.1fcm\n", ftToMi(9.2));
        System.out.printf("1.3mi = %.1fcm", MiToFt(1.3));
    }
}