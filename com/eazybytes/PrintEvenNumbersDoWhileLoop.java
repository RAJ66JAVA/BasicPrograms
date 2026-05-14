import java.util.Scanner;

public class PrintEvenNumbersDoWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a positive integer");
        int num = sc.nextInt();
        System.out.println("even numbers  upto " + num + "are :");
        int i = 1;
        do {
            if (i % 2 == 0)
                System.out.println(i);
            i++;
        } while (i <= num);
    }
}

