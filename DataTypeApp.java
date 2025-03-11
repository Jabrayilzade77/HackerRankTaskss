import java.util.Scanner;

public class DataTypeApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        System.out.println();
        for (int i = 0; i < n; i++) {
            try {
                long num = scan.nextLong();
                System.out.println(num + " can be fitted in:");
                boolean canFit = false;

                if (num >= Byte.MIN_VALUE && num <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                    canFit = true;
                }
                if (num >= Short.MIN_VALUE && num <= Short.MAX_VALUE) {
                    System.out.println("* short");
                    canFit = true;
                }
                if (num >= Integer.MIN_VALUE && num <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                    canFit = true;
                }
                if (num >= Long.MIN_VALUE && num <= Long.MAX_VALUE) {
                    System.out.println("* long");
                    canFit = true;
                }

                if (!canFit) {
                    System.out.println(num + " can't be fitted anywhere");
                }
            } catch (Exception e) {
                System.out.println(scan.next() + " can't be fitted anywhere."); // Clear the invalid input
            }
        }
        scan.close(); // Close the scanner to prevent resource leaks
        }
    }

