# 🔎 LeetCode 977 — Squares of a Sorted Array

Squares of a Sorted Array is an array problem based on the **Two Pointer** technique.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Sorted Arrays
- Two Pointer Technique
- Absolute Values
- Reverse Filling
- Array Traversal
- In-Place Pointer Management

---

## 🧩 Problem

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 977 | Squares of a Sorted Array | Easy | Two Pointers | [Java](./LeetCode-977-Squares-of-a-Sorted-Array.java) |

---

## 💡 Important Techniques

### 1. Two Pointer

Use one pointer at the beginning and another at the end because the largest square can come from either end of a sorted array containing negative numbers.

### 2. Compare Absolute Values

Compare `Math.abs(nums[i])` and `Math.abs(nums[j])` to determine which value produces the larger square.

### 3. Fill From the End

Place the largest square at the last available position and move backward through the result array.

---

## 🎯 Learning Goal

My goal is to understand **why** comparing both ends gives the correct sorted order instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
