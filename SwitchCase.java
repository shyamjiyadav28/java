
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        int age;
        System.out.println("enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        /*
         * if (age > 56) {
         * System.out.println("you are experienced");
         * } else if (age > 46) {
         * System.out.println("you are semi experienced");
         * } else if (age > 36) {
         * System.out.println("you are semi semi experienced");
         * } else {
         * System.out.println("you are not experienced");
         * }
         */
        switch (age) {
            case 18:
                System.out.println("you are going to become adult");
                // break;
            case 23:
                System.out.println("you are going to get job");
                break;
            default:
                System.out.println("enjoy your life");
        }
    }
}
