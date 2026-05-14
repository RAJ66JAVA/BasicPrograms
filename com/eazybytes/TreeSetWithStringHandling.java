import java.util.Comparator;
import java.util.TreeSet;
public class TreeSetWithStringHandling {
    public static void main(String[] args){
        TreeSet<String> ts1 = new TreeSet<>();
           ts1.add("a");
           ts1.add("c");
           ts1.add("b");
        System.out.println(ts1);

        TreeSet<String> ts2 = new TreeSet<>();
           ts2.add(new StringBuilder("a").toString());
           ts2.add(new StringBuilder("c").toString());
           ts2.add(new StringBuilder("b").toString());
        System.out.println(ts2);

        //   upto java 10

        TreeSet<StringBuilder> ts3 = new TreeSet<>(new SBComparator());
        ts3.add(new StringBuilder("a"));
        ts3.add(new StringBuilder("c"));
        ts3.add(new StringBuilder("b"));
        System.out.println(ts3);



        //   Anonymous inner class

        TreeSet<StringBuilder> ts4 = new TreeSet<>(new Comparator<StringBuilder>(){
                                         @Override
                                         public int compare(StringBuilder sb1,StringBuilder sb2){
                                             return sb1.toString().compareTo(sb2.toString());
                                         }
                                     });
        ts4.add(new StringBuilder("a"));
        ts4.add(new StringBuilder("c"));
        ts4.add(new StringBuilder("b"));
        System.out.println(ts4);



        //   Lambda Expression


        TreeSet<StringBuilder> ts5 = new TreeSet<>((sb1,sb2)->sb1.toString().compareTo(sb2.toString()));
        ts5.add(new StringBuilder("a"));
        ts5.add(new StringBuilder("c"));
        ts5.add(new StringBuilder("b"));
        System.out.println(ts5);


        //  Method References

        TreeSet<StringBuilder> ts6 = new TreeSet<>(A::m1);
        ts6.add(new StringBuilder("a"));
        ts6.add(new StringBuilder("c"));
        ts6.add(new StringBuilder("b"));
        System.out.println(ts6);



    }
}


 class SBComparator implements Comparator<StringBuilder>{
    public int compare(StringBuilder sb1,StringBuilder sb2){
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        return s1.compareTo(s2);
    }

 }


 class A {
     public static int m1(StringBuilder sb1, StringBuilder sb2) {
         String s1 = sb1.toString();
         String s2 = sb2.toString();
         return s1.compareTo(s2);

     }
 }