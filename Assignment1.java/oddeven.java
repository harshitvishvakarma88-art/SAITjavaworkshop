public class oddeven {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Positive");

            if (n % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }

        } else if (n < 0) {
            System.out.println("Negative");

        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}