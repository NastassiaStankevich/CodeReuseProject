package by.itstep.stank.javalessons.lesson22.model.entity;

public class MarkNote {
    public static final  int MAX_MARK = 10;
    public static final  int MIN_MARK = 1;
    private double mark;

    public void getMark() {
    }

    public MarkNote(double mark) {
        this.mark = mark;
    }

    public void setMark(double mark) {
        if(mark >= MIN_MARK &&  mark <= MAX_MARK){
        this.mark = mark;
        }
    }
    public void getMark(double mark) {
        this.mark = mark;
    }
}
