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
        return "MOW";
    }
}
