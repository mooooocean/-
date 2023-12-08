package BronzeProb.Lv8.세탁소사장동혁;
// 2720

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int m = sc.nextInt();

            int quarter = m / 25;
            m %= 25;

            int dime = m / 10;
            m %= 10;

            int nickel = m / 5;
            m %= 5;

            int penny = m;

            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
        sc.close();
    }
}