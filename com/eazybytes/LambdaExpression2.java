@FunctionalInterface
interface Math{
    void max(int a,int b);
}
public class LambdaExpression2 {
    public static void main(String[] args){
        Math m = (a,b) -> {
            if(a>b)
                System.out.println(a+" is greater than "+b);
            else
                System.out.println(b+" is greater than "+a);
    };
      m.max(10,20);
      m.max(15,10);
}
}
