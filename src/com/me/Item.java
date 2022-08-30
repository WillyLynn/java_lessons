package com.me;

public class Item {

    String name;
    int purchaseDate;
    int quantity;

    public Item() {

    }

    public Item(String name, int purchaseDate, int quantity) {
        this.name = name;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", purchaseDate=" + purchaseDate +
                ", quantity=" + quantity +
                '}';
    }
}
