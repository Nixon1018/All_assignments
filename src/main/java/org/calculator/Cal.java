package org.calculator;

import java.util.Scanner;
import java.util.logging.Logger;



public class Cal {
    private static final Logger logger = Logger.getLogger("InfoLogging");
    public static void execute() {
        Scanner sc = new Scanner(System.in);

        int l=1;
        Calculator c = new Methods();

        do {
            try{
            logger.info("Enter the value:");
            int value = sc.nextInt();
            c.setValue(value);
            int n = 1;
            do {
                logger.info("1.add 2.subract 3.multiply 4.divide 5.exit");
                int v = sc.nextInt();
                if (v == 1) {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculateadd(a);
                    String z = "Result:" + c.getvalue();
                    logger.info(z);
                } else if (v == 2) {
                    logger.info("Enter the value:");
                    int a = sc.nextInt();
                    c.calculatesub(a);
                    String z = "Result:" + c.getvalue();
                    logger.info(z);
                } else if (v == 3) {
                    logger.info("Enter the next value:");
                    int a = sc.nextInt();
                    c.calculatemul(a);
                    String z = "Res:" + c.getvalue();
                    logger.info(z);
                } else if (v == 4) {
                    logger.info("Enter the  value:");
                    int a = sc.nextInt();
                    c.calculatediv(a);
                    String z = "Res:" + c.getvalue();
                    logger.info(z);
                } else if (v == 5) {
                    l = 0;
                    n = 0;
                }
            } while (n == 1);
        }catch (Exception e)
            {
                String z=" "+e;
                logger.info(z);
                sc.nextLine();
            }
        } while(l==1);


    }
}