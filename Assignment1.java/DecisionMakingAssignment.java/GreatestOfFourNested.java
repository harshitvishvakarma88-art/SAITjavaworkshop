import java.util.Scanner;

public class GreatestOfFourNested {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();

        if (a > b) {
            if (a > c) {
                if (a > d) {
                    System.out.println("Greatest number = " + a);
                } else {
                    System.out.println("Greatest number = " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Greatest number = " + c);
                } else {
                    System.out.println("Greatest number = " + d);
                }
            }
        } else {
            if (b > c) {
                if (b > d) {
                    System.out.println("Greatest number = " + b);
                } else {
                    System.out.println("Greatest number = " + d);
                }
            } else {
                if (c > d) {
                    System.out.println("Greatest number = " + c);
                } else {
                    System.out.println("Greatest number = " + d);
                }
            }
        }

        sc.close();
    }
}