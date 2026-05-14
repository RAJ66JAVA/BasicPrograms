import java.util.Scanner;
public class PrintAlternativeElementsInArray {
    public static int[] createArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of Array :");
        int count = sc.nextInt();
        int[] arr = new int[count];

        for(int i=0; i<arr.length; i++){
            System.out.println("Enter "+ (i+1) +"element :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public static void displayElements(int[] arr){
        for(int i =0; i<arr.length;i+=2){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args){
        int[] array = createArray();

        System.out.println("Result :");
        displayElements(array);
    }
}
