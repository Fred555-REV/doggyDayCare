package dayCare;

public class Cat extends Animal {

    public String pattern;
    public Boolean wasStray;
    public Boolean isInsideCat;

    public Cat(String size, Boolean isFixed, String name, String hairColor, String pattern, Boolean wasStray, Boolean isInsideCat) {
        super(size, isFixed, name, hairColor);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isInsideCat = isInsideCat;
    }

    public String speak() {
        return "AYBABTU";
    }

    public String toString() {
        return String.format("{ size: %s, isFixed: %s, name: %s, hairColor: %s, pattern: %s, wasStray: %s, isInsideCat: %s}", size, isFixed, name, hairColor, pattern, wasStray, isInsideCat);
    }
}
