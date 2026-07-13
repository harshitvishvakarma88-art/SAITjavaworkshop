import java.util.Scanner;

public class GreatestOfThreeNeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println("Greatest number = " + a);
            } else {
                System.out.println("Greatest number = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest number = " + b);
            } else {
                System.out.println("Greatest number = " + c);
            }
        }

        sc.close();
    }
}