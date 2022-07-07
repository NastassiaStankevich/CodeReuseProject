package by.itstep.stank.javalessons.lesson22.controller;

import by.itstep.stank.javalessons.lesson22.model.entity.*;

public class Task07 {
    public static void main(String[] args) {
//        Human human = new Student();
//
//        human = new Loafer();
//        human = new Worker();

        Human[] humans = {
                new Worker("alex",40,3000, true),
                new Student("Peter",20,8, true),
                new Loafer("Anna",30,8, true),
                new Worker("alex",40,3000, true),
                new Student("Peter",20,8, true),
                new Loafer("Anna",30,8, true),
        };
      //  Killer.justDoIt(humans);

//        System.out.println(Killer.view(humans)) ;
    }
}
