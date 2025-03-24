package animal;

public abstract class ZooAnimal {

protected String color;
protected String species;
protected String name;
protected String texture;
protected String massive;


public ZooAnimal(String color, String species, String name, String texture, String massive) {
    this.color = color;
    this.species = species;
    this.name = name;
    this.texture = texture;
    this.massive = massive;
}

public ZooAnimal(String color, String name, String texture, String massive) {
    this(color, "Unknown species", name, "Unknown texture", "Unknown size");
}

public abstract void eyeType();

public abstract void furType();

public final void enclosureInformation() {
    System.out.println("Here is a(n) " + color + " " + species + " named " + name + " who is " + texture + " and " + massive);
}

private static final void sleep() {
    System.out.println("The animal is asleep.");
}

private static final void mate() {
    System.out.println("The animal has found a mate");
}

private static final void hungry() {
    System.out.println("The animal is hungry");
}

}