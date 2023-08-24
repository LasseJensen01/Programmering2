package Ex01;

public class Mechanic extends Employee{
    private double wage;
    private int yearForExamTest;

    public Mechanic(String name, String adress, int yearForExamTest, double wage){
        super(name, adress, wage);
        this.yearForExamTest = yearForExamTest;
    }
}
