# 🔎 LeetCode 217 — Contains Duplicate

Contains Duplicate is an array problem based on the **HashSet** technique.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- HashSet
- Duplicate Detection
- Hashing
- Single Pass Traversal
- Constant-Time Average Lookup

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 217 | Contains Duplicate | Easy | HashSet | [Java](./LeetCode-217-Contains-Duplicate.java) |

---

## 💡 Important Techniques

### 1. HashSet

Use a `HashSet` to store the elements that have already been seen.

A set stores only unique values, so if a number is already present, we know that the array contains a duplicate.

### 2. Single Pass

Traverse the array once. For every number:

- If it already exists in the set → return `true`.
- Otherwise → add it to the set.

### 3. Early Return

As soon as a duplicate is found, return `true` without processing the remaining elements.

If the complete array is processed without finding a duplicate, return `false`.

---

## 🎯 Learning Goal

My goal is to understand **why** a HashSet provides an efficient way to detect duplicates instead of using nested loops with `O(n²)` time complexity.

> Solve → Understand → Optimize → Document 🚀
