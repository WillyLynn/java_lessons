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
        if (item == null || item.quantity <= 0) {
            item = queue.pop();
        }

        while (qty >= item.quantity) {
            qty -= item.quantity;
            item.quantity -= item.quantity;

            if (item.quantity <= 0) {
                item = queue.pop();
            }
        }

        item.quantity -= qty;

    }
}
