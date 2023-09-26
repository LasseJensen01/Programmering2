package Ex01;

public class Growl implements BarkInterface{
    @Override
    public void bark() {
        System.out.println("Growl! Growl!");
    }
}
