package main;

import animal.*;
import enclosures.*;
import help.Helper;

import java.util.Scanner;

public class Main {

    private static final void Welcome() {
        System.out.println("Welcome to the virtual zoo created for educational purposes!");
    }

    public static void main(String[] args) {

        ZooAnimal wolf = new Wolf("gray", "Canis Lupis", "Max", "soft", "medium");
        ZooAnimal deer = new Deer("brown", "Odocolieus virginianus", "Arthur", "soft", "large");
        ZooAnimal eagle = new Eagle("tan", "Aquila chrysaetos", "Sam", "rough", "small");
        ZooAnimal elephant = new Elephant("gray", "Loxodonta africana", "Ellert", "smooth", "massive");
        ZooAnimal gorilla = new Gorilla("silver", "Gorilla gorilla", "George", "furry", "medium");


        Enclosure wolfEnclosure = new SmallEnclosure("Wolf");
        Enclosure deerEnclosure = new SmallEnclosure("Deer");
        Enclosure eagleEnclosure = new SmallEnclosure("Eagle");
        Enclosure elephantEnclosure = new SmallEnclosure("Elephant");
        Enclosure gorillaEnclosure = new SmallEnclosure("Gorilla");


        System.out.println("\nWelcome to the virtual zoo, where you can learn about animals anywhere or on the go!");

        Scanner scanner = new Scanner(System.in);

        while (true) {

        startMessage();
        
        String zooInput = scanner.nextLine().toLowerCase();

        if (zooInput.equals("exit")) {
            System.out.println("\nExit successful.");
            break;
        }
        if (zooInput.equals("help")) {
            Helper wolfHelp = new Helper("wolf");
            wolfHelp.showHelp();

            Helper deerHelp = new Helper("deer");
            deerHelp.showHelp();

            Helper eagleHelp = new Helper("eagle");
            eagleHelp.showHelp();

            Helper elephantHelp = new Helper("elephant");
            elephantHelp.showHelp();

            Helper gorillaHelp = new Helper("gorilla");
            gorillaHelp.showHelp();
        }

        switch (zooInput.toLowerCase()) {
            case "wolf":
                System.out.println("\nDisplaying information for Max the wolf:");
                wolf.enclosureInformation();
                wolfEnclosure.feed();
                wolf.eyeType();
                ((Wolf) wolf).run();
                if (wolf instanceof Predator) {
                    ((Predator) wolf).eat();
                }
                    ((ZooAnimal) wolf).furType();
                break;

            case "deer":
                System.out.println("\nDisplaying information for Arthur the deer:");
                deer.enclosureInformation();
                deerEnclosure.feed();
                deer.eyeType();
                ((Deer) deer).run();
                break;

            case "eagle":
                System.out.println("\nDisplaying information for Sam the eagle:");
                eagle.enclosureInformation();
                eagleEnclosure.feed();
                eagle.eyeType();
                ((Eagle) eagle).fly();
                if (eagle instanceof Predator) {
                    ((Predator) eagle).eat();
                }
                break;

            case "elephant":
                System.out.println("\nDisplaying information for Ellert the elephant:");
                elephant.enclosureInformation();
                elephantEnclosure.feed();
                elephant.eyeType();
                ((Elephant) elephant).run();
                break;

            case "gorilla":
                System.out.println("\nDisplaying information for George the gorilla:");
                gorilla.enclosureInformation();
                gorillaEnclosure.feed();
                gorilla.eyeType();
                ((Gorilla) gorilla).run();
                break;

            default:
                System.out.println("\nPlease enter the species of 1 of these 5 animals: 'wolf', 'deer', 'eagle', 'elephant', or 'gorilla.'");
                break;

        }
    }

        scanner.close();

    }

    protected static void startMessage() {
        System.out.println("\nEnter the species of animal you would like to learn about (without quotation marks).");
        System.out.println("This zoo currently has 5 animals: 'wolf', 'deer', 'eagle', 'elephant', and a 'gorilla.'\n");
        System.out.println("Enter 'exit' (without quotation marks) to exit or 'help' to get see more animal facts.");
    }


}

