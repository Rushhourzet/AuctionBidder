package at.AuctionBidder;

public class Main {

    public static void main(String[] args) {
	    Auction a1 = new Auction(1);
	    a1.addBid("A", 5);
	    a1.addBid("B", 10);
	    a1.addBid("A", 8);
	    a1.addBid("A", 17);
	    a1.addBid("B", 17);
	    a1.printWinner();

	    Auction a2 = new Auction(1);
    }
}
