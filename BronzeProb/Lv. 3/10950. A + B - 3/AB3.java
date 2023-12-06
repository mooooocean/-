package BronzeProb.Third.AB3;
// A + B -3
import java.util.Scanner;

public class AB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            System.out.println(A + B);
        }
    }
}
