package by.itstep.stank.javalessons.lesson22.model.entity;
public class Student {
    public String name;
    public int age;
    public double mark = 4;
    public boolean alive;




    public Student(){
        name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }


    public  Student(String name, int age , double mark , boolean alive){
        this.name = name;
        this.age = age;
        this.mark = mark;
        this.alive = alive;

    }

    public Student(Student student){
        name = student.name;
        age = student.age;
        mark = student.mark;
        alive = student.alive;
    }

    public String getInfo(){
        return  name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "No");

    }
}
