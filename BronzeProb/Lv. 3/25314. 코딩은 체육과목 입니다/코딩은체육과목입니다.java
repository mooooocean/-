package BronzeProb.Third.코딩은_체육과목_입니다;

import java.util.Scanner;

public class 코딩은체육과목입니다 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String str = "";
        scanner.close();

        for(int i = 1; i <= n/4; i++) {
            str += "long";
        }
        System.out.println(str + " int");
    }
}