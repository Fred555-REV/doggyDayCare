package java;

public class Cat extends Animal {

    public String pattern;
    public boolean wasStray;
    public boolean isInsideCat;

    public Cat(int legs, String size, boolean isFixed, String name, String hairColor, String pattern, boolean wasStray, boolean isInsideCat) {
        super(legs, size, isFixed, name, hairColor);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isInsideCat = isInsideCat;
    }

    public String speak() {
        return "MOW";
    }
}
