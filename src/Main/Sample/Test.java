package Main.Sample;

public class Test {
    public static void main(String... args) {

        Student stu = new Student();
        Student stu2 = new Student();

        stu = new Student(101);
        stu2 = new Student(102);


        System.out.println(stu.rollNo);
    }
}
