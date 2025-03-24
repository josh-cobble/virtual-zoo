package help;

import animal.Deer;
import animal.Eagle;
import animal.Elephant;
import animal.Gorilla;
import animal.Predator;
import animal.Wolf;
import animal.ZooAnimal;

public class Helper {

    private String helpMessage;

    public Helper() {
        this.helpMessage = "Please use the 'help' command to get help.";
    }

    public Helper(String animal) {
         switch (animal.toLowerCase()) {
            case "wolf":
                this.helpMessage = "The wolf is a pack animal";
                break;

            case "deer":
                this.helpMessage = "The deer eats plenty of vegetation";
                break;

            case "eagle":
                this.helpMessage = "The eagle lives in the desert";
                break;

            case "elephant":
            this.helpMessage = "The elephant is weighed in tons";
                break;

            case "gorilla":
            this.helpMessage = "The gorilla is said to be related to humans";
                break;

            default:
                System.out.println("\nPlease enter the species of 1 of these 5 animals: 'wolf', 'deer', 'eagle', 'elephant', or 'gorilla.'");
                break;

        }
    }
    
    public void showHelp() {
        System.out.println(helpMessage);
    }

    protected void helpAgain() {
        System.out.println(helpMessage);
    }
}
