package dayCare;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Animal> animalList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of Dogs: ");
        int dogAmount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < dogAmount; i++) {
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            System.out.println("Enter hair color: ");
            String hairColor = scan.nextLine();
            System.out.println("Enter size: tiny/small/medium/large/huge");
            String size = scan.nextLine();
            System.out.println("Enter if fixed: true/false");
            Boolean isFixed = scan.nextBoolean();
            scan.nextLine();
            System.out.println("Enter breed: ");
            String breed = scan.nextLine();
            System.out.println("Enter snout length in inches: ");
            int snoutLength = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter diet: canned/dry/wet/raw/home_cooked");
            String diet = scan.nextLine();
            DayCare.addAnimal(new Dog(size, isFixed, name, hairColor, breed, snoutLength, diet), animalList);
        }

        System.out.println("Enter amount of Cats: ");
        int catAmount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < catAmount; i++) {
            System.out.println("Enter name: ");
            String name = scan.nextLine();
            System.out.println("Enter hair color: ");
            String hairColor = scan.nextLine();
            System.out.println("Enter size: tiny/small/medium/large/huge");
            String size = scan.nextLine();
            System.out.println("Enter if fixed: true/false ");
            Boolean isFixed = scan.nextBoolean();
            scan.nextLine();
            System.out.println("Enter pattern: ");
            String pattern = scan.nextLine();
            System.out.println("Enter if cat was stray: true/false");
            Boolean wasStray = scan.nextBoolean();
            System.out.println("enter if cat is an indoor car: true/false");
            Boolean isInsideCat = scan.nextBoolean();
            scan.nextLine();
            DayCare.addAnimal(new Cat(size, isFixed, name, hairColor, pattern, wasStray, isInsideCat), animalList);
        }

        DayCare.displayAnimals(animalList);

        System.out.println("Enter amount of names to remove: ");
        int namesToRemove = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < namesToRemove; i++) {
            DayCare.displayNames(animalList);
            System.out.println("Enter name to remove: ");
            String nameToRemove = scan.nextLine();
            DayCare.removeAnimal(animalList, nameToRemove);
        }

        DayCare.displayAnimals(animalList);
    }
}

/*

3
Dogmeat
black
large
false
german shepard
5
raw
Charles
white
tiny
true
chihuahua
1
home_cooked
Barker
black
medium
true
pug
0
wet
3
Cat
color1
HUGE
true
striped
true
false
STRAY
dirt
tiny
true
dotted
true
true
notaCAT
none
none
true
none
true
true

 */