public class Main {
    public static void main(String[] args) {
        Student saleh = new Student("Max", 21);
        System.out.println(saleh.toString());
        PrimaryClassStudent me = new PrimaryClassStudent("ABDULLA", "38389522");
        System.out.println(me.toString());
    }
}

class PrimaryClassStudent {
    private String parentName;
    private String phoneNumber;

    public PrimaryClassStudent(){}
    public PrimaryClassStudent(String parentName, String phoneNumber) {
        this.parentName = parentName;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return this.parentName + " | Phone number: " + phoneNumber;
    }
}

class Student extends PrimaryClassStudent{
    private String name;
    private int age;

    public Student(String name, int age) {
        super("Abdulla", "33333333");
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return super.toString();
//
//    }

    @Override
    public String toString() {
        return name + " is " + age;
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
    }
}


