package org.example.task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyArrayList<Student> students = new MyArrayList<>();
        students.add(new Student("Ivan"));
        students.add(new Student("Kirill"));
        students.add(new Student("Ilia"));
        students.add(new Student("Aleks"));
        students.add(new Student("Maks"));
        students.add(new Student("Nikita"));

        students.sort(Comparator.comparing(Student::getName));

        MyCollections.sort(students);

        System.out.println(students);
    }
}
