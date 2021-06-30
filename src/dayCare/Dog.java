package dayCare;

public class Dog extends Animal {

    public String breed;
    public int snoutLength; //  in inches
    public String diet; //  canned/dry/wet/raw/home_cooked
    public String noise = "";

    public Dog(String size, Boolean isFixed, String name, String hairColor, String breed, int snoutLength, String diet) {
        super(size, isFixed, name, hairColor);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.diet = diet;
    }

    public Dog(String size, Boolean isFixed, String name, String hairColor, String breed, int snoutLength, String diet, String noise) {
        super(size, isFixed, name, hairColor);
        this.breed = breed;
        this.snoutLength = snoutLength;
        this.diet = diet;
        this.noise = noise;
    }

    public String speak() {
        if (noise.equals("")) {
            return super.speak();
        } else {
            return noise;}
    }

    public String toString() {
        return String.format("{ name: %s, size: %s, hairColor: %s,  isFixed: %s, breed: %s, snoutLength: %s inches, diet: %s }", name, size, hairColor, isFixed, breed, snoutLength, diet);
    }
}
