/**
 *
 * @author cheryjeff
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Checkout {

    List<Item> items;

    public Checkout() {
        this.items = new ArrayList<>();
        
    }

    public void enterItem(Item item) {
        items.add(item);

    }
    
    public int numberOfItems() {
        return items.size();
    }

    public int totalCost() {
        int totalCost = 0;
        for (Item i : items) {
            totalCost += i.getCost();
        }
        return totalCost;
    }

    public int totalTax() {
        double tax = (totalCost() * 6.5) / 100;
        int roundedTax = (int) (tax / 1);
        if (tax % 1 >= 0.5) {
            roundedTax++;
        }
        return roundedTax;
    }

    public void clear() {
        items.clear();
    }
    
    
   public void Printarray(){
         
         for (Item it :items){
          System.out.println(it);
             
          }
        
                
     }
        
    @Override
    public String toString() {
    return GroceryStore.STORE_NAME;
        
    }
    
   
}

