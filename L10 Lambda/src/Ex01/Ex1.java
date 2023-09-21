package Ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";


    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Bent", 25),
                new Person("Susan", 34),
                new Person("Mikael", 60),
                new Person("Klaus", 44),
                new Person("Birgitte", 17),
                new Person("Liselotte", 9)
        );
        System.out.println(persons);
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.A" + ANSI_RESET);
        System.out.println(findFirst(persons, (Person p) -> p.getAge() == 44));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.B" + ANSI_RESET);
        System.out.println(findFirst(persons, (Person p) -> p.getName().startsWith("M")));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.C" + ANSI_RESET);
        System.out.println(findFirst(persons, (Person p) ->
                p.getName().indexOf('i') != p.getName().lastIndexOf('i')));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.D" + ANSI_RESET);
        System.out.println(findFirst(persons, (Person p) ->
                p.getName().length() == p.getAge()));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.E" + ANSI_RESET);
        System.out.println(findAll(persons, p -> p.getAge() < 30));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.F" + ANSI_RESET);
        System.out.println(findAll(persons, (Person p) -> p.getName().contains("i")));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.G" + ANSI_RESET);
        System.out.println(findAll(persons, (Person p) -> p.getName().startsWith("S")));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.H" + ANSI_RESET);
        System.out.println(findAll(persons, (Person p) -> p.getName().length() == 5));
        System.out.println();

        System.out.println(ANSI_GREEN + "Opg 1.I" + ANSI_RESET);
        System.out.println(findAll(persons, (Person p) -> p.getName().length() > 5 && p.getAge() < 40 ));

    }

    /**
     * Returns from the list the first person
     * that satisfies the predicate.
     * Returns null, if no person satisfies the predicate.
     */
    public static Person findFirst(List<Person> list, Predicate<Person> filter) {
        for (Person p : list) {
            if (filter.test(p))
                return p;
        }
        return null;
    }

    public static List<Person> findAll(List<Person> list, Predicate<Person> filter) {
        ArrayList<Person> newList = new ArrayList<>();
        for (Person p : list) {
            if (filter.test(p)) {
                newList.add(p);
            }
        }
        return newList;
    }
}
