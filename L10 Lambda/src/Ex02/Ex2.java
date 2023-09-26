package Ex02;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ex2 {
    private static final String ANSI_GREEN = "\u001B[32m";
    private static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>(List.of(
                new Runner("Ib", 30),
                new Runner("Per", 50),
                new Runner("Ole", 27),
                new Runner("Ulla", 40),
                new Runner("Jens", 35),
                new Runner("Hans", 28)
        ));
        System.out.println(runners);
        System.out.println();
        System.out.println(ANSI_GREEN + "OPG 2.A" + ANSI_RESET);
        runners.forEach((Runner r) -> {
            System.out.println("Name " + r.getName() + " LapTime " + r.getLapTime());
        });
        System.out.println();

        System.out.println(ANSI_GREEN + "OPG 2.B" + ANSI_RESET);
        runners.forEach((Runner r) -> {
            System.out.print(r.getLapTime() > 30 ? "Name " + r.getName() + " LapTime " + r.getLapTime() + "\n" : "");
        });
        System.out.println();

        System.out.println(ANSI_GREEN + "OPG 2.C" + ANSI_RESET);
        runners.sort((r1,r2) -> Integer.compare(r1.getLapTime(),r2.getLapTime()));
        System.out.println(runners);
        System.out.println();

        System.out.println(ANSI_GREEN + "OPG 2.Extra" + ANSI_RESET);
        int[] sum = new int[1];
        runners.forEach((Runner r) ->{ sum[0] += r.getLapTime();});
        System.out.println("Summen af alle laptime for alle løber er" + sum[0]);

    };

}