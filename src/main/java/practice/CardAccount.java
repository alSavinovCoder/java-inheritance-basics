package practice;

public class CardAccount extends BankAccount {
    private final double commission =1.01d;
    @Override
    public void take(double amountToTake) {
        if (!(amountToTake >= currentAmountOfMoney) && amountToTake > 0) {
            currentAmountOfMoney = currentAmountOfMoney - amountToTake * commission;
        }
    }
}
