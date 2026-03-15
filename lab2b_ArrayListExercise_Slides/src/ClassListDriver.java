import java.util.ArrayList;

public class ClassListDriver {
    public static void main(String[] args) {

        ArrayList<Student> studentArrayList = new ArrayList<>();

        Student student1 = new Student("SARA", 200912345, 30);
        Student student2 = new Student("AHMED", 200967898, 40);
        Student student3 = new Student("SCOTT", 201012345, 25);

        studentArrayList.add(student1);
        studentArrayList.add(student2);
        studentArrayList.add(student3);

        studentArrayList.remove(1);

        for (Student student: studentArrayList) {
            student.printStudents();
        }

    }
}
