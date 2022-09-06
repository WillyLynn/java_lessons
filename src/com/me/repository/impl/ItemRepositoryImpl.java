package com.me.repository.impl;

import com.me.Item;
import com.me.repository.ItemRepository;
import com.me.utility.Utility;

//import static com.me.utility.Utility.getRandomGenerator;

public class ItemRepositoryImpl implements ItemRepository {
    @Override
    public Item[] getInventoryList() {
        System.out.println("From Testing Impl");
        // 3 object with random purchase date and quantity

        String name = "Item 1";
        int quantity = 3;
        Item[] items = new Item[quantity];

//        for (int i = 0; i < quantity; i++) {
//            int randomGeneratorForPurchaseDate = Utility.getRandomGenerator(100, 110);
//            int randomGeneratorForQuantity = Utility.getRandomGenerator(20, 30);
//            items[i] = new Item(name, randomGeneratorForPurchaseDate, randomGeneratorForQuantity);
//        }
        items[0] = new Item(name, 101, 10);
        items[1] = new Item(name, 102, 20);
        items[2] = new Item(name, 103, 30);

        return items;
    }


}
