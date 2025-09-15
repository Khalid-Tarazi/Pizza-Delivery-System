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

---

I will use a singly linked list (SLL) with the queue data structure to illustrate how it works, here is an example using draw.io:

### The current Queue Order List

<img width="824" height="511" alt="image" src="https://github.com/user-attachments/assets/266a53d7-b71b-4cda-95c1-73a9bd5ed6f8" />

1- Enqueue Operation (Adding a New Order):

¤	Customer Eren Smith places order #101.
¤	The order becomes the first element if queue is empty.
¤	If queue not empty, it's linked to the current rear.
¤	Rear pointer is updated to the new order.

<img width="778" height="406" alt="image" src="https://github.com/user-attachments/assets/d4b61128-5942-4ed7-96e4-3b9bd14cb3ee" />

2- Dequeue Operation (Processing an Order): 

¤	Order #99 is removed from the front.
¤	Front pointer moves to the next order (#100).
¤	The dequeued order is returned for processing.

<img width="725" height="286" alt="image" src="https://github.com/user-attachments/assets/085f9325-bfcf-4347-886f-a8a87158d951" />

3- Enqueue Operation (Adding a New Order):

¤	Customer Mike Wilson places order #102.
¤	The order becomes the first element if queue is empty.
¤	If queue not empty, it's linked to the current rear.
¤	Rear pointer is updated to the new order.

<img width="776" height="358" alt="image" src="https://github.com/user-attachments/assets/85033bda-90a1-4f25-b1b8-60ce9092c9dc" />

4- Peek Operation (Checking Next Order): 

¤	View the front order without removing it.
¤	Allows kitchen staff to prepare for upcoming orders.

<img width="765" height="301" alt="image" src="https://github.com/user-attachments/assets/4480d30e-fb90-4ef6-a3fb-b67f585e4147" />

5- Remove Operation (Cancel Order):

¤	Locate the node with the specific order ID, let’s choose order#101.
¤	Adjust pointers to remove the node from the queue.

<img width="940" height="397" alt="image" src="https://github.com/user-attachments/assets/f8133d90-7f69-47a4-87af-db601f5db09c" />

¤	Connecting nodes, to maintain logical order.

<img width="568" height="297" alt="image" src="https://github.com/user-attachments/assets/173eef44-28d4-459f-8170-7b49f9cdfd50" />

