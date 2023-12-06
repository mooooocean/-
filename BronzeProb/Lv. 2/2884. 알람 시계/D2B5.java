package BronzeProb.알람_시계;

// 2884

import java.util.Scanner;
public class D2B5 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            int hour = scanner.nextInt();
            int min = scanner.nextInt();

            if(min < 45)
            {
                hour--;
                min = 60 - (45 - min);

                if(hour < 0)
                {
                    hour = 23;
                }
                System.out.println(hour + " " + min);
            }
            else
            {
                System.out.println(hour + " " + (min - 45));
            }
        }
    }

