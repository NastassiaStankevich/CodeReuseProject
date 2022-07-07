package by.itstep.stank.javalessons.lesson22.model.entity;
public class  Student extends Human {

    public static final int MIN_MARK =0;
    public static final int MAX_MARK =10;
    public static final int MIN_STUDENT_AGE = 16;
    public static final int MAX_STUDENT_AGE = 65;

    private MarkNote note;
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
        super();
      //  System.out.println("Student default constructor");

        name = "botan";
        super.name = "no name";
        age = 16;
        mark = 4;
        alive = true;
    }


    public  Student(String name, int age , double mark , boolean alive){
        super(name, age, alive);
        note = new MarkNote(mark);

//        this.name = name;
//        this.age = age;
        this.mark = mark;
//        this.alive = alive;

    }

    public  Student(String name, int age , MarkNote note, boolean alive){
        super(name, age, alive);
        this.note = new note;
    }



    public Student(Student student){
        super();
//        setName(name);
//        setAge(age);
//        setAlive(alive);
        name = student.name;
        age = student.age;
       note= new MarkNote(student.note.getMark());
        alive = student.alive;
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

//    public void setAge(int age) {
//        if (age >= MIN_STUDENT_AGE && age <= MAX_STUDENT_AGE) {
//        this.age = age;
//        }
//    }





    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public String getInfo(){
        return  "Student " +

                super.getInfo()

                + ", mark = " + note.getMark();

    }
}
