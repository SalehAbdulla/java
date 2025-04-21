package dev.lpa;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println("The is a random day " + getRandomDay());
    }

    public static DayOfTheWeek getRandomDay() {
        int randomNumber = new Random().nextInt(7);
        var allDay = DayOfTheWeek.values();
        return allDay[randomNumber];
    }


    public static void printDayOfTheWeek(DayOfTheWeek dayOfTheWeek){
        int dayNumber = dayOfTheWeek.ordinal() + 1;
        switch(dayOfTheWeek) {

        }
    }

}
