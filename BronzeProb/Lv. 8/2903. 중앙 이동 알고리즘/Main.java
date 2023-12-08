package BronzeProb.Lv8.중앙이동알고리즘;
// 2903

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int w = 3;
        int[] d = new int[16];

        for (int i = 1; i < d.length; i++) {
            d[i] = w * w;
            w = w + (w - 1);
        }
        System.out.println(d[N]);

        sc.close();
    }
}