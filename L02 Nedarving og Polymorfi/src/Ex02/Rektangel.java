package Ex02;

public class Rektangel extends GeoFigur{
    private double sidelængde1;
    private double sidelængde2;
    public Rektangel(double x, double y, double sidelængde1, double sidelængde2) {
        super(x, y);
        this.sidelængde2 = sidelængde2;
        this.sidelængde1 = sidelængde1;
    }

    @Override
    public double calculateArea() {
        return sidelængde1*sidelængde2;
    }
}
