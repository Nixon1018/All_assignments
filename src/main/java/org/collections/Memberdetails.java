package org.collections;

public class Memberdetails {
    String membername;
    String memberaddress;
    int id;

    protected Memberdetails(String membername, String memberaddress, int id) {
        this.membername=membername;
        this.memberaddress = memberaddress;
        this.id = id;
    }

    public int hashCode() {
        return this.id;
    }
}
