import java.util.Scanner;
public class DigitsOfNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any positive integer");

        int num = sc.nextInt();

        String digits = Integer.toString(num);
        for(int i=0; i<digits.length();i++)
            System.out.print(digits.charAt(i)+" ");

    }
}
