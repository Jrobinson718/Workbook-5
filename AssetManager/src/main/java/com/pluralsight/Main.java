package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> portfolio = new ArrayList<Asset>();

        House h1 = new House("My main house",
                "2025-13-05",
                20000,
                "123 Random Street",
                2,
                5000,
                1000);

        portfolio.add(new Asset("Hundred Dollar Bill", "2025-01-01", 100));
        portfolio.add(new Asset("Necklace", "2025-02-14", 225));
        portfolio.add(h1);

        System.out.println("Your portfolio has the following assets:\n");

        double totalNetWorth = 0;

        for (Asset a : portfolio) {
            System.out.printf("%s valued at %.2f \n", a.getDescription(), a.getValue());
            totalNetWorth += a.getValue();
        }

        System.out.println("\nYour net worth is " + totalNetWorth);

    }
}