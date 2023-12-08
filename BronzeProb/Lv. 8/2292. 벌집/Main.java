package BronzeProb.Lv8.벌집;
// 2292

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int s = 1;
        int e = 2;

        if (N == 1) {
            System.out.print(1);
        }
        else {
            while (e <= N) {
                e = e + (6 * s);
                s++;
            }

            System.out.print(s);
        }
    }
}