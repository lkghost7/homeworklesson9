package task2;

public class Student {

    private String name;
    private String lastName;
    private int age;
    private double averageMark;

    public Student(String name, String lastName, int age, double averageMark) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.averageMark = averageMark;
    }

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Student setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public Student setAverageMark(double averageMark) {
        this.averageMark = averageMark;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", averageMark=" + averageMark +
                '}';
    }
}