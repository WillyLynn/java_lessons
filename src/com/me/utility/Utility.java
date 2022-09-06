package com.me.utility;

public class Utility {
    public static int getRandomGenerator(int min, int max) {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}
