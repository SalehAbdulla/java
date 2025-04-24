package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("This is a random day: " + getRandomDay());
        System.out.println("-".repeat(30));

        for (int i = 0; i <= 10; i++){
            printDayOrdinal(getRandomDay());
        }

    }

    public static DayOfTheWeek getRandomDay() {
        int getRandomNumber = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[getRandomNumber];
    }

    public static void printDayOrdinal(DayOfTheWeek dayOfTheWeek){
        int dayOrdinal = dayOfTheWeek.ordinal() + 1;
        switch (dayOfTheWeek){
            case SUN -> System.out.println("Sunday's ordinal is = " + dayOrdinal);
            case TUE -> System.out.println("Tuesday's ordinal is =  " + dayOrdinal);
            default -> System.out.println(dayOfTheWeek.name().charAt(0) +
                    dayOfTheWeek.name().substring(1).toLowerCase() +
                    "day's ordinal is " + dayOfTheWeek.ordinal());

        }
    }



}