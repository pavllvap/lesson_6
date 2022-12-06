package task_1;

import java.util.ArrayList;

public class CreditCard {

    int account;
    int moneyOnAccount;
    private static int counter;



    public CreditCard() {
        this.account = counter;
        this.moneyOnAccount = 100;
        counter++;
    }

    public void setMoney (int sum){
        this.moneyOnAccount += sum;
    }

    public void getMoney (int sum){
        if (moneyOnAccount >= sum) {
            this.moneyOnAccount -= sum;
        } else {
            System.out.println("You have only " + moneyOnAccount + " $ on your account");
        }
    }


    public static ArrayList<CreditCard> createListOfCards (int numberOfCards){
        ArrayList<CreditCard> cards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            cards.add(new CreditCard());
            System.out.println(cards.get(i));
        }
        return cards;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "account=" + account +
                ", moneyOnAccount=" + moneyOnAccount +
                '}';
    }
}
