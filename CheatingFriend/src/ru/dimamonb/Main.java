package ru.dimamonb;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static List<long[]> removNb(long n) {

        List<long[]> result = new ArrayList<>();
        long sum = 0;
        long x = 0;
        sum = n *(n+1)/2;

        for (int i = 1; i <= n; i++) {
            x = (sum - i)/(i+1);
            if(x < n && (x * i) == ((sum -i)-x)){
                result.add(new long[]{i,x});
            }

        }
       /*
        for (int i = 0; i < temp.size(); i++) {
            for (int j = 0; j < temp.size(); j++) {
                int f = i * j;
                int g = i + j;
                if(f == sum - g){
                    result.add(new long[]{i,j});

                }
            }
        }*/

        return result;
    }
    public static void main(String[] args) {
        System.out.println(removNb(26));
    }
}
