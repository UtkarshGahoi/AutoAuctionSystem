package org.example;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Product product = new Product("toy","fun",50);

        Seller seller = new Seller("Weiting",product);

        Bidder bidder1 = new Bidder("Bidder one",2,20,true);
        Bidder bidder2 = new Bidder("Bidder two",9,50,true);
        Bidder bidder3 = new Bidder("Bidder three",9,500,true);

        List<Bidder> bidders = new ArrayList<>();
        bidders.add(bidder1);
        bidders.add(bidder2);
        bidders.add(bidder3);

        AutoAuction autoAuction1 = new AutoAuction(seller,bidders);

        autoAuction1.startAuction();

        autoAuction1.getBidingresult();
    }
}