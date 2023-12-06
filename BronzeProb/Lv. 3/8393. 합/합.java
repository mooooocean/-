package BronzeProb.Third.합;
// 합

import java.util.Scanner;

public class 합 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.close();

        int a = 0;

        for (int i = 1; i <= n; i++) {
            a += i;

        }
        System.out.println(a);
    }
}