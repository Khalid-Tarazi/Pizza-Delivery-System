public class PizzaShop {
    private Queue orderQueue;

    public PizzaShop() {
        this.orderQueue = new Queue();
    }

    public String placeOrder(Order order) {
        try {
            // Check if the order ID already exists
            if (orderQueue.contains(order.getOrderId())) {
                return "Error: Order ID " + order.getOrderId() + " already exists.";
            }
            orderQueue.enqueue(order);
            return "Order placed: " + order;
        } catch (Exception e) {
            return "Error: Failed to place order. " + e.getMessage();
        }
    }

    public String cancelOrder(int orderId) {
        try {
            if (orderQueue.cancelOrder(orderId)) {
                return "Order canceled: " + orderId;
            } else {
                return "Order not found: " + orderId;
            }
        } catch (Exception e) {
            return "Error: Failed to cancel order. " + e.getMessage();
        }
    }

    public String processDelivery() {
        try {
            if (!orderQueue.isEmpty()) {
                Order order = orderQueue.dequeue();
                return "Delivering: " + order;
            } else {
                return "No orders to deliver.";
            }
        } catch (Exception e) {
            return "Error: Failed to process delivery. " + e.getMessage();
        }
    }

    public String viewNextDelivery() {
        try {
            if (!orderQueue.isEmpty()) {
                return "Next order for delivery: " + orderQueue.peek();
            }
            return "No orders to deliver.";
        } catch (Exception e) {
            return "Error: Failed to view next delivery. " + e.getMessage();
        }
    }

    public String displayOrders() {
        try {
            if (!orderQueue.isEmpty()) {
                return orderQueue.displayQueue();
            }
            return "No orders to display.";
        } catch (Exception e) {
            return "Error: Failed to display orders. " + e.getMessage();
        }
    }

//    public void generateOrders(int numberOfOrders) {          // for testing
//        for (int i = 1; i <= numberOfOrders; i++) {
//            placeOrder(new Order(i, "Customer" + i, "PizzaType" + i));
//        }
//    }
//
//    public boolean contains(int lastOrderId) { // use it for testing
//        return orderQueue.contains(lastOrderId);
//    }
}