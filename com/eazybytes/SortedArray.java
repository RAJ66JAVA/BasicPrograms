import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of Array :");
        int count = sc.nextInt();
        int[] arr = new int[count];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter " + (i + 1) + "element :");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < count; i++) {
            for (int j = i + 1; j < count; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
       System.out.println("Result :");
        for(int i : arr){
            System.out.println(i);
        }
    }

}
