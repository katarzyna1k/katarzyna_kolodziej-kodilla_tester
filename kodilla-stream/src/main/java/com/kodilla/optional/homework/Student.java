package com.kodilla.optional.homework;

import java.util.Objects;

public class Student {
    private String name;
    private Teacher teacher;

    public Student(Teacher teacher, String name) {
        this.teacher = teacher;
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher);
    }

    @Override
    public String toString() {
        return "Uczeń {" +
                name +'}'+
                ", nauczyciel {" + teacher +
                '}';
    }
}
