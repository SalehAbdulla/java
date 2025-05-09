public class QuestionNine {
    public static void main(String[] args) {
        drawStars(-1);
    }

    public static void drawStars(int n){
        if (n < 0) {
            System.out.println("Invalid input");
            return;
        }
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

//drawStars(1);
//*
//drawStars(2);
//*
//**
//drawStars(5);
//*
//**
//***
//****
//*****
//drawStars(-1);
//Invalid input
