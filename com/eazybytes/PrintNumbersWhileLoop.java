import java.util.Scanner;
public class PrintNumbersWhileLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a positive integer");
         int num = sc.nextInt();
         int i=1;
         System.out.println("Numbers from 1 to "+num+":");
         while(i<=num){
             System.out.println(i);
             i++;
         }

    }
}
