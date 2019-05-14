package ru.dimamonb.twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target)
    {
        int[] idxs = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            map.put(numbers[i],i);
        }

        for (int i = 0; i < numbers.length; i++) {

            int something = target - numbers[i];
            if(map.containsKey(something) && map.get(something) != i){
                idxs[0] = i; idxs[1]=map.get(something);
                break;
            }
        }

        return idxs; // Do your magic!
    }
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{5,6,2,8,4}, 6));
    }
}
