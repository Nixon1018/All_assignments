package org.collections;


import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Logger;

public class Treeset {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public void tree() {
        TreeSet<String> names = new TreeSet(new Comparator<String>() {
            public int compare(String s1, String s2) {
                return s1.compareTo(s2);
            }
        });
        names.add("luke");
        names.add("rick");
        names.add("alan");
        names.add("jessy");
        String tree = "TreeSet" + names;
        Log.info(tree);
        String stree = "ascending order: " + names;
        Log.info(stree);
        stree = "" + names.contains("luke");
        Log.info(stree);
        names.remove("jessy");
        stree = "" + names;
        Log.info(stree);
        stree = "First element: " + (String)names.first();
        Log.info(stree);
        stree = "Last element: " + (String)names.last();
        Log.info(stree);
        String size = "Length: " + names.size();
        Log.info(size);
        names.clear();
    }
}
