public class Queue {
    private static class Node {
        Order order;
        Node next;

        public Node(Order order) {
            this.order = order;
            this.next = null;
        }
    }

    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(Order order) {
        Node newNode = new Node(order);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public Order dequeue() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        Order order = front.order;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return order;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public Order peek() {
        if (front == null) {
            throw new IllegalStateException("Queue is empty");
        }
        return front.order;
    }

    public boolean cancelOrder(int orderId) {
        Node current = front;
        Node previous = null;

        while (current != null) {    // Iterate through the queue (linear search)
            if (current.order.getOrderId() == orderId) {
                if (previous == null) {
                    dequeue();
                } else {
                    previous.next = current.next;
                    if (current.next == null) {
                        rear = previous;
                    }
                    size--;
                }
                return true; // Order canceled
            }
            previous = current;
            current = current.next;
        }
        return false; // Order not found
    }

    public boolean contains(int orderId) {
        Node current = front;
        while (current != null) {
            if (current.order.getOrderId() == orderId) {
                return true; // Order ID found
            }
            current = current.next;
        }
        return false; // Order ID not found
    }

    public String displayQueue() {
        StringBuilder orders = new StringBuilder();
        Node current = front;
        while (current != null) {
            orders.append(current.order).append("\n");
            current = current.next;
        }
        return orders.toString();
    }
}