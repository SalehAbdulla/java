public class Main{
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Saleh";
                        case 2 -> "Ahmed";
                        case 3 -> "Mahdi";
                        case 4 -> "Abdulla";
                        case 5 -> "Ali";
                        default -> "Anonymous";
                    },
                    "03/12/1998",
                    "Java Masterclass");
            System.out.println(s);
        }

    }
}
