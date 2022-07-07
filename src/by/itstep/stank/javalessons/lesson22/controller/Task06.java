package by.itstep.stank.javalessons.lesson22.controller;

import by.itstep.stank.javalessons.lesson22.model.entity.MarkNote;
import by.itstep.stank.javalessons.lesson22.model.entity.Student;

public class Task06 {
    public static void main(String[] args) {
        Student student = new Student("alex", 20,new MarkNote(10),true);
        System.out.println(student.getInfo());
        student.setMark(8);
        System.out.println(student.getInfo());
    }
}
