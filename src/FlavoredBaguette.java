/**
 *
 * @author cheryjeff
 */
public class FlavoredBaguette extends Baguette {

    String flavor;
    int flavorCost;

    public FlavoredBaguette(String name, int cost, String flavor, int flavorCost) {
        super(name, cost);
        this.flavor = flavor;
        this.flavorCost = flavorCost;
       
        
    }

    @Override
    public int getCost() {
        return super.getCost() + flavorCost;
       
    }
    
    @Override
    public String toString() {
     return this.name + " with " + this.flavor +"    " + (double)this.getCost()/100 ; 
        
    }
    
}

