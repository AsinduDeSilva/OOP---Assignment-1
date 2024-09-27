import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name : ");
        String first = scanner.next();
        String middle = scanner.next();
        String last = scanner.next();

        System.out.println(last + ", " + first + " " + middle.charAt(0) + ".");
    }
}
