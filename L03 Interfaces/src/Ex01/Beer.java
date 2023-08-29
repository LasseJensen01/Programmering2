package Ex01;

public class Beer implements Measurable{

    private String navn;
    private double alkoholProcent;

    public Beer(String navn, double alkoholProcent) {
        this.navn = navn;
        this.alkoholProcent = alkoholProcent;
    }

    @Override
    public double getMeasure() {
        return alkoholProcent;
    }


    @Override
    public String toString() {
        return navn + " med en alkohol procent på " + alkoholProcent;
    }


}
