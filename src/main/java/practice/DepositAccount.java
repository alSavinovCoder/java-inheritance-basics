package practice;

import java.time.LocalDate;

public class DepositAccount extends BankAccount {
    LocalDate currentDate = LocalDate.now();
    LocalDate currentDateMinusMonth = currentDate.minusMonths(1);
    LocalDate lastIncome = LocalDate.of(2022, 12, 20);

    @Override
    public void take(double amountToTake) {
        if (currentDateMinusMonth.isAfter(lastIncome) ) {
            if (!(amountToTake >= currentAmountOfMoney) && amountToTake > 0) {
                currentAmountOfMoney = currentAmountOfMoney - amountToTake;
            }
        }
    }
}
