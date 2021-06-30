package dayCare;

import java.util.List;

public class DayCare {
    public static void addAnimal(Animal animal, List<Animal> animalList) {
        animalList.add(animal);
    }

    public static void displayAnimals(List<Animal> animalList) {
        for (Animal animal : animalList) {
            if (animal.getClass().getSimpleName().equalsIgnoreCase("dog")) {
                System.out.println("\nDog : " + animal.name + " says " + animal.speak() + "\n" +animal);
            } else if (animal.getClass().getSimpleName().equalsIgnoreCase("cat")) {
                System.out.println("\nCat : " + animal.name + " says " + animal.speak() + "\n" +animal);
            } else {
                System.out.println("Animal: " + animal);
            }

        }
    }

    public static void removeAnimal(List<Animal> animalList, String nameToRemove) {
        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).name.equals(nameToRemove)) {
                animalList.remove(i);
            }
        }
    }

    public static void removeAnimal(List<Animal> animalList, int indexToRemove) {
        animalList.remove(indexToRemove);
    }

    public static void displayNames(List<Animal> animalList) {
        for (int i = 0; i < animalList.size(); i++) {
            System.out.println("name: " + animalList.get(i).name + ", hair color: " + animalList.get(i).hairColor + ", size: " + animalList.get(i).size + "\nindex: " + i);
        }
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