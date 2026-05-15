public class StringReplace {
    public static void main(String[] args){

        String s1 = "Hari krishna Hari NIT hari hAri Hyderabad";

        System.out.println(s1.replace('a','A'));
        System.out.println(s1.replace("Hari","HK"));
        System.out.println(s1.replaceAll(".","^"));
        System.out.println(s1.replaceAll("[Hari]","^"));
        System.out.println(s1.replaceFirst("Hari","^"));

    }
}
