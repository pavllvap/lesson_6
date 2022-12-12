package task_3;

public class Test {
    public static void main(String[] args) {


        ATM atm = new ATM();
        System.out.println(atm);
        System.out.println("----------------------------------------------");
        boolean bol = atm.getMoney(130);
        System.out.println("----------------------------------------------");
        System.out.println(atm);
    }
}
