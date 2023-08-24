package Ex01;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Mechanic louis = new Mechanic("Louis", "LouisVej",2000, 133);
        list.add(louis);
        Foreman sara = new Foreman("Sara", "Saravej", 133,2010,20);
        list.add(sara);
        Surveyor susie = new Surveyor("Susie","Sussievej",2007,133, 5);
        WorkingBoy will = new WorkingBoy("Will", "Williamsburg",133);
        System.out.println(totalWeeklySalery(list));
    }

    public static double totalWeeklySalery(ArrayList<Employee> list){
        double totalSalery = 0;
        for (Employee e : list){
            totalSalery += e.weeklySalery();
        }
        return totalSalery;
    }
}
