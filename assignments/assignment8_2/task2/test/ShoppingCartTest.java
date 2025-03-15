import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    void addItem() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("chocolate", 1.0);
        sc.addItem("strawberries", 2.0);
        assertTrue(sc.items.containsKey("chocolate"));
        assertEquals(2.0, sc.items.get("strawberries"));

    }

    @Test
    void removeItem() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("chocolate", 1.0);
        sc.addItem("strawberries", 2.0);
        sc.removeItem("chocolate");
        assertFalse(sc.items.containsKey("chocolate"));

    }

    @Test
    void getItems() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("chocolate", 1.0);
        assertTrue(sc.getitems().containsKey("chocolate"));
    }

    @Test
    void getTotalCost() {
        ShoppingCart sc = new ShoppingCart();
        sc.addItem("chocolate", 1.0);
        sc.addItem("strawberries", 2.0);
        sc.addItem("bike", 3.0);
        assertEquals(6.0, sc.getTotalCost());

    }
}