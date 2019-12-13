package at.AuctionBidder;

import java.util.ArrayList;

public class Auction {
    ArrayList<Person> persons;
    int price;
    Person maxBidder;


    public Auction(ArrayList<Person> persons) {
        this.persons = persons;
        RefreshPrice();
    }
    public Auction(int startPrice) {
        this.persons = new ArrayList<>();
        this.price = price;
    }
    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
        RefreshPrice();
    }


    public void RefreshPrice(){
        for (Person p:persons) {
            if(p.getMaxBid()>=price){
               int tmp = p.getMaxBid();
               if(tmp> maxBidder.getMaxBid()){
                   maxBidder = p;
               }
               else if(tmp >= price) {
                   price = tmp;
               }
            }
        }
    }
    public void printWinner(){
        System.out.println(maxBidder.getName() + ", "+ price);
    }
    public void addBid(String nameOfBidder, int bid){
        if(persons.size() == 0){
            persons.add(new Person(nameOfBidder, bid));
            maxBidder = persons.get(0);
        } else {
            boolean newBidder = false;
            for (Person p : persons) {
                if (p.getName().equals(nameOfBidder)) {
                    p.setMaxBid(bid);
                    newBidder = false;
                    break;
                } else {
                    newBidder = true;
                }
            }
            if(newBidder){
                persons.add(new Person(nameOfBidder, bid));
            }
        }
        RefreshPrice();
    }
}
