package org.collections;



import java.util.HashMap;
import java.util.logging.Logger;

public class Hashmap {
    public static final Logger Log = Logger.getLogger("InfoLogging");

    public void map() {
        HashMap<String, String> hmap = new HashMap();
        hmap.put("std1", "luke");
        hmap.put("std2", "john");
        hmap.put("std3", "rick");
        hmap.put("std4", "brook");
        hmap.put("std5", "patrick");
        String hash = "" + hmap;
        Log.info(hash);
        String key = "" + hmap.keySet();
        Log.info(key);
        String size = "Size: " + hmap.size();
        Log.info(size);
        String val = "" + hmap.values();
        Log.info(val);
        hmap.remove("std3");
        hash = "" + hmap;
        Log.info(hash);
        hmap.replace("std2", "pravin");
        hash = "" + hmap;
        Log.info(hash);
        Log.info((String)hmap.get("std4"));
    }
}