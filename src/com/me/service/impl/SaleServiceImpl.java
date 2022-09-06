package com.me.service.impl;

import com.me.CustomQueue;
import com.me.Item;
import com.me.service.SaleService;

public class SaleServiceImpl implements SaleService {

    CustomQueue queue;
    Item item;

    public SaleServiceImpl(CustomQueue queue) {
        this.queue = queue;
    }

    @Override
    public void sell(int qty) {
        System.out.println(qty);
        System.out.println(item);
        // null.quantity
        if(item == null || item.quantity <= 0) {
            item = queue.pop();
            System.out.println(item);
        }

        int temp = 0;
        if (qty < item.quantity) {
            item.quantity -= qty;
        } else { // qty > item.quantity
            temp = qty - item.quantity;
            item.quantity -= item.quantity; // item -> 0

            if(item.quantity <= 0) {
                item = queue.pop();
            }

            if (qty > item.quantity) {
                temp = qty - item.quantity;
                item.quantity -= item.quantity; // item -> 0

                if(item.quantity <= 0) {
                    item = queue.pop();
                }


            }
        }

//        int sellingQuantity = 15;
//        int tempQty = 0;
//
//        Item item = queue.pop();
//        item.quantity -= sellingQuantity;
//        System.out.println(item);
//
//        sellingQuantity = 11;
//        if (sellingQuantity > item.quantity) {
//            tempQty = sellingQuantity - item.quantity;
//            item.quantity -= item.quantity;
//        }
//
//        item = queue.pop();
//        System.out.println(item);
//        item.quantity -= tempQty;
//
//        System.out.println(item);
    }
}
