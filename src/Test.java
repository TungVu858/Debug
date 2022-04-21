import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            try {
                int n = sc.nextInt();
                System.out.println("OK");
            } catch (Exception e) {
                System.out.println("Eror");
            }
            System.out.println("Done");
        }
}
