package org.mpei.WorkSololearn_6.Starter;

public class BankAccount {
    private double balance = 0;

    public void deposit(double x) {
        if (x > 0) {
            balance += x;
        }
    }
    /**
     * Данная реализация скрывает переменную balance,
     * позволяя получить к ней доступ только с помощью метода deposit, который утверждает количество
     * депозита до модификации переменной.
     * */

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
