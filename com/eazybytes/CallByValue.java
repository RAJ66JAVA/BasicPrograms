public class CallByValue{
     static int age = 24;
    public static void main(String[] args) {
           System.out.println("Before change: "+age);
            changeAge(age);
            System.out.println("After change: "+age);
        }

        private static void changeAge(int x) {
           age = 45;
        }
    }

