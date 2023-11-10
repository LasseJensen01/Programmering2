package Ex01;

public class App {
    public static void main(String[] args) {

        Dog labrador = new Labrador(new PlayfullBark(), new NormalDiet());
        labrador.bark();
        labrador.eat();
        labrador.eat();
    }
}
