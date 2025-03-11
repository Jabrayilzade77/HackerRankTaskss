import java.util.Scanner;

public class StaticInitializerBlockApp {
    static int b;
    static int h;
    static boolean flag = false;

    static {
        Scanner scan = new Scanner(System.in);
        b = scan.nextInt();
        h = scan.nextInt();
        if(b <= 0 || h <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            flag = true;
        }
    }
    public static void main(String[] args) {
        if(flag){
            int area=b*h;
            System.out.print(area);
        }
    }
}
