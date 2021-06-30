package dayCare;

public class Cat extends Animal {

    public String pattern;
    public Boolean wasStray;
    public Boolean isInsideCat;
    public String noise = "";

    public Cat(String size, Boolean isFixed, String name, String hairColor, String pattern, Boolean wasStray, Boolean isInsideCat) {
        super(size, isFixed, name, hairColor);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isInsideCat = isInsideCat;
    }

    public Cat(String size, Boolean isFixed, String name, String hairColor, String pattern, Boolean wasStray, Boolean isInsideCat, String noise) {
        super(size, isFixed, name, hairColor);
        this.pattern = pattern;
        this.wasStray = wasStray;
        this.isInsideCat = isInsideCat;
        this.noise = noise;
    }

    public String speak() {
        if (noise.equals("")) {
            return super.speak();
        } else {
            return noise;
        }
    }

    public String toString() {
        return String.format("{ name: %s, size: %s, hairColor: %s, isFixed: %s, pattern: %s, wasStray: %s, isInsideCat: %s }", name, size, hairColor, isFixed, pattern, wasStray, isInsideCat);
    }
}
