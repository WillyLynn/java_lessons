package com.me;

public class CustomQueue {
    Item[] items;
    int counter;
    int pointer;

    public CustomQueue(int size) {
        this.items = new Item[size];
    }

    // this is new line

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
