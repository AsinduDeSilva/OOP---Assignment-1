import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input an odd length word : ");
        String str = scanner.next();
        int length = str.length();
        if(length % 2 == 0){
            System.out.println("Not an odd length word!!!");
        }else{
            System.out.println("Middle character of " + str + "is : " + str.charAt(length / 2));
        }
    }
}
