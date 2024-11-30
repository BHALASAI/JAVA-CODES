package Main.ComparableAndComparator.Comparator.Example1;

import java.util.*;

class AgeComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.age, s2.age);
    }
}
