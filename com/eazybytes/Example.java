//Cloneable(Marker interface)

public class Example implements Cloneable{
    int x = 10;
    int y = 20;
    public static void main(String[] args) throws CloneNotSupportedException{
        Example e1 = new Example();
        Example e2 = (Example) e1.clone();

        System.out.println(e1 == e2);
        System.out.println(e1.x+"..."+e1.y);
        System.out.println(e2.x+"..."+e2.y);

        e1.x = 60;
        e1.y = 70;

        System.out.println(e1.x+"..."+e1.y);
        System.out.println(e2.x+"..."+e2.y);

    }
}
