public class PrintElementsInArray {
    public static void main(String[] args){
        int[] arr = new int[]{1,2,3,4,5};
        printElements(arr);
    }

    public static void printElements(int[] arr){
        for(int i : arr){
            System.out.println(i);
        }
    }


}
