import java.util.Scanner;
public class Percentage {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number of subject1:");
        int a = sc .nextInt();
        System.out.println("enter the number of subject2:");
        int b = sc.nextInt();
        System.out.println("enter the number of subject3:");
        int c = sc.nextInt();
        System.out.println("enter the number of subject4:");
        int d = sc.nextInt();
        System.out.println("enter the number of subject5:");
        int e = sc.nextInt();
        int sum=a+b+c+d+e;
        float percentage=(sum/500.0f)*100;
        System.out.println("the percentage is:"+percentage);
        sc.close();
    }

    
}
