package at.AuctionBidder;

import java.lang.reflect.Constructor;

public class Person {
    private String name;
    private int maxBid;

    public Person(String name, int maxBid) {
        this.name = name;
        this.maxBid = maxBid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBid() {
        return maxBid;
    }

    public void setMaxBid(int maxBid) {
        this.maxBid = maxBid;
    }
}
