# 🔎 LeetCode 509 — Fibonacci Number

Fibonacci Number is a recursion problem based on the mathematical Fibonacci sequence.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Recursion
- Base Cases
- Recursive Function Calls
- Fibonacci Sequence
- Call Stack
- Recursive Problem Solving

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 509 | Fibonacci Number | Easy | Recursion | [Java](./LeetCode-509-Fibonacci-Number.java) |

---

## 💡 Important Techniques

### 1. Base Case

The recursion stops when `n <= 1`.

- `F(0) = 0`
- `F(1) = 1`

### 2. Recursive Relation

For every `n > 1`, the Fibonacci value is calculated using the previous two values:

`F(n) = F(n - 1) + F(n - 2)`

### 3. Call Stack

Each recursive call waits for the result of the next two recursive calls before returning its value.

This creates a recursive call tree and makes the basic recursive solution expensive for larger values of `n`.

### 4. Worst Case Complexity

For this basic recursive solution:

- **Worst Case Time Complexity:** `O(2^n)`
- **Worst Case Space Complexity:** `O(n)` because of the recursive call stack.

---

## 🎯 Learning Goal

My goal is to understand **how recursion works through base cases, recursive calls, and the call stack** instead of simply memorizing the Fibonacci formula.

> Solve → Understand → Optimize → Document 🚀
