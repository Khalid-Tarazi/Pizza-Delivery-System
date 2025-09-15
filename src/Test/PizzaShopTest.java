//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class PizzaShopTest {
//
//    @Test
//    public void testCancelOrderPerformance() {
//        PizzaShop pizzaShop = new PizzaShop();
//        int numberOfOrders = 100000;
//        pizzaShop.generateOrders(numberOfOrders);
//
//        int lastOrderId = numberOfOrders;
//        assertTrue(pizzaShop.contains(lastOrderId));
//
//        long startTime = System.nanoTime();
//        pizzaShop.cancelOrder(lastOrderId);
//        long endTime = System.nanoTime();
//
//        double durationSeconds = (endTime - startTime) / 1_000_000_000.0;
//        System.out.println("Time taken to cancel order: " + durationSeconds + " s");
//
//        assertFalse(pizzaShop.contains(lastOrderId));
//    }
//}