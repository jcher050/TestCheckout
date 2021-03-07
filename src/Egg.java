/**
 *
 * @author cheryjeff
 */
public class Egg extends Item {

    double pricePerDozen;//price for 12 eggs
    int numberofeggs; // number of eggs
    

    public Egg(String name, int number, double price) {
        super(name);
        this.numberofeggs = number;
        this.pricePerDozen = price;
        /*
        
        String ret = numEggs + " @ " + GroceryStore.cents2dollarsAndCents(cost) + " /dz.\n";
ret += name + "\t\t" + GroceryStore.cents2dollarsAndCents(getCost()) + "\n";
this.name = ret;
      */

    }

    @Override
    public int getCost() {
        double cost = (pricePerDozen / 12) * numberofeggs;
        int roundedCost = (int) cost / 1;
        if (cost % 1 >= 0.5) {
            roundedCost++;
        }
        return roundedCost;
    }
    
     @Override
    public String toString() {
     return this.numberofeggs + " @ "  + this.pricePerDozen + " "+ "\n" + this.name + "        " + (double)this.getCost()/100 ; 
        
    }
    
}

