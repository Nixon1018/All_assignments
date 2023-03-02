package org.collections;


import java.util.HashSet;
import java.util.Iterator;
import java.util.logging.Logger;

public class Hashset {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public void set() {
        HashSet<Memberdetails> set = new HashSet<Memberdetails>();
        Memberdetails sd1 = new Memberdetails("luke", "1st street", 7);
        set.add(sd1);
        sd1 = new Memberdetails("rick", "2nd Street", 109);
        set.add(sd1);
        sd1 = new Memberdetails("vikram", "3rd Street", 900);
        set.add(sd1);
        Iterator var4 = set.iterator();

        String s1;
        Memberdetails s;
        while(var4.hasNext()) {
            s = (Memberdetails)var4.next();
            s1 = s.membername + " " + s.memberaddress + " " + s.id;
            Log.info(s1);
        }

        s1 = "" + set.remove(sd1);
        Log.info(s1);
        var4 = set.iterator();

        while(var4.hasNext()) {
            s = (Memberdetails)var4.next();
            s1 = s.membername + " " + s.memberaddress + " " + s.id;
            Log.info(s1);
        }

        s1 = "" + set.size();
        Log.info(s1);
        s1 = "" + sd1.hashCode();
        Log.info(s1);
    }
}
