package task2.comparators;

import task2.Student;

import java.util.Comparator;

public class AgeCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}