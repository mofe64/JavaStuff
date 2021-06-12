package oopInheritanceandpolymorphism.inheritance;

public class Animal {
    private int legs;
    private int eyes;
    private String skinColor;
    String name;

    public Animal(String name) {
        this.name = name;
        System.out.println("Creating Animal Class");
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public int getEyes() {
        return eyes;
    }

    public void setEyes(int eyes) {
        this.eyes = eyes;
    }

    public String getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(String skinColor) {
        this.skinColor = skinColor;
    }

    protected void fly(){
        System.out.println("flying ...");
    }

    public void swim(){
        System.out.println("swimming ...");
    }
    public void walk(){
        System.out.println("walking ...");
    }
    public void breatheUnderWater(){
        System.out.println("breathing under water");
    }
}
