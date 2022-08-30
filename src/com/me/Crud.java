package com.me;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Crud {
    // item 1 -> purchase date 23/08/2022 - quantity 20 - $10
    // item 1 -> purchase date 30/08/2022 - quantity 10 - $11

    // Stack - Last in First out
    // Queue - First in First out

    public static void main(String[] args) {

        Item item1FirstLog = new Item("Item1 First Log", 100,20 ); // 5
        Item item1SecondLog = new Item("Item1 Second Log", 200,10 );


        CustomQueue queue = new CustomQueue();
        // purchase
        queue.push(item1FirstLog);
        queue.push(item1SecondLog);

        queue.print();
        System.out.println("=====================");

        System.out.println("selling.......");
        // first sell 15
        // second sell 11

        // To refactor to a service (Class)

        int sellingQuantity = 15;
        int tempQty = 0;

        Item item = queue.pop();
        item.quantity -= sellingQuantity;
        System.out.println(item);

        sellingQuantity = 11;
        if (sellingQuantity > item.quantity) {
            tempQty = sellingQuantity - item.quantity;
            item.quantity -= item.quantity;
        }

        item = queue.pop();
        System.out.println(item);
        item.quantity -= tempQty;

        System.out.println(item);




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
