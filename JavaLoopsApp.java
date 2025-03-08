    package hackerRankExamples;

    import java.util.Scanner;

    public class JavaLoopsApp {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int q = scan.nextInt();
            scan.nextLine();

            for (int i = 0; i < q; i++) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                int n = scan.nextInt();

                int s = a;
                for (int j = 0; j < n; j++) {
                    s += (int) Math.pow(2, j) * b;
                    System.out.print(s + " ");
                }
                System.out.println();
                scan.nextLine();

            }
        }
    }
