package java;

public class Animal {

    public int legs;
    public String size;//   tiny/small/medium/large/huge
    public boolean isFixed;
    public String name;
    public String hairColor;

    public Animal(int legs, String size, boolean isFixed, String name, String hairColor) {
        this.legs = legs;
        this.size = size;
        this.isFixed = isFixed;
        this.name = name;
        this.hairColor = hairColor;
    }

    public String speak() {
        return "---";
    }
}
