package task_3;

public class ATM {

    static final int BILL_20 = 20;
    static final int BILL_50 = 50;
    static final int BILL_100 = 100;


    int amountBill_20;
    int amountBill_50;
    int amountBill_100;
    int oneOperationSum;
    int sumAllMoneyInATM;


    public ATM() {
        this(1000, 1000, 1000, 500);
    }

    public ATM(int amountBill_20, int amountBill_50, int amountBill_100, int oneOperationSum) {
        this.amountBill_20 = amountBill_20;
        this.amountBill_50 = amountBill_50;
        this.amountBill_100 = amountBill_100;
        this.oneOperationSum = oneOperationSum;
        this.sumAllMoneyInATM += amountBill_20 * BILL_20 + amountBill_50 * BILL_50 + amountBill_100 * BILL_100;
    }

    public void setMoney(int bill_20, int bill_50, int bill_100) {
        amountBill_20 += bill_20;
        amountBill_50 += bill_50;
        amountBill_100 += bill_100;
        sumAllMoneyInATM += bill_20 * BILL_20 + bill_50 * BILL_50 + bill_100 * BILL_100;
    }

    public boolean getMoney(int cashSum) {
        boolean bol;
        int countBill;
        System.out.println("There are banknotes with a face values of 20, 50, 100 at the ATM," +
                " enter the sum no more then " + oneOperationSum + ".");
        System.out.println("Required sum: " + cashSum);
        if ((cashSum % BILL_100 == 0) && (cashSum <= oneOperationSum)) {
            countBill = cashSum / BILL_100;
            amountBill_100 -= countBill;
            sumAllMoneyInATM -= countBill * BILL_100;
            setMoney(0,0,countBill);
            System.out.println("You have got " + countBill + " banknotes with a face value of " + BILL_100);
            bol = true;
        } else if ((cashSum % BILL_50 == 0) && (cashSum <= oneOperationSum)) {
            countBill = cashSum / BILL_50;
            amountBill_50 -= countBill;
            sumAllMoneyInATM -= countBill * BILL_50;
            setMoney(0,countBill,0);
            System.out.println("You have got " + countBill + " banknotes with a face value of " + BILL_50);
            bol = true;
        } else if ((cashSum % BILL_20 == 0) && (cashSum <= oneOperationSum)) {
            countBill = cashSum / BILL_20;
            amountBill_20 -= countBill;
            sumAllMoneyInATM -= countBill * BILL_20;
            setMoney(countBill,0,0);
            System.out.println("You have got " + countBill + " banknotes with a face value of " + BILL_20);
            bol = true;
        } else {
            System.out.println("Insert correct sum.");
            bol = false;
        }
        return bol;
    }

    @Override
    public String toString() {
        return "ATM{" +
                " amountBill_20= " + amountBill_20 +
                ", amountBill_50= " + amountBill_50 +
                ", amountBill_100= " + amountBill_100 +
                ", oneOperationSum= " + oneOperationSum +
                ", sumAllMoneyInATM= " + sumAllMoneyInATM +
                '}';
    }
}
