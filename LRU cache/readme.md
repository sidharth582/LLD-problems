# 🔁 LRU Cache – Low-Level Design

## 📌 Problem Statement

Design and implement a data structure for a **Least Recently Used (LRU) Cache**.

The cache should support the following operations in **O(1)** time complexity:
- `get(key)`: Return the value of the key if the key exists in the cache, otherwise return -1.
- `put(key, value)`: Update or insert the value if the key is not already present. When the cache reaches its capacity, it should invalidate the least recently used item before inserting a new item.

---

## ✅ Requirements

- The cache must store a fixed number of key-value pairs (`capacity`).
- When inserting a new key and the cache is full:
  - Evict the **least recently used** entry (i.e., the one that hasn't been accessed for the longest time).
- All operations (`get` and `put`) must be **O(1)** in time.

---


🧱 Design Approach
	•	Use a HashMap to store the mapping of key → Node for O(1) access.
	•	Use a Doubly Linked List to track the order of usage:
	•	Most recently used → front (head)
	•	Least recently used → back (tail)
	•	On get(key):
	•	If found, move the node to the front.
	•	On put(key, value):
	•	If key exists, update value and move to front.
	•	If new key:
	•	If at capacity, evict the tail node.
	•	Insert new node at the front.