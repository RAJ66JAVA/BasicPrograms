import java.util.Scanner;
public class LargestNumberInArray {
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
    public static void displayLargestNumber(int[] arr){
        int max = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        System.out.println("largest number is :"+ max);

    }

    public static void main(String[] args){
        int[] array = createArray();
        displayLargestNumber(array);

    }
}
