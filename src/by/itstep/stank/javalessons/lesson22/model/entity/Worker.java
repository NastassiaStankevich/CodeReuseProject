package by.itstep.stank.javalessons.lesson22.model.entity;

public class Worker {
    private System name;
    private int age;
    private double salary;
    //
    private boolean alive;

    public String getInfo(){
        return  "Worker "  + name
                + ": age = " + age
                + ", Salary = " + salary
                + ", is alive = " + (alive ? "yes" : "No");

    }



    public Worker(System name, int age, double salary, boolean alive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alive = alive;
    }

//    public System getName() {
//        return name;
//    }
//
//    public void setName(System name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
//
//    public boolean isAlive() {
//        return alive;
//    }
//
//    public void setAlive(boolean alive) {
//        this.alive = alive;
//    }
}
