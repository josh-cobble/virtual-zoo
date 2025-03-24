package enclosures;

public class Enclosure {
    protected String type;
    
    public Enclosure(String type) {
        this.type = type;
    }

    public void feed() {
        System.out.println("The animal is fed in the " + type + " enclosure.");
    }

    public void enclosureInformation() {
        System.out.println("This is an enclosure of " + type);
    }

    private void extraEnclosureInformation() {
        System.out.println("The enclosures are very large");
    }
    
    }
