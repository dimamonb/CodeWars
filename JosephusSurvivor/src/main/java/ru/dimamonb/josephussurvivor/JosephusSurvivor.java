package ru.dimamonb.josephussurvivor;

public class JosephusSurvivor {
    public static int josephusSurvivor(final int n, final int k) {
       return n > 1 ? (josephusSurvivor(n - 1, k) + k - 1) % n + 1 : 1;
    }

    public static void main(String[] args) {
        System.out.println(josephusSurvivor(7, 3));
    }
}
