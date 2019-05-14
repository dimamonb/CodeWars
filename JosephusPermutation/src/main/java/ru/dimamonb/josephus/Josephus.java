package ru.dimamonb.josephus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Josephus {
    public static int joseph(int size, int k){
        return size>1 ? (joseph (size-1, k) + k - 1) % size + 1 : 1;
    }
    public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
        List<T> result = new ArrayList<>();
        int idx = 0;
        while (!items.isEmpty()) {

            idx = joseph(items.size(), k);
        }

        return result;
    }

    public static void main(String[] args) {
        josephusPermutation(new ArrayList(Arrays.asList(1, 2, 3, 4, 5, 6, 7)), 3);
    }
}
