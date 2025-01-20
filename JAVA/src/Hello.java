public class Hello {

    public static void main (String[]args){
        System.out.println("Hello World!");

        boolean isAlien = false;
        if (!isAlien) {
            System.out.println("It is not an alien!");
        }

        int topScore = 100;
        if (topScore >= 100) {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ( (topScore > secondTopScore) || (topScore < 100) ) {
            System.out.println("greater than second top score or less than 100");
        }
        boolean isDomestic = true;
        // This is a shortcut of is-else statement

        String result = (isDomestic) ? "It is a domestic car" : "It is not a domestic car";
        System.out.println("Result is: " + result);
    }
}
