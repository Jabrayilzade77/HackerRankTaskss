import java.util.Scanner;

public class SubstringApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(s.substring(a, b));
    }
}
