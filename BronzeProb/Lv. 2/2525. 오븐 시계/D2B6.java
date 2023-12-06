package BronzeProb.오븐_시계;

// 2525

import java.util.Scanner;
public class D2B6 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int min = 60 * A + B;
            min += C;

            int hour = (min / 60) % 24;
            int minute = min % 60;

            System.out.println(hour + " " + minute);
        }
}
