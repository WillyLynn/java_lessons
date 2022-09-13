package com.me;

import com.me.repository.ItemRepository;
import com.me.repository.impl.ItemRepositoryFromDB;
import com.me.repository.impl.ItemRepositoryImpl;
import com.me.service.SaleService;
import com.me.service.impl.SaleServiceImpl;

import java.util.*;

class CustomComparator implements Comparator<Item> {

    @Override
    public int compare(Item o1, Item o2) {
        return o1.purchaseDate - o2.purchaseDate;
    }
}
public class Crud {
    // item 1 -> purchase date 23/08/2022 - quantity 20 - $10
    // item 1 -> purchase date 30/08/2022 - quantity 10 - $11

    // Stack - Last in First out
    // Queue - First in First out

    public static void main(String[] args) {

        ItemRepository itemRepository = new ItemRepositoryImpl();

        Item[] items = itemRepository.getInventoryList();
//        System.out.println(items.length);
//
//        Collections.sort(testing, Comparator.comparingInt(o -> o.purchaseDate));
//
       // Comparator<Item> customComparator = (o1, o2) -> o1.purchaseDate.com

        CustomQueue queue = new CustomQueue(items.length);

        for (Item item :
                items) {
            queue.push(item);
        };

        for (Item item :
                items) {
            System.out.println(item);
        };

        System.out.println("selling.......");
        // first sell 15
        // second sell 11

        // To refactor to a service (Class)

        SaleService saleService = new SaleServiceImpl(queue);

        saleService.sell(10);
        //saleService.sell(20);

        for (Item item :
                items) {
            System.out.println(item);
        };

        // sccanner
        // menu 0
        // enter selling qty: 20
        // enter selling qty: 10
        /*
         * SaleService saleService = new SaleServiceImpl();
         *
         * saleService.sell(10);
         * saleService.sell(15);
         *
         * sout(queue);
        */




        // how much in the inventory?

//        Item lastestItem = queue.pop();
//        lastestItem.reduce(20);
//
//        lastestItem = queue.pop();
//
//        queue.pop();
//        queue.pop();
//
//        queue.print();




        // to add to Queue

    }
}
