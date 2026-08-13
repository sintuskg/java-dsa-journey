# 🔎 LeetCode 69 — Sqrt(x)

Sqrt(x) is a binary search problem where we find the square root of a non-negative integer and return it rounded down to the nearest integer.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Binary Search Basics
- Sorted Search Space
- Search Space Reduction
- Integer Square Root
- Overflow-Safe Comparison
- Finding the Maximum Valid Value

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 69 | Sqrt(x) | Easy | Binary Search | [Java](./LeetCode-69-Sqrt-x.java) |

---

## 💡 Important Techniques

### 1. Binary Search

The answer lies between `1` and `x`. Binary Search repeatedly reduces this search space by half.

### 2. Find the Largest Valid Value

If `mid² <= x`, then `mid` can be the answer, but a larger valid value may exist. Therefore, move `low` forward and store `mid` as the current answer.

If `mid² > x`, move `high` backward.

### 3. Avoid Integer Overflow

Instead of directly checking:

`mid * mid <= x`

we use:

`mid <= x / mid`

This avoids overflow when `x` is large.

---

## 🎯 Learning Goal

My goal is to understand **why** Binary Search can be applied to a numeric search space and how to safely find the largest integer whose square is less than or equal to `x`.

> Solve → Understand → Optimize → Document 🚀
