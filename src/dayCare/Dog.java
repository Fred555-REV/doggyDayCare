package dayCare;

public class Dog extends Animal {

    public String breed;
    public int snoutLength; //  in centimeters
    public String diet; //  canned/dry/wet/raw/home_cooked

    public Dog(String size, Boolean isFixed, String name, String hairColor, String breed, int snoutLength, String diet) {
        super(size, isFixed, name, hairColor);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.diet = diet;
    }


    public String speak() {
        return "AYBABTU";
    }

    public String toString() {
        return String.format("{ size: %s, isFixed: %s, name: %s, hairColor: %s, breed: %s, snoutLength: %s, diet: %s}", size, isFixed, name, hairColor, breed, snoutLength, diet);
    }
}
