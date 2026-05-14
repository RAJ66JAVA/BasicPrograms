public class RecursionFunction {
    public static void main(String[] args) {
        printnumbers(1);

    }

    public static void printnumbers(int i) {
        if (i <= 10) {
            System.out.println(i);
            printnumbers(i+1);
        }

    }
}