package Main.ComparableAndComparator.Comparator.Example1;

//Java Program to demonstrate the use of Java Comparator

import java.util.ArrayList;

class TestComparator {
    public static void main(String[] args) {
//Creating a list of students
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(101, "Vijay", 23));
        al.add(new Student(106, "Ajay", 27));
        al.add(new Student(105, "Jai", 21));

        System.out.println("Sorting by Name");
//Using NameComparator to sort the elements
        al.sort(new NameComparator());
//Traversing the elements of list
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

        System.out.println("sorting by Age");
//Using AgeComparator to sort the elements
        al.sort(new AgeComparator());
//Travering the list again
        for (Student st : al) {
            System.out.println(st.rollno + " " + st.name + " " + st.age);
        }

    }
}