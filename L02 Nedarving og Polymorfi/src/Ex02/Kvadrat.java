package Ex02;

public class Kvadrat extends GeoFigur {
    private double sidelængde;
    public Kvadrat(double x, double y, double sidelængde) {
        super(x, y);
        this.sidelængde = sidelængde;
    }

    @Override
    public double calculateArea() {
        return sidelængde*sidelængde;
    }
}
