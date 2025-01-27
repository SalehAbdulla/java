public class Main{
    public static void main(String[] args){
        for(int i = 1; i <= 5; i++) {
            LPAStudent student = new LPAStudent("2023000" + i,
                    switch (i) {
                        case 1 -> "Saleh";
                        case 2 -> "Ahmed";
                        case 3 -> "Mahdi";
                        case 4 -> "Abdulla";
                        case 5 -> "MEE";
                        default -> "Anonymous";
                    },
                    "1998/12/03",
                    "JavaMaster Class"
            );
            System.out.println(student);
        }

        Student pojoStudent = new Student("S923006",
                "Ann",
                "05/11/1985",
                "Java Masterclass"
        );

        LPAStudent recordStudent = new LPAStudent("S923007",
                "Bill",
                "05/11/1985",
                "Java Masterclass"
        );

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        pojoStudent.setClassList(pojoStudent.getClassList() + ", Java OCP Exam 829");
     //   recordStudent.setClassList(recordStudent.getClassList() + ", Java OCP Exam 829");


        System.out.println(pojoStudent.getName() + " is taking " +
                pojoStudent.getClassList());

        System.out.println(recordStudent.name() + " is taking " +
                recordStudent.classList());

    }
}
