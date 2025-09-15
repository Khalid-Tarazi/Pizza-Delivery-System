Detailed specification for our queue-based order management system:

1- Data Structure Overview

I will implement a Queue using a linked list approach
The Queue will maintain FIFO (First-In-First-Out) order for processing pizzas in the order they are received.
Each order will be encapsulated in a Node containing the order data and a reference to the next node.

---
2- Operations and Their Implementation Steps:

*Note: I used draw.io to draw the sketches for each operation.

A. Enqueue (Add New Order): (Insertion)

Adds a new order to the rear of the queue:
Create new Node with Order data
If queue is empty, set both head and tail to new node
Otherwise, set tail's next to new node and update tail
Increment size counter
Time Complexity: O(1)

<img width="767" height="680" alt="image" src="https://github.com/user-attachments/assets/2be4b57e-49c2-481f-904d-1ffb22d1f595" />

B. Dequeue (Process Next Order): (Deletion)

Removes the order from the front of the queue for processing:
Check if queue is empty
Store head's order data
Move head to next node
Decrement size counter
If queue becomes empty, set tail to null
Return stored order
Time Complexity: O(1)

<img width="767" height="643" alt="image" src="https://github.com/user-attachments/assets/0a6ac1be-8dce-48f5-887d-3357b0216d92" />

C. Peek (View Next Order):

Retrieves the order details at the front of the queue without removing it:
Check if queue is empty
Return head's order data without removing it
Time Complexity: O(1)

<img width="656" height="601" alt="image" src="https://github.com/user-attachments/assets/0fb74cb6-eb7c-42c4-b8ac-70efa02d33a5" />

---
3- Properties:

Head: Points to the first node (next order to be processed)
Tail: Points to the last node (most recently added order)
Size: Tracks number of orders in the queue list

*Node Structure: Each node represents a pizza order and consists of:
- data: Stores the order details (e.g., order ID, pizza type, delivery address).
- next pointer: Points to the next node in the queue.

