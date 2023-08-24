package Ex01;

import java.util.ArrayList;

public class Foreman extends Employee{

    private int yearOfPromotion;
    private double bonusWage;


    public Foreman(String name, String adress, double wage,int yearOfPromotion, double bonusWage ) {
        super(name, adress, wage);
        this.yearOfPromotion = yearOfPromotion;
        this.bonusWage = bonusWage;
    }

    @Override
    public double weeklySalery(){
        double wage = getWage() + bonusWage;
        return wage*37;
    }
}
