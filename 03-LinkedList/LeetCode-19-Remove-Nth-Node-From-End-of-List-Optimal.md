# 🔎 LeetCode 19 — Remove Nth Node From End of List (Optimal)

The optimal solution removes the nth node from the end of a linked list using a **Two Pointer** technique in a single traversal.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Singly Linked List
- Two Pointer Technique
- Fast and Slow Pointers
- Dummy Node
- One Pass Traversal
- Node Deletion

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 19 | Remove Nth Node From End of List | Medium | Two Pointers | [Java](./LeetCode-19-Remove-Nth-Node-From-End-of-List-Optimal.java) |

---

## 💡 Important Techniques

### 1. Maintain a Gap of `n` Nodes

Move the first pointer `n` positions ahead. This creates a fixed gap between the two pointers.

### 2. Move Both Pointers Together

After creating the gap, move both pointers until the second pointer reaches the end of the list.

At that point, the first pointer is positioned just before the node that needs to be removed.

### 3. Dummy Node

A dummy node is placed before `head` so that removing the first node is handled safely without a separate special case.

### 4. One Pass

Unlike the previous solution, this approach does not calculate the length of the linked list first. The node is located directly using the pointer gap.

---

## ⚡ Why This is Better

### Previous Approach

- First pass → calculate the length.
- Second pass → find the node to remove.
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

### Optimal Approach

- One traversal using two pointers.
- Time Complexity: `O(n)`
- Space Complexity: `O(1)`

The Big-O complexity is the same, but the optimal approach is cleaner because it finds the required position without explicitly calculating the list length.

---

## 🎯 Learning Goal

My goal is to understand **how a fixed gap between two pointers can locate a node from the end in one traversal** instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
