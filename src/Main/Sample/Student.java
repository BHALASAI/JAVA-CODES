package Main.Sample;

public class Student {
    int rollNo;
    String name;
    int age;

    public Student() {
    }

    public Student(int rollNo) {
        this.rollNo = rollNo;
    }

    public Student(int rollNo, String name, int age) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }


}
