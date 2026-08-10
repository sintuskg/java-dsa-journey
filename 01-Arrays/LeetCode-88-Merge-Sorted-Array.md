# 🔎 LeetCode 88 — Merge Sorted Array

Merge Sorted Array is an array problem based on the **Three Pointer** technique and in-place merging.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Sorted Arrays
- Three Pointer Technique
- In-Place Modification
- Reverse Traversal
- Array Merging
- Boundary Management

---

## 🧩 Problem

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 88 | Merge Sorted Array | Easy | Three Pointers | [Java](./LeetCode-88-Merge-Sorted-Array.java) |

---

## 💡 Important Techniques

### 1. Three Pointer

Use pointers for the last valid element of `nums1`, the last element of `nums2`, and the last available position in `nums1`.

### 2. Reverse Traversal

Start from the end so that existing elements in `nums1` are not overwritten before they are compared.

### 3. In-Place Merge

The result is stored directly inside `nums1`, so no extra array is required.

---

## 🎯 Learning Goal

My goal is to understand **why** merging from the back is necessary instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
