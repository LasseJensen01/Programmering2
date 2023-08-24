package Ex01;

import java.util.ArrayList;

public class Surveyor extends Mechanic{
    private double surveryBonus;
    public Surveyor(String name, String adress, int yearForExamTest, double wage, double numberOfSurverys) {
        super(name, adress, yearForExamTest, wage);
        this.surveryBonus = numberOfSurverys;
    }
    @Override
    public double weeklySalery(){
        double wage = getWage() + (surveryBonus*29);
        return wage;
    }
}
