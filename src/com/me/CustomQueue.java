package com.me;

public class CustomQueue {
    Item[] items;
    int counter;
    int pointer;

    public CustomQueue() {
        this.items = new Item[10];
    }

    public void push(Item item) {
        items[counter++] = item;
    }

    public Item pop(){
        Item temp = items[pointer];
        items[pointer] = null;
        pointer++;
        return temp;

    }

    public void print() {

        for (int i = 0; i < items.length; i++)
        {
            if (items[i] != null)
            {
                System.out.println(items[i]);
            }
        }
    }
}
