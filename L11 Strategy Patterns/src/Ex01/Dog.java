package Ex01;

public abstract class Dog {
    private DietInterface dietInterface;
    private BarkInterface barkInterface;
    public void bark(){
        System.out.println("Not barking");
    }
    public void eat(){
        System.out.println("No eating");
    }

    public void setBarkInterface(BarkInterface barkInterface) {
        this.barkInterface = barkInterface;
    }

    public void setDietInterface(DietInterface dietInterface) {
        this.dietInterface = dietInterface;
    }

    public BarkInterface getBarkInterface() {
        return barkInterface;
    }

    public DietInterface getDietInterface() {
        return dietInterface;
    }
}
