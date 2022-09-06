package com.me;

import java.util.Objects;

public class Item implements Comparable<Item>{

    public String name;
    public int purchaseDate;
    public int quantity;

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

    @Override
    public int compareTo(Item o) {
        return this.purchaseDate - o.purchaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return purchaseDate == item.purchaseDate;
    }

    @Override
    public int hashCode() {
        return Objects.hash(purchaseDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(int purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
