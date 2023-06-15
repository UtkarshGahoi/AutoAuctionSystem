package org.example;

import java.util.HashSet;
import java.util.List;

public class AutoAuction {
    double current_price;
    Bidder current_winner;
    Seller seller;
    List<Bidder> bidders;
    HashSet<Bidder> exitBidders = new HashSet<>();
    boolean auctionDone = false;
    int round = 0;

    public AutoAuction(Seller seller, List<Bidder> bidders) {
        this.seller = seller;
        this.bidders = bidders;
    }

    public boolean startAuction() {

        current_price = 0;

        while (bidders.size() > exitBidders.size() + 1) {
            round++;
            System.out.println("round " + round + " :");
            for (Bidder b : bidders) {
                double tryPrice = current_price + b.getPredefinedIncrement();
                if (!exitBidders.contains(b) && tryPrice < b.getMaxPrice()) {
                    current_winner = b;
                    current_price += b.getPredefinedIncrement();
                    System.out.println("Current bidder is : " + b.name + ", current price is : " + current_price);
                } else {
                    exitBidders.add(b);
                    System.out.println("bidder : " + b.name + " is out of the auction.");
                }

            }

            System.out.println("--------------------------------");
        }

        while (current_price < seller.getProduct().getReservePrice()) {
            round++;
            System.out.println("round " + round + " :");
            current_price += current_winner.getPredefinedIncrement();
            System.out.println("Current bidder is : " + current_winner.name + ", current price is : " + current_price);

        }

        if (current_price > seller.getProduct().getReservePrice()) {
            auctionDone = true;
            return true;
        } else {
            return false;
        }
    }
    public boolean getBidingresult(){
        if(auctionDone) {
            System.out.println("winner is " + current_winner.name + ",final price is " + current_price);
            return true;
        }else{
            System.out.println("failed");
            return false;
        }
    }
}
