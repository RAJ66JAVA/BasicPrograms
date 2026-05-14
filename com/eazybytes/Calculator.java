import java.util.Scanner;
public class Calculator {
    public static float sum(float c,float d){
        return c+d;
    }

    public static float subtract(float c,float d){
        return c-d;
    }

    public static float multiply(float c, float d) {
        return c*d;
    }

    public static float divide(float c,float d) {
        if(d != 0){
            return c/d;
        }else{
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your option :");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + sum(sc.nextFloat(), sc.nextFloat()));
                break;
            case 2:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + subtract(sc.nextFloat(), sc.nextFloat()));
                break;
            case 3:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + multiply(sc.nextFloat(), sc.nextFloat()));
                break;
            case 4:
                System.out.println("Enter two numbers:");
                System.out.println("Result: " + divide(sc.nextFloat(), sc.nextFloat()));
                break;

            default:
                System.out.println("Invalid option");
        }
    }
}
