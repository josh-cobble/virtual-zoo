package animal;

public class Gorilla extends ZooAnimal implements Running {
    
    public Gorilla(String color, String species, String name, String texture, String massive) {
        super(color, species, name, texture, massive);
    }

@Override
public void eyeType() {
    System.out.println(name + " has front-facing eyes");
}

@Override
public void run() {
    System.out.println(name + " is moderately fast.");
}

@Override
public void fly() {
    System.out.println(name + " does not fly.");
}

@Override
public void furType() {
    System.out.println(name + " is very furry");
}

protected void taste() {
    System.out.println("The gorilla is taste testing food");
}

private void curious() {
    System.out.println("No one is allowed to know, but George is curious");
}

}
