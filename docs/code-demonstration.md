Here is a demonstration of how the system works by using the menu-driven interface in Main class:

## 1. Running the System (Placing Orders)

**User Input (Placing Three Orders)**

<img width="503" height="468" alt="image" src="https://github.com/user-attachments/assets/f177f278-ec48-457e-bf7e-924757397396" />

Figure 1. Placing order (1)

<img width="447" height="217" alt="image" src="https://github.com/user-attachments/assets/55882082-65fe-4159-90b0-8f1920c4a5a6" />

Figure 2. Placing order (2)

<img width="421" height="200" alt="image" src="https://github.com/user-attachments/assets/d170925f-09ba-427b-b807-6fab3238186c" />

Figure 3. Placing order (3)

**Internal Queue State**

It should look like this:
Front → [25: Khalid - Margherita] → [26: Ali - Pepperoni] → [27: Kevin - BBQ Chicken] → Rear

## 2. Viewing All Orders

**User Input**

<img width="651" height="358" alt="image" src="https://github.com/user-attachments/assets/352a6a2a-70f3-4bf4-b4e8-1b30ed38e2f5" />

Figure 4. Viewing all Orders (1)

Orders appear in the order they were placed.

## 3. Processing the First Delivery (FIFO)

**User Input**

<img width="843" height="294" alt="image" src="https://github.com/user-attachments/assets/04c6874b-ba3a-4efa-a4be-f150c8e5be05" />

Figure 5. Processing first Delivery

**Internal Queue State After Delivery**

Front → [26: Ali - Pepperoni] → [27: Kevin- BBQ Chicken] → Rear

## 4. Viewing the Next Order for Delivery

**User Input**

<img width="844" height="256" alt="image" src="https://github.com/user-attachments/assets/d7440e32-d278-4d45-94d0-b6cfc6ea59f8" />

Figure 6. Viewing the Next Order

Ali’s order is now first in the queue.

## 5. Canceling an Order (Ali Cancels His Order)

**User Input**

<img width="513" height="360" alt="image" src="https://github.com/user-attachments/assets/5425507b-3b05-40a5-b8df-20b08607ba55" />

Figure 7. Canceling an Order

Ali’s order is removed from the queue.

**Internal Queue State After Cancellation**
Front → [27: Kevin - BBQ Chicken] → Rear

## 6. Viewing All Orders After Cancellation
**User Input**

<img width="812" height="364" alt="image" src="https://github.com/user-attachments/assets/2a5771e5-7447-48b0-a1bc-b43eb84b1dc8" />

Figure 8. Viewing all Orders (2)

Only Kevin’s order remains in the queue.

## 7. Processing Another Delivery
**User Input**

<img width="690" height="244" alt="image" src="https://github.com/user-attachments/assets/b524de84-24e5-4fca-84ed-1efcd9e1e4bf" />

Figure 9. Processing Another Delivery

Kevin’s order is now delivered.

**Internal Queue State (Empty)**
Front → NULL

## 8. Checking for More Orders
**User Input**

<img width="433" height="294" alt="image" src="https://github.com/user-attachments/assets/d390085e-1c06-49b0-8ed2-8ec7fecabcbf" />

Figure 10. Checking for More Orders

The queue is empty, so no more deliveries are available.

---
Table 1. Efficiency Considerations
<img width="751" height="156" alt="image" src="https://github.com/user-attachments/assets/7c3c310c-a805-40d8-9be2-fde7278b2aad" />

