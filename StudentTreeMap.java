import java.util.*;

class Student {
    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " (" + age + ")";
    }
}

public class StudentTreeMap {

    public static void main(String[] args) {

        TreeMap<Integer, Student> map = new TreeMap<>();

        map.put(101, new Student("Rafi", 20));
        map.put(103, new Student("Nila", 22));
        map.put(102, new Student("Hasan", 21));

        System.out.println("Student Details:");
        System.out.println(map);
    }
}
