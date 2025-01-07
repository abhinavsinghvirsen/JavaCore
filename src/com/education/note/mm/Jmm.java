package com.education.note.mm;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Student {
    private int studentId;
    private String name;
    private int grade;

    public Student(int studentId, String name, int grade) {
        this.studentId = studentId;
        this.name = name;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", name='" + name + '\'' + ", grade=" + grade + '}';
    }
}

public class Jmm {

    private static String generateRandomName(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        StringBuilder name = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            name.append(characters.charAt(random.nextInt(characters.length())));
        }
        return name.toString();
    }


    private static int generateRandomGrade() {
        return new Random().nextInt(100) + 1;
    }

    public static void main(String[] args) {
        int numStudents = 20000;
        List<Student> students = new ArrayList<>();


        for (int i = 1; i <= numStudents; i++) {
            String name = generateRandomName(8);
            int grade = generateRandomGrade();
            students.add(new Student(i, name, grade));
        }


        for (int i = 0; i < numStudents; i++) {
            System.out.println(students.get(i));
        }
    }
}
