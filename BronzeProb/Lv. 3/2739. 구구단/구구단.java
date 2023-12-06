package BronzeProb.Third.구구단;
// 구구단
import java.util.Scanner;

public class 구구단 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        scanner.close();

        for (int i = 1; i < 10; i++) {
            System.out.println(N + "*" + i + "=" + N * i);

        }
    }
}
