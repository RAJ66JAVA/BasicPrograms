public class SmallestNumber {
    public static void main(String[] args){
        int a = 10, b = 20, c = 30 ;
        int small;

        if(a<b)
            small=a;
        else
            small=b;

        if(c<small)
            small=c;

        System.out.println("Smallest number: " +small);
    }
}
