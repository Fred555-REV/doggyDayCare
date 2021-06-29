package java;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<Animal> animalList = new ArrayList<Animal>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter amount of Dogs: ");

        int dogAmount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < dogAmount; i++) {
            String size = scan.nextLine();
            Boolean isFixed = scan.nextBoolean();
            scan.nextLine();
            String name = scan.nextLine();
            String hairColor = scan.nextLine();
            String breed = scan.nextLine();
            int snoutLength = scan.nextInt();
            scan.nextLine();
            String diet = scan.nextLine();
            DayCare.addAnimal(new Dog(size, isFixed, name, hairColor, breed, snoutLength, diet), animalList);
        }

        System.out.println("Enter amount of Cats: ");

        int catAmount = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < catAmount; i++) {
            String size = scan.nextLine();
            Boolean isFixed = scan.nextBoolean();
            scan.nextLine();
            String name = scan.nextLine();
            String hairColor = scan.nextLine();
            String pattern = scan.nextLine();
            Boolean wasStray = scan.nextBoolean();
            Boolean isInsideCat = scan.nextBoolean();
            scan.nextLine();
            DayCare.addAnimal(new Cat(size, isFixed, name, hairColor, pattern, wasStray, isInsideCat), animalList);
        }
    }
}
