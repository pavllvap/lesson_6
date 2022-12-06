package task_1;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList <CreditCard> cards = CreditCard.createListOfCards(3);
        System.out.println();

        cards.get(0).setMoney(100);
        cards.get(1).setMoney(100);
        cards.get(2).getMoney(100);

        System.out.println(cards);
    }
}
