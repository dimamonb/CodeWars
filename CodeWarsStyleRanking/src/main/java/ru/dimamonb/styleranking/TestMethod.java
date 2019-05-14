package ru.dimamonb.styleranking;

public class TestMethod {
    public static void main(String[] args) {
        User user = new User();
        user.incProgress(8);
        user.incProgress(8);
        user.incProgress(-3);
        user.incProgress(-2);
    }
}
