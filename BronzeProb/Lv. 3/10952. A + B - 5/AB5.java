package BronzeProb.Third.AB5;

import java.util.Scanner;

public class AB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            if(A == 0 && B == 0){
                break;
            }
            System.out.println(A + B);
        }
    }
}