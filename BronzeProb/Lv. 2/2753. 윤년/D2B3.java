package BronzeProb.윤년;

// 2753

import java.util.Scanner;
public class D2B3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        scanner.close();

        if(y%4 == 0) {
            if(y%400 == 0)
                System.out.println("1");
            else if (y%100 == 0)
                System.out.println("0");
            else
                System.out.println("1");
        }
        else System.out.println("0");
    }
}
