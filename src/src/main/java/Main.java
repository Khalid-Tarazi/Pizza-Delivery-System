import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String YELLOW = "\u001B[33m";
    public static final String CYAN = "\u001B[36m";

    public static void main(String[] args) {

        PizzaShop pizzaShop = new PizzaShop();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println(CYAN + "\n=========================================" + RESET);
            System.out.println(YELLOW + "       PIZZA SHOP MANAGEMENT SYSTEM      " + RESET);
            System.out.println(CYAN + "=========================================" + RESET);
            System.out.println(YELLOW + "1. Place Order" + RESET);
            System.out.println(YELLOW + "2. Cancel Order" + RESET);
            System.out.println(YELLOW + "3. Process Delivery" + RESET);
            System.out.println(YELLOW + "4. View Next Delivery" + RESET);
            System.out.println(YELLOW + "5. Display All Orders" + RESET);
            System.out.println(RED + "6. Exit" + RESET);
            System.out.println(CYAN + "=========================================" + RESET);
            System.out.print("Enter your choice: ");

            try {
                int choice = scan.nextInt();
                scan.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("\n--- Place Order ---");
                        System.out.print("Enter Order ID: ");
                        int orderId = scan.nextInt();
                        scan.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String customerName = scan.nextLine();
                        System.out.print("Enter Pizza Type: ");
                        String pizzaType = scan.nextLine();

                        if (customerName.isEmpty() || pizzaType.isEmpty()) {
                            System.out.println("Error: Customer name and pizza type cannot be empty.");
                        } else if (orderId <= 0) {
                            System.out.println("Error: Order ID must be a positive integer.");
                        } else {
                            String result = pizzaShop.placeOrder(new Order(orderId, customerName, pizzaType));
                            System.out.println(result);
                        }
                        break;

                    case 2:
                        System.out.println("\n--- Cancel Order ---");
                        System.out.print("Enter Order ID to cancel: ");
                        int cancelOrderId = scan.nextInt();
                        scan.nextLine();

                        String cancelResult = pizzaShop.cancelOrder(cancelOrderId);
                        System.out.println(cancelResult);
                        break;

                    case 3:
                        System.out.println("\n--- Process Delivery ---");
                        String deliveryResult = pizzaShop.processDelivery();
                        System.out.println(deliveryResult);
                        break;

                    case 4:
                        System.out.println("\n--- View Next Delivery ---");
                        String nextDelivery = pizzaShop.viewNextDelivery();
                        System.out.println(nextDelivery);
                        break;

                    case 5:
                        System.out.println("\n--- Display All Orders ---");
                        String allOrders = pizzaShop.displayOrders();
                        System.out.println("Current Orders:\n" + allOrders);
                        break;

                    case 6:
                        System.out.println("\nSystem is Shutting Down.");
                        scan.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter a valid number.");
                scan.nextLine();
            } catch (Exception e) {
                System.out.println("An unexpected error occurred: " + e.getMessage());
            }
        }
    }
}