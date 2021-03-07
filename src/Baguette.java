/**
 *
 * @author cheryjeff
 */
public class Baguette extends Item {
    
     int cost;

    public Baguette(String name, int cost) {
        super(name);
        this.cost = cost;
    }
    
    @Override
    public int getCost(){
        return cost;
    }

    @Override
    public String toString() {
     return this.name +"    " + (double)this.getCost()/100 ; 
        
    }
    
}
