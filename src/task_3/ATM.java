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
        this(1000, 1000, 1000, 10000);
    }

    public ATM(int amountBill_20, int amountBill_50, int amountBill_100, int oneOperationSum) {
        this.amountBill_20 = amountBill_20;
        this.amountBill_50 = amountBill_50;
        this.amountBill_100 = amountBill_100;
        this.oneOperationSum = oneOperationSum;
        this.sumAllMoneyInATM += amountBill_20 * BILL_20 + amountBill_50 * BILL_50 + amountBill_100 * BILL_100;
    }

    public void addMoney(int bill_20, int bill_50, int bill_100) {
        amountBill_20 += bill_20;
        amountBill_50 += bill_50;
        amountBill_100 += bill_100;
        sumAllMoneyInATM += bill_20 * BILL_20 + bill_50 * BILL_50 + bill_100 * BILL_100;
    }

    public boolean getMoney(int cashSum) {
        int countBill100 = cashSum / BILL_100;
        int countBill50 = 1;
        int countBill20;
        System.out.println("There are banknotes with a face values of 20, 50, 100 at the ATM," +
                " enter the sum no more then " + oneOperationSum + ".");
        System.out.println("Required sum: " + cashSum);
        if ((cashSum % BILL_100 == 0) && (cashSum <= oneOperationSum)) {
            amountBill_100 -= countBill100;
            sumAllMoneyInATM -= countBill100 * BILL_100;
            System.out.println("You have got " + countBill100 + " banknotes with a face value of " + BILL_100);
            System.out.println(this);
            addMoney(0, 0, countBill100);
            return true;
        } else if ((cashSum % BILL_50 == 0) && (cashSum <= oneOperationSum)) {
            amountBill_100 -= countBill100;
            amountBill_50 -= countBill50;
            sumAllMoneyInATM -= (countBill50 * BILL_50 + countBill100 * BILL_100);
            System.out.println("You have got " + countBill100 + " banknotes with a face value of " + BILL_100 + " " +
                    "and " + countBill50 + " banknotes with a face value of " + BILL_50);
            System.out.println(this);
            addMoney(0, countBill50, countBill100);
            return true;
        } else if ((cashSum % BILL_20 == 0) && (cashSum <= oneOperationSum)) {
            countBill20 = (cashSum - countBill100 * BILL_100) / BILL_20;
            amountBill_100 -= countBill100;
            amountBill_20 -= countBill20;
            sumAllMoneyInATM -= (countBill20 * BILL_20 + countBill100 * BILL_100);
            System.out.println("You have got " + countBill100 + " banknotes with a face value of " + BILL_100 + " " +
                    "and " + countBill20 + " banknotes with a face value of " + BILL_20);
            System.out.println(this);
            addMoney(countBill20, 0, countBill100);
            return true;
        } else if ((cashSum == 110) || (cashSum == 130)) {
            countBill20 = (cashSum - BILL_50) / BILL_20;
            amountBill_50 -= countBill50;
            amountBill_20 -= countBill20;
            sumAllMoneyInATM -= (countBill20 * BILL_20 + countBill50 * BILL_50);
            System.out.println("You have got " + countBill50 + " banknotes with a face value of " + BILL_50 + " " +
                    "and " + countBill20 + " banknotes with a face value of " + BILL_20);
            System.out.println(this);
            addMoney(countBill20, countBill50, 0);
            return true;
        } else if ((cashSum % 10 == 0) && (cashSum > 30) && (cashSum <= oneOperationSum)) {
            countBill20 = (cashSum - BILL_50 - countBill100 * BILL_100) / BILL_20;
            amountBill_100 -= countBill100;
            amountBill_50 -= countBill50;
            amountBill_20 -= countBill20;
            sumAllMoneyInATM -= (countBill20 * BILL_20 + countBill50 * BILL_50 + countBill100 * BILL_100);
            System.out.println("You have got " + countBill100 + " banknotes with a face value of " + BILL_100 + " " +
                    ", " + countBill50 + " banknotes with a face value of " + BILL_50 + " and " + countBill20 + " " +
                    "banknotes with a face value of " + BILL_20);
            System.out.println(this);
            addMoney(countBill20, countBill50, countBill100);
            return true;
        } else {
            System.out.println("Insert correct sum.");
            return false;
        }
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
