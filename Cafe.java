/* This is a stub for the Cafe class */
/**
 * Constructs Cafes that behave like buildings with additional attributes and methods that are specific for a cafe.
 */
public class Cafe extends Building implements CafeRequirements{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory     

    /**
     * Constructor that takes the attributes from building and intializes new attributes that are specifically for cafe
     * @param name name of cafe (String)
     * @param address address of cafe (String)
     * @param nFloors floors of the cafe building (int)
     * @param nCoffeeOunces number of ounces of coffee the cafe has (int)
     * @param nSugarPackets number of sugar pacets the cafe has (int)
     * @param nCreams number of creams the cafe has (int)
     * @param nCups number of cups the cafe has (int)
     */
    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        super(name, address, nFloors);
        this.nCoffeeOunces=nCoffeeOunces;
        this.nSugarPackets=nSugarPackets;
        this.nCreams=nCreams;
        this.nCups=nCups;
        System.out.println("You have built a cafe: ☕");
    }

    /** Method that adjusts the cafe inventory for each coffee sold
     * @param size how many ounces a cup of coffee is (int)
     * @param nSugarPackets how many sugar packets in the cup of coffee (int)
     * @param nCreams how many creams in the cup of coffee (int)
     */
    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Here is your " + size + "oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " creams.");
    }

    /**
     * Method creates a string to be printed for a cafe
     * @return String to be printed
     */
    public String toString(){
        return this.name + " has " + this.nCoffeeOunces + " coffee ounces, " + this.nSugarPackets + " sugar packets, " + this.nCreams + " creams, and " + this.nCups + " cups.";
    }


    /**
     * Method that return a book to the collection
     * @param title title to be added to the collection (String)
     */
    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Neilson Library", 6, 500, 200, 100, 100);
        Compass.sellCoffee(12, 2, 1);
        System.out.println(Compass);
    }
    
}
