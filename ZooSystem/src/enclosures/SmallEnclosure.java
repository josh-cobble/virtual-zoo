package enclosures;

public class SmallEnclosure extends Enclosure {
    
    public SmallEnclosure(String type) {
        super(type);
    }

    @Override
    public void enclosureInformation() {
     super.enclosureInformation();
     System.out.println("This enclosure is small.");
    }

    private void enclosureOrigin() {
        System.out.println("The enclosure was built in Europe");
    }

    protected void moneyFromTickets() {
        System.out.println("The zoo makes x $ a year.");
    }

}