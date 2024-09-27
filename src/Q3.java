import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length in centimeters : ");
        double length = scanner.nextFloat();
        double inches = length/2.54;
        int feet = (int)inches / 12;
        inches = inches%12;

        System.out.println(length + "cm : " + feet + " feet " + inches + " inches");
    }
}
