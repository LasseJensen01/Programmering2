package Ex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
    public static void main(String[] args) {
        FullName lise = new FullName("Lise", "Lisabon");
        Person liseP = new Person(lise, 75);
        FullName åge = new FullName("Åge", "Ågesen");
        Person ågeÅ = new Person(åge, 99);
        FullName simon = new FullName("Simon", "Simonsen");
        Person simonS = new Person(simon, 2);
        FullName kasper = new FullName("Kasper", "Kaspersen");
        Person kasperK = new Person<>(kasper, 103);

        ArrayList<Person> peeps = new ArrayList<>(List.of(liseP, ågeÅ, simonS, kasperK));
        System.out.println(peeps);
        Collections.sort(peeps);
        System.out.println(peeps);
    }

    public static void print(){
        /*
        System.out.println(liseP);
        System.out.println(liseP.compareTo(ågeÅ));;
        System.out.println(ågeÅ.compareTo(liseP));
        System.out.println(liseP.compareTo(liseP));
        System.out.println(liseP.compareTo(per));

         */
    }
}
