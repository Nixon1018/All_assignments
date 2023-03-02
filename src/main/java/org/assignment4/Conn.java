package org.assignment4;
import java.util.*;
import java.util.logging.*;


public class Conn {
    private static Logger logger = Logger.getLogger("InfoLogging");
    protected Conn(){
        logger.info("execute");
    }
    public static void execute() {

        int choice;
        String s ;
        Scanner sc= new Scanner(System.in);
        logger.info("Enter the connection");
        s=sc.next();
        int exit=0;
        while(exit==0) {
            try {
                logger.info("Enter the choice");
                logger.info("1.changing the connection 2.close 3.Exit");
                choice = sc.nextInt();
                if (choice == 1) {
                    logger.info("Enter the new connection");
                    s = sc.next();
                    Connect z = Connect.instance(s);
                    String v = "Connected: " + z.c;
                    logger.info(v);

                } else if (choice == 2) {
                    String u = "closed:" + s;
                    logger.info(u);

                } else if (choice == 3) {
                    exit = 1;
                }
            }catch (Exception e)
            {
                String z=" "+e;
                logger.info(z);
                sc.nextLine();
            }
        }

    }
}