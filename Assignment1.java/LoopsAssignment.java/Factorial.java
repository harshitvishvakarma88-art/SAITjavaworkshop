import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
        long fact = 1;

        for(int i = 1; i <= n; i++) {
            fact *= i;
        }

        System.out.println("Factorial = " + fact);
    }
}