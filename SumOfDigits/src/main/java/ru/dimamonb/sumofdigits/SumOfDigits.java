package ru.dimamonb.sumofdigits;

public class SumOfDigits {
    public static int digital_root(int n) {
        int result = 0;

        while (n > 0){
            result += n % 10;
            n /=10;
        }

        if(result >= 10){
            result = digital_root(result);
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(digital_root(493193));
    }
}
