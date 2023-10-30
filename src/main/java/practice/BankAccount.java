package practice;

public class BankAccount {
  protected double currentAmountOfMoney;

  protected double getAmount() {
    return currentAmountOfMoney;
  }

  protected void put(double amountToPut) {
    if (amountToPut > 0) {
      currentAmountOfMoney = currentAmountOfMoney + amountToPut;
    }
  }

  protected void take(double amountToTake) {

    if (!(amountToTake >= currentAmountOfMoney) && amountToTake > 0) {
      currentAmountOfMoney = currentAmountOfMoney - amountToTake;
    }
  }
}
