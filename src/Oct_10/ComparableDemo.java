package Oct_10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        // A list of integers
        List<Integer> USN = new ArrayList<>();
        USN.add(1); USN.add(4); USN.add(3); USN.add(2); USN.add(5);

        // Natural sorting order (Ascending for Integer)
        USN.sort(null); // null → uses Comparable interface internally
        System.out.println("Sorted Integers (Natural Order): " + USN);

        System.out.println("**************************");

        // A list of students
        List<Student> list = new ArrayList<>();
        list.add(new Student("Ayush", 20));
        list.add(new Student("Keshav", 19));
        list.add(new Student("Swastik", 22));

        System.out.println("Before sorting:");
        for (Student s : list) System.out.println(s);

        // Sort using Comparable (by name)
        list.sort(null);
        System.out.println("\nSorted by Name (Comparable):");
        for (Student s : list) System.out.println(s);

        // Sort using Comparator (by age)
        list.sort(Comparator.comparingInt(Student::getAge));
        System.out.println("\nSorted by Age (Comparator):");
        for (Student s : list) System.out.println(s);
    }
}

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Implement Comparable to sort by name (default)
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name); // ascending alphabetical order
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}
