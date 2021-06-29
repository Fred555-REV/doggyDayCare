package java;

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
}
