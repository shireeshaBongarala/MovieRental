package com.tw.objectbootcamp;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Account {
    private float balance;

    private String lastTransactionDate;

    private List<Transaction> transactions;

    public Account() {
        transactions = new ArrayList<Transaction>();
        balance = 0;
    }


    public float getBalance() {
        return balance;
    }

    public String getLastTransactionDate() {
        return lastTransactionDate;
    }

    public void credit(float amount){
        //Credit amount from balance
        balance += amount;

        //record the transaction
        transactions.add(new Transaction(true, -amount));

        //update the last transaction date
        Calendar calendar= Calendar.getInstance();
        lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
                calendar.get(Calendar.MONTH) + "/"+
                calendar.get(Calendar.YEAR);

    }

    public void debit(float amount) {
       //Debit amount from balance
        balance-= amount;

      //record the transactions
        transactions.add(new Transaction(true, amount));

        //update the last debit date
        Calendar calendar= Calendar.getInstance();
        lastTransactionDate = calendar.get(Calendar.DATE) + "/" +
                        calendar.get(Calendar.MONTH) + "/"+
                        calendar.get(Calendar.YEAR);
    }
}
