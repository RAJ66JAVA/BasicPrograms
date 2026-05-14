import java.util.Scanner;

interface Sim{
    String call(long mobileNo);
    String sms(long mobileNo,String msg);
}



class Airtel implements Sim{
    static{
        System.out.println("Airtel Static block is executed");
    }

    public String call(long mobileNo){
        return "Airtel : The number you calling is busy.Please dial after some time";
    }

    public String sms(long mobileNo,String msg){
        return "Airtel : your message sent successfully";
    }
}


class Vodaphone implements Sim{
    static{
        System.out.println("Vodaphone Static block is executed");
    }

    public String call(long mobileNo){
        return "Vodaphone : The number you calling is busy.Please dial after some time";
    }

    public String sms(long mobileNo,String msg){
        return "Vodaphone : your message sent successfully";
    }
}


class Mobile{
    private Sim sim;

    public void insertSim(String simName) throws Exception{
        Class cls = Class.forName(simName);
        System.out.println(simName + "is loaded and ready to instantiate");
        Object obj = cls.newInstance();
        if(obj instanceof Sim){
            sim = (Sim)obj;
        }
    }

    public String call(long mobileNo){
        return sim.call(mobileNo);
    }

    public String sms(long mobileNo,String msg){
        return sim.sms(mobileNo,msg);
    }

}


public class MobileUser {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Mobile iphone = new Mobile();

        try{
            System.out.println("Insert Sim:");
            String simName = sc.nextLine();
            iphone.insertSim(simName);

            System.out.println("\n type 1 for call");
            System.out.println("Type 2 for sms");

            System.out.println("Enter option:");
            int option = sc.nextInt(); sc.nextLine();

            switch(option){
                case 1:
                    System.out.println("enter mobile number");
                    String msg = iphone.call(sc.nextLong()); sc.nextLine();
                    System.out.println(msg);
                    break;
                case 2:
                    System.out.println("enter mobile number");
                    long mobileNo = sc.nextLong();

                    System.out.println("Type message");
                    String msg1 = sc.nextLine();

                    String msgs = iphone.sms(mobileNo,msg1);
                    System.out.println(msgs);
                    break;

                default :
                    System.out.println("invalid option");

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
