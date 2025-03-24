package animal;

public class Eagle extends ZooAnimal implements Predator, Running {

    public Eagle(String color, String species, String name, String texture, String massive) {
        super(color, species, name, texture, massive);
    }

    @Override
    public void eyeType() {
        System.out.println(name + " has bird eyes.");
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }

   @Override
   public void fly() {
    System.out.println(name + " flies.");
   }

   @Override
   public void furType() {
    System.out.println("This animal is somewhat furry");
   }

   @Override
   public void run() {
    System.out.println("This animal does not run");
   }

protected void seize() {
    System.out.println("The eagle has seized its prey");
}

private void upbound() {
    System.out.println("The eagle is soaring high into the sky");
}

}
