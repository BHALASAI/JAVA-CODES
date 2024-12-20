package Main.ComparableAndComparator.Comparable.Example1;

import java.util.ArrayList;
import java.util.Collections;

//Creating a test class to sort the elements
public class TestSort1 {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        Collections.sort(al);
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }
    }
}