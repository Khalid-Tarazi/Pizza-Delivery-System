public class Order {
    private int orderId;
    private String customerName;
    private String pizzaType;

    public Order(int orderId, String customerName, String pizzaType) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.pizzaType = pizzaType;
    }

    public int getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", customerName='" + customerName + '\'' +
                ", pizzaType='" + pizzaType + '\'' +
                '}';
    }
}