package animal;

public class Wolf extends ZooAnimal implements Predator, Running {
    
    private String pack;

    public int packMembers;

    public Wolf(String color, String species, String name, String texture, String massive, String pack, int packMembers) {
        super(color, species, name, texture, massive);
        this.pack = pack;
        this.packMembers = packMembers;
    }

    public Wolf(String color, String species, String name, String texture, String massive) {
        super(color, species, name, texture, massive);
    }

@Override
public void eyeType() {
    System.out.println(name + " has front-facing eyes");
}

@Override
public void eat() {
    System.out.println(name + " eats meat.");
}

@Override
public void run() {
    System.out.println(name + " is a fast runner.");
}

@Override
public void fly() {
    System.out.println(name + " does not fly.");
}

@Override
public void furType() {
    System.out.println(name + " is a furry animal.");
}

protected void hunt() {
    System.out.println("The wolves are hunting");
}

private void needFood() {
    System.out.println("The wolf pack is in need of food");
}

}
