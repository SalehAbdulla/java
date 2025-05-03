public class WinnersProgram {
    public static void main(String[] args) {
        String[] winners = {"Manama", "Sitra", "Muharraq", "AlAhli", "Riffa"};

        for (int i = 0; i < winners.length; i++) {
            System.out.println(winners[i]);
        }
        winners[3] = "Nuwaidrat";

        for (int i = 0; i < winners.length; i++) {
            System.out.println(winners[i]);
        }
    }
}


//Write a program that
//
//a)    Declare an array of Strings that holds the winners of Bahrain’s basketball league for the past 5 years ;
// Manama, Sitra, Muharraq, AlAhli, and Riffa. Print out all items in the array.
//
//b) A mistake has been made in the above list of winning teams.
// AlAhli needs to be replaced with Nuwaidrat.
// Use indexing to make your change to the array, then print out the new array.
//
//For example:
//
//Result
//Manama
//Sitra
//Muharraq
//AlAhli
//Riffa
//Manama
//Sitra
//Muharraq
//Nuwaidrat
//Riffa