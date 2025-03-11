import java.util.Scanner;

public class ReversedStringApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str  = scan.nextLine();

        String reversedStr  = new StringBuilder(str).reverse().toString();

        if(str.equals(reversedStr)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
