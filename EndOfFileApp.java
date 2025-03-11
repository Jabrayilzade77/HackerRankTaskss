import java.util.Scanner;

public class EndOfFileApp {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int i = 1;
        while(scan.hasNext()) {
            String input = scan.nextLine();
            if(input.contains("end-of-file.")) {
                System.out.println(i + " " + input);
                break;
            }
            System.out.println(i + " " + input);
            i++;
        }
    }
}
