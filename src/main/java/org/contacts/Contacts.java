package org.contacts;

public class Contacts
{
    String name;
    long phonenumber;
    String emailaddress;
    Contacts nextnode;
    protected Contacts(String name,long phonenumber,String emailaddress)
    {
        this.name=name;
        this.phonenumber=phonenumber;
        this.emailaddress=emailaddress;
    }
}