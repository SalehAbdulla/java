package dev.lpa;

import java.util.Random;

public class Main {
    public static void main(String[] args) {


        for (int i = 0; i < 10; i++) {
            var weekDay = getRandomDay();

//            System.out.printf("The Random day is equal %s at ordinal %d%n", randomDay.name(), randomDay.ordinal());
//            System.out.println("-".repeat(30));

            // Using equalsIgnoreCase
//            if (randomDay.name().equalsIgnoreCase("FRI")) {
//                System.out.println("FOUND FRIDAY !!!");
//            }

            // Using ==
//            if (randomDay == DayOfTheWeek.FRI) {
//                System.out.println("FOUND FRIDAY !!!");
//            }


            switchDayOfWeek(weekDay);
        }


        for (Topping topping : Topping.values()) {
            System.out.println("Topping name is: " + topping.name() + ", the price = " + topping.getPrice());
        }

        System.out.println("-".repeat(30));


        System.out.println(Topping.BACON.getPrice());

    }

    public static DayOfTheWeek getRandomDay() {
        int getRandomNumber = new Random().nextInt(7);
        var allDays = DayOfTheWeek.values();
        return allDays[getRandomNumber];
    }


    public static void switchDayOfWeek(DayOfTheWeek weekDay) {
        int weekDayInteger = weekDay.ordinal() + 1;
        switch (weekDay) {
            case WED -> System.out.println("Wednesday is day " + weekDayInteger);
            case SAT -> System.out.println("Saturday is day " + weekDayInteger);
            default -> System.out.println(weekDay.name().charAt(0) + weekDay.name().substring(1).toLowerCase()
                    + "day is day " + weekDayInteger);
        }
    }
}
