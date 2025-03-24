package animal;

public class Elephant extends ZooAnimal implements Running {
    
    public Elephant(String color, String species, String name, String texture, String massive) {
        super(color, species, name, texture, massive);
    }

@Override
public void eyeType() {
    System.out.println(name + " has side-facing eyes");
}

@Override
public void run() {
    System.out.println(name + " is quick.");
}

@Override
public void fly() {
    System.out.println(name + " does not fly");
}

@Override 
public void furType() {
    System.out.println(name + " has no fur");
}

protected void tired() {
    System.out.println("The elephant is tired");
}

private void swim() {
    System.out.println("The elephant is swimming");
}

}
