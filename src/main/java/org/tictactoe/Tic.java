package org.tictactoe;

import java.util.Scanner;
import java.util.logging.Logger;


public class Tic{
    private  static  final Logger logger = Logger.getLogger("Infologging");
    public static void execute() {
        try{
        Scanner sc = new  Scanner(System.in);
        int k=1;
        int row;
        int column;
        logger.info("Enter the dimensions:");
        int dimension = sc.nextInt();

        while(dimension%2==0)
        {
            logger.info("Enter a odd number:");
            dimension = sc.nextInt();
        }
        Tictoe t = new Tictoe(dimension);
        t.show();
        while(k==1) {

            if (t.win() == 0) {
                logger.info("1.Player 1");
                logger.info("Enter the row number: ");
                row = sc.nextInt();
                logger.info("Enter the column number:");
                column = sc.nextInt();
                t.assign(1, row, column);
                t.show();
                if (t.win() == 0) {
                    logger.info(("2.player"));
                    logger.info("Enter the row number: ");
                    row = sc.nextInt();
                    logger.info("Enter the column number:");
                    column = sc.nextInt();
                    t.assign(2, row, column);
                    t.show();
                } else if (t.win() == 2) {
                    logger.info("Match drawn");
                    k = 0;

                } else if (t.win() == 7) {
                    logger.info("player 1 Won!!!!!!!!");
                    k = 0;
                }
            } else if (t.win() == 2) {
                logger.info("Match drawn");
                k = 0;

            } else if (t.win() == 7) {
                logger.info("Player 2 Won!!!!!!");
                k = 0;
            }


        }
        }
            catch (Exception e)
        {
            String exception = " "+e;
            logger.info(exception);
        }

    }
}