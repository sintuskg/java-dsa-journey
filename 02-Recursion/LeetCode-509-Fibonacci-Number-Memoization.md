# 🔎 LeetCode 509 — Fibonacci Number (Memoization)

This is the optimized version of **LeetCode 509 — Fibonacci Number** using **Recursion + Memoization**.

The previous recursive solution recalculates the same Fibonacci values many times. Memoization stores calculated results and reuses them.

---

## 📚 Concepts Covered

- Recursion
- Memoization
- Top-Down Dynamic Programming
- Dynamic Programming Array
- Avoiding Repeated Calculations
- Call Stack

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 509 | Fibonacci Number | Easy | Recursion + Memoization | [Java](./LeetCode-509-Fibonacci-Number-Memoization.java) |

---

## 💡 Important Techniques

### 1. Memoization

Store every calculated Fibonacci value in the `dp` array so that the same value does not need to be calculated again.

### 2. Top-Down Dynamic Programming

The solution starts with `fib(n)` and recursively breaks the problem into smaller subproblems while storing their results.

### 3. Avoid Repeated Work

In the basic recursive solution, values such as `fib(n - 2)` can be calculated multiple times. Memoization calculates each required state only once.

### 4. Complexity Improvement

The previous recursive approach has a worst-case time complexity of `O(2^n)`. With memoization, each Fibonacci state is calculated only once.

**Worst Case Time Complexity:** `O(n)`  
**Worst Case Space Complexity:** `O(n)`

---

## 🔄 Previous vs Optimized

| Approach | Time | Space |
|---|---:|---:|
| Basic Recursion | `O(2^n)` | `O(n)` |
| Recursion + Memoization | `O(n)` | `O(n)` |

---

## 🎯 Learning Goal

My goal is to understand **how memoization removes repeated recursive calculations and improves the time complexity from `O(2^n)` to `O(n)`**.

> Solve → Understand → Optimize → Document 🚀
