package Ex01;

import java.util.ArrayList;

public class WorkingBoy extends Employee{
    public WorkingBoy(String name, String adress, double wage) {
        super(name, adress, wage);
    }

    @Override
    public double weeklySalery(){
        return getWage()*25;
    }
}
