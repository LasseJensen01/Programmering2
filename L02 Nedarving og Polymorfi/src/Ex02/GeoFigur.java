package Ex02;

public abstract class GeoFigur {
    private double x;
    private double y;

    public GeoFigur(double x, double y){
        this.x = x;
        this.y = y;
    }

    public abstract double calculateArea();

}
