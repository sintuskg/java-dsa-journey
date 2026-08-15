# 🔎 LeetCode 19 — Remove Nth Node From End of List

Remove Nth Node From End of List is a linked list problem based on length calculation and pointer manipulation.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Singly Linked List
- Dummy Node
- Pointer Traversal
- Finding List Length
- Node Deletion
- Edge Case Handling

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 19 | Remove Nth Node From End of List | Medium | Two Pass + Dummy Node | [Java](./LeetCode-19-Remove-Nth-Node-From-End-of-List.java) |

---

## 💡 Important Techniques

### 1. Find the Length

Traverse the linked list once to calculate its length.

### 2. Find the Previous Node

If the list length is `len`, the node to remove is at position `len - n + 1` from the beginning.

We move `prev` to the node just before that position.

### 3. Dummy Node

A dummy node is placed before `head`. This makes deleting the first node safe and keeps the deletion logic the same for every position.

### 4. Delete the Node

Once `prev` is at the node before the target, skip the target node:

`prev.next = prev.next.next`

---

## 🎯 Learning Goal

My goal is to understand **how linked-list pointers are moved and how a dummy node simplifies edge cases** instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
