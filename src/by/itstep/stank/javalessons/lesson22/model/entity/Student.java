package by.itstep.stank.javalessons.lesson22.model.entity;
public class Student {

    public static final int MIN_MARK =0;
    public static final int MAX_MARK =10;
    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;
    public String name;
    public int age;
    private double mark =4;
    public boolean alive;

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
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }

    public void setAge(int age) {
        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
        this.age = age;
        }
    }




//
//    public boolean isAlive() {
//        return alive;
//    }
//
//    public void setAlive(boolean alive) {
//        this.alive = alive;
//    }

    public String getInfo(){
        return  "Student " +
                name + ": age = " + age
                + ", mark = " + mark
                + ", is alive = " + (alive ? "yes" : "No");

    }
}
