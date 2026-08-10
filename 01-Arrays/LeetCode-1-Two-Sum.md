# 🔎 LeetCode 1 — Two Sum

Two Sum is an array problem based on the **HashMap** technique.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- HashMap
- Key-Value Mapping
- Complement Technique
- Single Pass Traversal
- Searching for Previous Values

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 1 | Two Sum | Easy | HashMap | [Java](./LeetCode-1-Two-Sum.java) |

---

## 💡 Important Techniques

### 1. HashMap

Store each number along with its index so that previously seen values can be searched in `O(1)` average time.

### 2. Complement Technique

For every `nums[i]`, calculate the value required to reach the target:

`lookingFor = target - nums[i]`

If `lookingFor` is already present in the map, the required pair has been found.

### 3. Single Pass

Instead of checking every possible pair with nested loops, process the array once and use the HashMap for fast lookup.

---

## 🎯 Learning Goal

My goal is to understand **why** a HashMap can reduce the brute-force `O(n²)` approach to `O(n)` instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
