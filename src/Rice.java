/**
 *
 * @author cheryjeff
 */
public class Rice extends Item {

    double RiceWeight;
    int CostPerLbs;

    public Rice(String name, double weight, int price) {
        super(name);
        this.RiceWeight = weight;
        this.CostPerLbs = price;
        
        
      
    }

    @Override
    public int getCost() {
        int roundedCost = 0;
        double cost = RiceWeight * CostPerLbs;
        roundedCost = (int)(cost / 1);
        if (cost % 1 >= 0.5) {
             roundedCost++;
        }
        return roundedCost;
    }
    @Override
    public String toString() {
     return this.RiceWeight + "lbs. @ "  + this.CostPerLbs + "/lb "+ "\n" + this.name + "        " + (double)this.getCost()/100 ; 
        
    }
}

