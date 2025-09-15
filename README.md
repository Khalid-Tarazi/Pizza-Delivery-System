# Overview
The focus of this project is to design and implement data structures and algorithms that ensure efficient order handling and delivery management.

---

# 🍕 Pizza Delivery System – Data Structures & Algorithms Project

The system should support:  
- Ordering pizza  
- Canceling an order  
- Controlling the delivery process

---

## 🎯 Objectives
- Apply **data structures** (queues, stacks, linked lists, etc.) to manage orders and deliveries.  
- Implement **algorithms** for processing orders efficiently.  
- Demonstrate **problem-solving skills** in real-world scenarios.  
- Practice **clean coding** and **modular design**.  

---

## 🛠️ Implementation Details

### 🔹 Data Structures Used
- **Queue** → To manage pizza orders in a FIFO manner.  
- **Stack** → For handling canceled orders (e.g., storing last canceled order).  
- **Linked List / ArrayList** → To maintain active customer orders.  
- **HashMap** → To quickly lookup orders by order ID.  

### 🔹 Algorithms
- **Order Placement** → Add to queue.  
- **Order Cancellation** → Pop from stack or remove from active list.  
- **Delivery Control** → Dequeue for delivery in correct order.  
- **Efficiency** → Minimized lookup and retrieval times.

---

## 📂 Repository Structure

- **README.md** → Project overview and documentation  

- **/docs** → Project documentation  
  - `requirements.md` → System requirements  
  - `algorithms-explained.md` → Explanation of data structures & algorithms  
  - `system-design.md` → Design approach  

- **/src** → Source code  
  - `Order.java` → Pizza order class  
  - `PizzaDeliverySystem.java` → Core system logic  
  - `Main.java` → Program entry point  

- **/tests** → Test files  
  - `OrderTest.java` → Unit tests for Order  
  - `PizzaDeliverySystemTest.java` → System tests  

- **/diagrams** → Visuals & diagrams  
  - `uml-diagram.png` → UML class diagram
