package org.assignment1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Bank
{
    private static final Logger LOGGER=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    String accountholdername;
    int accountnumber;
    int balance;
    static Scanner scanner = new Scanner(System.in);


    Bank(String accountholdername,int accountnumber,int balance)
    {

        this.accountholdername=accountholdername;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }

    protected void deposit()
    {
        LOGGER.log(Level.INFO,"Enter the amount to be deposited");
        int amount=scanner.nextInt();
        balance=amount+balance;


    }
    protected void withdraw()
    {
        LOGGER.log(Level.INFO,"Enter the amount to be withdrawn");
        int amountw=scanner.nextInt();
        if(amountw>balance)
        {
            LOGGER.log(Level.INFO,"Money can not be withdrawn");
        }
        else
        {
            balance=balance-amountw;
        }
    }
    protected void currentbalance()
    {
        LOGGER.log(Level.INFO,Integer.toString(balance),"Your account balance is :"+balance);
    }

}