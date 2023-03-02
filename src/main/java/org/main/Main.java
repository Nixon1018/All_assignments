package org.main;
import java.util.logging.Logger;
import java.io.IOException;
import java.util.*;

import org.assignment1.App;
import org.assignment2.Shape;
import org.assignment3.Student;
import org.assignment4.Conn;
import org.assignment5.Coordinates;
import org.assignment6.Cardd;
import org.calculator.Cal;
import org.collections.Coll;
import org.datastructures.Stru;
import org.studentdetails.Det;
import org.tictactoe.Tic;
import org.wordcount.Word;
import org.contacts.Cont;

public class Main
{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    public static void main( String[] args ) throws CloneNotSupportedException, IOException
    {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        do{
            try{
                Log.info("1.Simple-Bank-Account\n2.Shape-Area\n3.Student-Gpa\n4.Database-Connection\n5.Points-Difference\n6.Bank-Credit-Card\n7.Simple-Calculator\n8.Java-Collections\n9.Contacts\n10.DataStructures\n11.File-Reading\n12.Student-DataStructures\n13.TicTacToe\n14.Exit");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:App.execute();break;
                    case 2:Shape.execute();break;
                    case 3:Student.execute();break;
                    case 4:Conn.execute();break;
                    case 5:Coordinates.execute();break;
                    case 6:Cardd.execute();break;
                    case 7:Cal.execute();break;
                    case 8:Coll.execute();break;
                    case 9:Cont.execute();break;
                    case 10:Stru.execute();break;
                    case 11:Word.execute();break;
                    case 12:Det.execute();break;
                    case 13:Tic.execute();break;
                    default:in=1;break;
                }
            }catch(Exception e){
                String s = ""+e;
                Log.info(s);
                sc.nextLine();
            }
        }while(in == 0);

    }
}