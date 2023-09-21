package Ex02;

import java.util.*;
import java.util.function.BiConsumer;

public class College {
    int[] acceptableGrades = {-3, 00, 02, 4, 7, 10, 12};
    private static int count = 1001;
    private String name;
    private LinkedHashMap<Integer,Student> students = new LinkedHashMap<Integer, Student>();

    public College(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addStudent(Student s){
        students.put(count,s);
        count++;
    }
    public void removeStudent(Student s){
        students.remove(s);
    }
    public double calcAverage(){
        int[] count = new int[1];
        count[0] = 0;
        double[] sum = new double[1];
        students.values().forEach(s ->  {
            for (Integer i : s.getGrades()){
                sum[0] += i;
                count[0]++;
            }

    });
        return sum[0] / count[0];
    }
    private double fuckingHelper(Student s){
        double sum = 0;
        int count = 0;
        List<Integer> temp = new ArrayList<>(s.getGrades());
        for (Integer i : temp){
            sum += i;
            count++;
        }
        return sum / count;
    }
    public Student findStudent(int studentNo){
        Student[] fuck = new Student[1];
        students.entrySet().forEach(s -> {
            if (s.getKey() == (studentNo)){
                fuck[0] = s.getValue();
            }
        });
        return fuck[0];
    }

    @Override
    public String toString() {
        return "" + name;
    }
    public void gibThemGrades(){
        Random random = new Random();
        students.values().forEach(s -> {
            for (int i = 0; i < 5; i++) {
                s.addGrade(acceptableGrades[random.nextInt(acceptableGrades.length)]);
            }
        });
    }

    public LinkedHashMap<Integer, Student> getStudents() {
        return new LinkedHashMap<>(students);
    }
}
