package task2;

import task2.comparators.AgeCompare;
import task2.comparators.AverageMarkCompare;
import task2.comparators.NameFamilyCompare;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class School {

    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Arni", "Aliam", 21, 9.5));
        studentList.add(new Student("Peris", "Jacson", 23, 9.1));
        studentList.add(new Student("Arni", "Barsia", 27, 6.5));
        studentList.add(new Student("Arni", "Cogo", 27, 6.5));
        studentList.add(new Student("Lena", "Hiden", 20, 7.5));
        studentList.add(new Student("Max", "Dexter", 22, 9.2));
        printStudent(studentList);
        System.out.println("-= Полное имя и Фамилия ученика =-");
        studentList.sort(new NameFamilyCompare());
        printStudent(studentList);
        System.out.println(" -= Возраст ученика");
        studentList.sort(new AgeCompare());
        printStudent(studentList);
        System.out.println("-= Средний бал учеников =-");
        studentList.sort(new AverageMarkCompare());
        printStudent(studentList);
        System.out.println("-= Ученик с самым высоким средним балом =-");
        printAverageMark(studentList);
    }

    private static void printAverageMark(List<Student> students) {
        if (students.size() == 0) {
            return;
        }
        double maxMark = students.get(0).getAverageMark();
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getAverageMark() > maxMark) {
                maxMark = temp.getAverageMark();
            }
        }
        iterator = students.iterator();
        while (iterator.hasNext()) {
            Student temp = iterator.next();
            if (temp.getAverageMark() == maxMark) {
                System.out.println(temp);
            }
        }
    }

    private static void printStudent(List<Student> studentList) {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }
}