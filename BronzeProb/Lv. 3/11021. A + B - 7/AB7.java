package BronzeProb.Third.AB7;

    import java.util.Scanner;

    public class AB7 {
        public static void main(String args[]) {

            Scanner scanner = new Scanner(System.in);

            int A = scanner.nextInt();

            for (int i = 1; i <= A; i++) {
                int C = scanner.nextInt();
                int D = scanner.nextInt();

                System.out.println("Case #" + i + ": " + (C + D));
            }
            scanner.close();
        }
    }
