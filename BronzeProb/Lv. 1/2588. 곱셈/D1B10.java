package BronzeProb.곱셈;
/*
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
(곱셈 공식)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 */
import java.util.Scanner;
public class D1B10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

    //  (3)
        System.out.println(A * (B % 10));
    //  (4)
        System.out.println(A * (B % 100 / 10));
    //  (5)
        System.out.println(A * (B / 100));
    //  (6)
        System.out.println(A * B);
    }
}