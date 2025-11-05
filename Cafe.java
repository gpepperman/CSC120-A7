/* This is a stub for the Cafe class */
public class Cafe extends Building implements CafeRequirements{
    private int nCoffeeOunces; // The number of ounces of coffee remaining in inventory
    private int nSugarPackets; // The number of sugar packets remaining in inventory
    private int nCreams; // The number of "splashes" of cream remaining in inventory
    private int nCups; // The number of cups remaining in inventory     

    public Cafe(String name, String address, int nFloors, int nCoffeeOunces, int nSugarPackets, int nCreams, int nCups){
        super(name, address, nFloors);
        this.nCoffeeOunces=nCoffeeOunces;
        this.nSugarPackets=nSugarPackets;
        this.nCreams=nCreams;
        this.nCups=nCups;
        System.out.println("You have built a cafe: ☕");
    }

    public void sellCoffee(int size, int nSugarPackets, int nCreams){
        this.nCoffeeOunces -= size;
        this.nSugarPackets -= nSugarPackets;
        this.nCreams -= nCreams;
        this.nCups -= 1;
        System.out.println("Here is your " + size + "oz coffee with " + nSugarPackets + " sugar packets and " + nCreams + " creams.");
    }

    public String toString(){
        return this.name + " has " + this.nCoffeeOunces + " coffee ounces, " + this.nSugarPackets + " sugar packets, " + this.nCreams + " creams, and " + this.nCups + " cups.";
    }


    
    public static void main(String[] args) {
        Cafe Compass = new Cafe("Compass", "Neilson Library", 6, 500, 200, 100, 100);
        Compass.sellCoffee(12, 2, 1);
        System.out.println(Compass);
    }
    
}
