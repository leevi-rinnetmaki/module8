import java.util.HashMap;

public class ShoppingCart {

    public HashMap<String, Double> items = new HashMap<>();

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public void removeItem(String item) {
        items.remove(item);
    }

    public HashMap<String, Double> getitems() {
        return items;
    }

    public double getTotalCost() {
        double total = 0;
        for(double i: items.values()){
            total += i;
        }
        return total;
    }
}
