package com.company.Product;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Count of upvotes:  ");
        int upvoted = scanner.nextInt();
        System.out.print("Count of downvotes:  ");
        int downvoted = scanner.nextInt();

        Product product = new Product(upvoted, downvoted);
        System.out.println("Final count of votes:  " + product.getVoteCount());
    }
}