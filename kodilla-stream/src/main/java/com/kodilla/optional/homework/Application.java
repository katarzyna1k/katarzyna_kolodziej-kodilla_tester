package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student("Aleksander Wielki", new Teacher("Arystoteles")),
                new Student("Albert Einstein", null),
                new Student("Irena Joliot-Curie", new Teacher("Maria Curie")),
                new Student("Cinderella", null),
                new Student("Karate Kid", new Teacher("Mr. Miyagi")),
                new Student("Teenage Mutant Ninja Turtles", new Teacher("Master Splinter")),
                new Student("Stephen Hawking", null),
                new Student("Luke Skywalker", new Teacher("Yoda")));


//        Optional<List<Student>> optionalStudents = Optional.ofNullable(students);
//        String teacherName=optionalStudents.orElse("<>").getName();
//
//        List<Student> studentWithoutTeacher = optionalStudents.orElse(Arrays.asList(new Student(new Teacher("<un>"), "")).;


        for (Student student : students) {
            System.out.println(student.getName() + " " + getTeacherName(student));
        }
    }

    public static String getTeacherName(Student student) {
        Teacher teacher = Optional.ofNullable(student.getTeacher()).orElse(new Teacher("<undefined>"));
        return teacher.getName();

    }
}
