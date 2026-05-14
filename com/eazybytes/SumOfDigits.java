import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive integer");
        int num = sc.nextInt();
        int sum=0,n=0;
        System.out.println("sum of digits of " + num + " are :");
        while(num>0) {

            n = num % 10;
            sum += n;
            num = num/10;
        }
        System.out.println(sum);
    }
}
