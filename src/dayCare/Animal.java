package dayCare;

public class Animal {

    public int legs = 4;
    public String size;//   tiny/small/medium/large/huge
    public Boolean isFixed;
    public String name;
    public String hairColor;

    public Animal(String size, Boolean isFixed, String name, String hairColor) {
        this.size = size;
        this.isFixed = isFixed;
        this.name = name;
        this.hairColor = hairColor;
    }

    public String speak() {
        return "---";
    }

    public String toString() {
        return String.format("{ name: %s, size: %s, hairColor: %s,  isFixed: %s}", name, size,  hairColor, isFixed);
    }
}
