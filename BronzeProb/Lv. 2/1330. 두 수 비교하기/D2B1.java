package BronzeProb.두_수_비교하기;

// 1330

import java.util.Scanner;
public class D2B1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A > B)
            System.out.println(">");
        else if (A < B)
            System.out.println("<");
        else
            System.out.println("==");
    }
}