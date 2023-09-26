package Ex02;

public class App {
    private static College col1 = new College("Bard College");
    public static void main(String[] args) {
        createStudent("Freddie Mercurie");
        createStudent("Volo Tome");
        createStudent("William Shakespear");
        createStudent("Kim Larsen");
        createStudent("Britney Spears");
        createStudent("Sophie Ellis-Bextor");
        createStudent("John Lennon");
        createStudent("Sophie Turner");
        col1.gibThemGrades();

        for (Student s : col1.getStudents().values()){
            System.out.printf("%-20s %-40s%n", s.getName(), s.getGrades());
        }
        /*
        System.out.println(col1.findStudent(1001).getGrades());
        System.out.println(col1.findStudent(1002).getGrades());
        System.out.println(col1.findStudent(1003).getGrades());
        System.out.println(col1.findStudent(1004).getGrades());

         */
        System.out.println(col1.calcAverage());

    }

    public static void createStudent(String name){
        col1.addStudent(new Student(name));
    }


}
