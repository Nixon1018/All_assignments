package org.contacts;

import java.util.Scanner;
import java.util.logging.Logger;


public class Cont {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    protected Cont(){
        logger.info("execute");
    }
    public static void execute() {
        int n=1;
        Scanner sc= new Scanner(System.in);
        Contactop list = new Contactop();
        while (n==1) {
            try{
            logger.info("1.add 2.remove 3.search 4.exit");
            int c = sc.nextInt();
            if (c == 1) {
                logger.info("Enter the name:");
                String name = sc.next();
                logger.info("Enter the phonenumber:");
                long phonenumber = sc.nextLong();
                logger.info("Enter the email Id:");
                String id = sc.next();
                list.add(name, phonenumber, id);
            } else if (c == 2) {
                list.remove();
            } else if (c == 3) {
                logger.info("Enter the name to be searched:");
                String name = sc.next();
                list.search(name);

            } else if (c == 4) {
                n = 0;

            }
        }catch (Exception e)
            {
                String z=" "+e;
                logger.info(z);
                sc.nextLine();
            }}

    }
}