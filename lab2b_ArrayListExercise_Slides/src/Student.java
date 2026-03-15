public class Student {
    private String name;
    private long id;
    private int age;

    public Student(String name, long id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }


    public void printStudents() {
        System.out.println("name: " + this.name);
        System.out.println("id: " + this.id);
        System.out.println("age: " + this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
