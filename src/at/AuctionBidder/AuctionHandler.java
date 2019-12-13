package at.AuctionBidder;

import java.util.ArrayList;

public class AuctionHandler {
    ArrayList<Auction> auctions;

    public AuctionHandler(ArrayList<Auction> auctions) {
        this.auctions = auctions;
    }

    public ArrayList<Auction> getA() {
        return auctions;
    }

    public void setA(Auction a) {
       this.auctions = auctions;
    }

    public void addBidder(int auctionIndex, String name, int maxBid){
        auctions.get(auctionIndex).addBid(name,maxBid);
    }
    public void setBidders(){

    }
}
