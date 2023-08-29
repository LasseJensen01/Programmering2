package Ex01;

public class Chili implements Measurable{
    private String navn;
    private double styrke;

    public Chili(String navn, double styrke) {
        this.navn = navn;
        this.styrke = styrke;
    }

    @Override
    public double getMeasure() {
        return styrke;
    }

    @Override
    public String toString() {
        return navn + " med en Scoville på " + styrke;
    }


}
