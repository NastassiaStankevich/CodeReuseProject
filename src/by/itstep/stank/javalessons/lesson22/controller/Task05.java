package by.itstep.stank.javalessons.lesson22.controller;

import by.itstep.stank.javalessons.lesson22.model.entity.Student;

public class Task05 {
    public static void main(String[] args) {
        Student student = new Student("alex", 20,8,true);
        System.out.println(student.getInfo());
        student.setMark(-100);
        System.out.println(student.getInfo());
    }
}
