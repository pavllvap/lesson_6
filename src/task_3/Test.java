package task_3;

public class Test {
    public static void main(String[] args) {
        ATM atm1 = new ATM();
        System.out.println(atm1);
        System.out.println("----------------------------------------------");

        boolean bol = atm1.getMoney(480);
        System.out.println("----------------------------------------------");

        System.out.println(atm1);
        System.out.println("----------------------------------------------");

        // создание банкомата с некорректными параметрами:

        ATM atm2 = new ATM(10, 10, 10, 2000);
        System.out.println(atm2);
        System.out.println("----------------------------------------------");

        boolean bol1 = atm2.getMoney(1760);
        System.out.println("----------------------------------------------");

        System.out.println(atm2);
    }

}
