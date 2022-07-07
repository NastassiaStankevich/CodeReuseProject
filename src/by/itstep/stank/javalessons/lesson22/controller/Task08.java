package by.itstep.stank.javalessons.lesson22.controller;

import by.itstep.stank.javalessons.lesson22.model.entity.Human;
import by.itstep.stank.javalessons.lesson22.model.entity.Loafer;
import by.itstep.stank.javalessons.lesson22.model.entity.Student;
import by.itstep.stank.javalessons.lesson22.model.entity.Worker;

public class Task08 {
    public static void main(String[] args) {
        Worker worker = new Worker("Alex", 40, 5000,true);
        System.out.println(worker);
        
//        Human[] humans = {
//                new Worker("alex",40,3000, true),
//                new Student("Peter",20,8, true),
//                new Loafer("Anna",30,8, true),
//                new Worker("alex",40,3000, true),
//                new Student("Peter",20,8, true),
//                new Loafer("Anna",30,8, true),
//        };
    }
}
