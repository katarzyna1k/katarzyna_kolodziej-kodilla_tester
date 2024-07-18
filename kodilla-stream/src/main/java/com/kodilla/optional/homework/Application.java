package com.kodilla.optional.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(new Student(new Teacher("Arystoteles"), "Aleksander Wielki"),
                new Student(new Teacher(null), "Albert Einstein"),
                new Student(new Teacher("Maria Curie"), "Irena Joliot-Curie"),
                new Student(new Teacher(null), "Cinderella"),
                new Student(new Teacher("Mr. Miyagi"), "Karate Kid"),
                new Student(new Teacher("Master Splinter"), "Teenage Mutant Ninja Turtles"),
                new Student(new Teacher(null), "Stephen Hawking"),
                new Student(new Teacher("Yoda"), "Luke Skywalker"));


//        Optional<List<Student>> optionalStudents = Optional.ofNullable(students);
//        String teacherName=optionalStudents.orElse("<>").getName();
//
//        List<Student> studentWithoutTeacher = optionalStudents.orElse(Arrays.asList(new Student(new Teacher("<un>"), "")).;


        for (Student studentListAndTeachers : students)
            System.out.println(studentListAndTeachers);


    }
}
