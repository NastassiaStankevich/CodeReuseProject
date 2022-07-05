package by.itstep.stank.javalessons.lesson22.model.entity;

public class Human {
    protected String name;
    protected int age;
    protected boolean alive;

    public Human(){
        System.out.println("human default constructor");

    }

    public Human(String name, int age, boolean alive) {
        System.out.println("human full constructor");
        this.name = name;
        this.age = age;
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

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo(){
        return  "Human " +
                name + ": age = " + age
                + ", is alive = " + (alive ? "yes" : "No");

    }
}
