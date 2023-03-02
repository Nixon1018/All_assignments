package org.datastructures;
import java.util.*;
import java.util.logging.Logger;

public class Stru {
    private static final Logger logger = Logger.getLogger("InfoLogging");

    public static void execute() {
        Scanner sc = new Scanner(System.in);
        logger.info("1.Array 2.Arraylist 3.list 4.Quiet");
        int n = 0;

        do {
            try{
            int choice = sc.nextInt();
            if (choice == 1) {
                Array a = new Array();
                a.arraya();
            }

            if (choice == 2) {
                Arraylist al = new Arraylist();
                al.arrayl();
            }

            if (choice == 3) {
                Linkedlist ll = new Linkedlist();
                ll.linkedlist();
            }

            if (choice == 4) {
                n = 1;
            }
        }catch (Exception e)
            {
                String z=" "+e;
                logger.info(z);
                sc.nextLine();
            }} while(n==0);

    }
}
