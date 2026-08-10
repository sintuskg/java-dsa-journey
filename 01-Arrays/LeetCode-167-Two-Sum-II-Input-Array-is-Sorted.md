# 🔎 LeetCode 167 — Two Sum II - Input Array Is Sorted

Two Sum II is an array problem that uses the **Two Pointer** technique on a sorted array.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- Sorted Arrays
- Two Pointer Technique
- Search Space Reduction
- 1-Based Indexing
- Boundary Management

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 167 | Two Sum II - Input Array Is Sorted | Medium | Two Pointers | [Java](./LeetCode-167-Two-Sum-II-Input-Array-is-Sorted.java) |

---

## 💡 Important Techniques

### 1. Two Pointer

Use two pointers:

- `left` starts from the beginning.
- `right` starts from the end.

Because the array is sorted, the sum tells us which pointer to move.

### 2. Reduce the Search Space

- If `sum > target`, move `right` backward to reduce the sum.
- If `sum < target`, move `left` forward to increase the sum.
- If `sum == target`, the required pair is found.

### 3. 1-Based Indexing

The problem asks for **1-based indices**, so the returned positions are `left + 1` and `right + 1`.

---

## 🎯 Learning Goal

My goal is to understand **why** a sorted array allows two pointers to find the required pair in `O(n)` instead of using a nested-loop `O(n²)` approach.

> Solve → Understand → Optimize → Document 🚀
