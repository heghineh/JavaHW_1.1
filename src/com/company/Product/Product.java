package com.company.Product;

public class Product {
    //region Properties
    private int upvotes;
    private int downvotes;
    //endregion

    //region Constructors
    public Product() {
    }

    public Product(int upvotes, int downvotes) {
        this.upvotes = upvotes;
        this.downvotes = downvotes;
    }
    //endregion

    //region Public Methods
    public int getVoteCount() {
        if (upvotes < 0) {
            return -downvotes;
        } else if (downvotes < 0) {
            return upvotes;
        } else {
            return upvotes - downvotes;
        }
    }
    //endregion

    //region Getters and Setters
    public int getUpvotes() {
        return upvotes;
    }

    public void setUpvotes(int upvotes) {
        this.upvotes = upvotes;
    }

    public int getDownvotes() {
        return downvotes;
    }

    public void setDownvotes(int downvotes) {
        this.downvotes = downvotes;
    }
    //endregion
}