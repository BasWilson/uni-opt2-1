import java.util.Map.Entry;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class Tests {
    
    /**
     * Check length of list
     */
    @Test
    public void testCustomersLength() {
        Simulator sim = new Simulator();
        Assert.assertEquals(24, sim.getCustomers().size());
    }

    /**
     * Check if postal code scores are between 0 - 100
     */
    @Test
    public void testPostalCodeScores() {
        Simulator sim = new Simulator();
        
        for (Entry<String, Integer> entry : sim.getPostalCodeScores().entrySet()) {
            Assert.assertTrue(entry.getValue() > 0 && entry.getValue() < 100);
        }
    }

    @Test
    public void testIfShoppingSessionAddWorks() {
        Simulator sim = new Simulator();
        Customer cus = sim.getCustomers().get(0);
        Assert.assertEquals(0, cus.getShoppingSessions().size());
        cus.addShoppingSession(new ShoppingSession());
        Assert.assertEquals(1, cus.getShoppingSessions().size());
    }
}
