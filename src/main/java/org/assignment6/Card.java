package org.assignment6;

public class Card implements Cloneable{
    String holdername;
    int cardnumber;
    String expirationdate;

    protected Card(String name,int no,String date)
    {
        holdername=name;
        cardnumber=no;
        expirationdate=date;
    }
    protected String check(double cardnumber)
    {
        return ( this.cardnumber==cardnumber?"true":"false");

    }
    public Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }

}