package by.itstep.stank.javalessons.lesson22.model.entity;

public class Worker extends Human {
    private double salary;


//    public String getInfo(){
//        return  "Worker "  + getName()
//                + ": age = " + getAge()
//                + ", Salary = " + getSalary()
//                + ", is alive = " + (isAlive() ? "yes" : "No");
//
//    }



    public Worker(String name, int age, double salary, boolean alive) {
//        setName(name);
//        setAge(age);
//        setAlive(alive);
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.alive = alive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
}
