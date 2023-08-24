package Ex01;

import java.util.ArrayList;

public abstract class Employee {
    private String name;
    private String adress;
    private double wage;
    public Employee(String name, String adress, double wage){
        this.name = name;
        this.adress = adress;
        this.wage = wage;
    }
    public double weeklySalery(){
        return wage*37;
    }

    public double getWage() {
        return wage;
    }
}
