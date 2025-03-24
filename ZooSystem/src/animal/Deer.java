package animal;

public class Deer extends ZooAnimal implements Running {

    public Deer(String color, String species, String name, String texture, String massive) {
        super(color, species, name, texture, massive);
    }

@Override
public void eyeType() {
    System.out.println(name + " has side-facing eyes");
}

@Override
public void run() {
    System.out.println(name + " runs very quickly");
}

@Override
public void furType() {
    System.out.println(name + " is a slightly furry animal.");
}

@Override
public void fly() {
    System.out.println(name + " does not fly.");
}

protected void relax() {
    System.out.println("The deer is relaxing");
}

private void chew() {
    System.out.println("The deer eats vegetation");
}

}
