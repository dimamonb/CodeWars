package ru.dimamonb.vasiaclerk;

public class VasiaClerk {
    public static String Tickets(int[] peopleInLine)
    {
        final int ticketCost = 25;
        int vasiaMoneys25 = 0;
        int vasiaMoneys50 = 0;
        int temp = 0;
        for (int i = 0; i < peopleInLine.length; i++) {

            if(i==0 && (peopleInLine[i] == 50 || peopleInLine[i] == 100)){
                return "NO";
            }

            if(i==0 || peopleInLine[i] == ticketCost) {
                vasiaMoneys25 +=1;
                continue;
            }
            if(peopleInLine[i] == 50){
                vasiaMoneys50 += 1;
                vasiaMoneys25 -= 1;

            } else if(peopleInLine[i] == 100){
                if(vasiaMoneys25 >= 3 && vasiaMoneys50 ==0){
                    vasiaMoneys25 -=3;
                } else {
                    vasiaMoneys25 -=1;
                    vasiaMoneys50 -=1;
                }
            }

            if(vasiaMoneys25 < 0 || vasiaMoneys50 < 0){
                return "NO";
            }

        }
        return "YES";
    }
    public static void main(String[] args) {
        System.out.println(Tickets(new int[]{25,100}));
    }
}
