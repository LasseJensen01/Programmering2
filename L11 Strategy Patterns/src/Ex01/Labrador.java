package Ex01;

public class Labrador extends Dog{

    public Labrador(BarkInterface barkInterface, DietInterface dietInterface){
        super.setBarkInterface(barkInterface);
        super.setDietInterface(dietInterface);
    }
    @Override
    public void bark(){
        getBarkInterface().bark();
    }
    @Override
    public void eat(){
        getDietInterface().eat();
    }
}
