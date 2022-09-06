package com.me.repository;

import com.me.Item;

public interface ItemRepository {
    // generate one item, different purchase date
    public Item[] getInventoryList();
}