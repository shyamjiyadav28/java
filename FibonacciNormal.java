import java.util.Scanner;

public class FibonacciNormal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        long a1 = 0, a2 = 1, next;

        System.out.print("Fibonacci Series: ");
        if (n >= 1)
            System.out.print(a1 + " ");
        if (n >= 2)
            System.out.print(a2 + " ");

        for (int i = 3; i <= n; i++) {
            next = a1 + a2;
            System.out.print(next + " ");
            a1 = a2;
            a2 = next;
        }
    }
}
