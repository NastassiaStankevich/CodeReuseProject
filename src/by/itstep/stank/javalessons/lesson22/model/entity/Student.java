package by.itstep.stank.javalessons.lesson22.model.entity;
public class Student {

    public static final int MIN_MARK =0;
    public static final int MAX_MARK =10;
    public String name;
    public int age;
    private double mark =4;
    public boolean alive;


    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;

    }

    public double getMark(){
        return  mark;
    }

    public void setMark(double mark){
        if (mark >= MIN_MARK && mark <= MAX_MARK ) {
            this.mark = mark;
        }
    }




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
