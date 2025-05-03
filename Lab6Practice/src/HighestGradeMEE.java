public class HighestGradeMEE {
    public static void main(String[] args) {
        String students[] = {"John", "Maryam", "Fatima", "Paul", "Zainab", "Mary", "Ahmed", "Peter", "Hussain", "Sayed Hussain"};
        double grades[] = {52.4, 67.9, 87.3, 45.2, 77.8, 93.6, 83.9, 62.7, 68.9, 78.2};
        searchHighest(students, grades);
        System.out.println("The class average is: " + average(students, grades));

    }

    public static void searchHighest(String[] students, double[] grades) {
        double max = 0.0;
        int trackIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
                trackIndex = i;
            }
        }
        System.out.println(students[trackIndex] + " got the highest grades of the class: " + max);
    }

    public static double average(String[] students, double[] grades) {
        double sum = 0.0;

        for (int i = 0; i < grades.length; i++){
            sum += grades[i];
        }

        return sum / grades.length;
    }

}


//Write a method searchHighest that will search for the student who got the highest score.
// The method should print out his/her name and the highest score.
//Write a method average that will calculate and return the average score for the class.