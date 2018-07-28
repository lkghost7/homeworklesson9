package task2.comparators;

import task2.Student;

import java.util.Comparator;

public class AverageMarkCompare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageMark(), o2.getAverageMark());
    }
}