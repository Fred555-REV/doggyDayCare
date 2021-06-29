package java;

import java.util.List;

public class DayCare {
    public static void addAnimal(Animal animal, List<Animal> animalList) {
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animalList) {

    }

    public static void removeAnimal() {

    }
}

/*

static method addAnimal takes an Animal and an Animal List. The method should add the animal to the list.

Static method displayAnimals should take an Animal List and should print out each Animal.
(note that this is going to print out Animal details)

Update the displayAnimals class where as it iterates through each animal it tests what child class it is and prints
differently depending on the Animals child type.

Static Method removeAnimal should take a name and an Animal list. The method should go through and find the animal with
the same name then remove that animal from the list.

*/