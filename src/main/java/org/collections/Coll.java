package org.collections;
import java.util.Scanner;
import java.util.logging.Logger;

public class Coll{
    public static final Logger Log = Logger.getLogger("InfoLogging");
    protected Coll(){
        Log.info("execute");
    }
    public  static  void execute() {
        Scanner sc = new Scanner(System.in);
        int n=1;
        do {
            try{
            Log.info("1.Hashmap 2.Treeset 3.Hashset 4.Quiet");
            int choice = sc.nextInt();
            if (choice == 1) {
                Hashmap m = new Hashmap();
                m.map();
            }
            if (choice == 2) {
                Treeset s = new Treeset();
                s.tree();
            }
            if (choice == 3) {
                Hashset h = new Hashset();
                h.set();
            }
            if (choice == 4) {
                n = 0;
            }
        }catch (Exception e)
            {
                String z=" "+e;
                Log.info(z);
                sc.nextLine();
            }}while(n==1);

    }


}