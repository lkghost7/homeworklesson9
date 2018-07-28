package task2.comparators;

import task2.Student;

import java.util.Comparator;

public class NameFamilyCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int result = o1.getName().compareTo(o2.getName()); // result = 0
        if (result == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
}