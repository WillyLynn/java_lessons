package com.me.repository.impl;

import com.me.Item;
import com.me.repository.ItemRepository;

public class ItemRepositoryFromDB implements ItemRepository {
    @Override
    public Item[] getInventoryList() {
        System.out.println("From DB");
        return new Item[0];
    }
}
