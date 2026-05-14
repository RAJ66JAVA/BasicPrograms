class AB{
    int a = 10;
}
class B extends AB{
    int b = 20;

    void m1(){
        I1 i1 = (a,s) -> {
            int b = 30;
            System.out.println(a);
            System.out.println(b);
            System.out.println(this.b);
        };
        i1.m1(5,"hi");
        }
}

public class LambdaExpression1 {
    public static void main(String[] args){
        B b = new B();
        b.m1();
    }
}
