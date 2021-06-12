package oopInheritanceandpolymorphism.polymorphism;

public class Animal {
    private int legs;
    private int eyes;
    private String skinColor;
    String name;

    public Animal() {
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void move(){
        System.out.println("The animal moves");
    }
}
