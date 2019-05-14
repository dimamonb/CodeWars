package ru.dimamonb.styleranking;

public class User {
    private int rank = 8;

    private int progress = 98;

    public void incProgress(int rnk) {

        if (rnk < -8 || rnk > 8 || rnk == 0) throw new IllegalArgumentException();


        int diff = 0;

        if ((rank < 0 && rnk < 0) || (rank > 0 && rnk > 0)) {
            diff = rnk - rank;

        } else if ((rank < 0 && rnk > 0) || (rank > 0 && rnk < 0)) {
            diff = Math.abs(rank) + Math.abs(rnk);
            diff = (rank > rnk) ? -(diff - 1) : --diff;
        }

        if (diff > 0) {
            progress = progress + diff * diff * 10;
        } else {
            progress += (diff == 0) ? 3 : 1;
        }

        if (progress >= 100 && rank < 8) {
            rank += (int) Math.floor(progress / 100);
            if(rank == 0) rank++;
            progress = progress % 100;
        }
//
    }
}
