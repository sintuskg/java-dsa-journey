# 🔎 LeetCode 509 — Fibonacci Number (Tabulation)

This is the **Bottom-Up Dynamic Programming** version of LeetCode 509 — Fibonacci Number.

Instead of recursively solving the problem, we calculate smaller Fibonacci values first and use them to build the final answer.

---

## 📚 Concepts Covered

- Dynamic Programming
- Tabulation
- Bottom-Up Approach
- DP Array
- Fibonacci Sequence
- Reusing Previously Calculated Results

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 509 | Fibonacci Number | Easy | Dynamic Programming — Tabulation | [Java](./LeetCode-509-Fibonacci-Number-Tabulation.java) |

---

## 💡 Important Techniques

### 1. Tabulation

Create a `dp` array where `dp[i]` stores the Fibonacci value for `i`.

We start with the base cases:

- `dp[0] = 0`
- `dp[1] = 1`

Then calculate every value from `2` to `n`.

### 2. Bottom-Up Dynamic Programming

Instead of starting from `n` and recursively going down, we start from the smallest known values and build the answer upward.

### 3. Avoid Repeated Calculations

Each Fibonacci value is calculated exactly once and stored in the `dp` array.

---

## 🔄 Previous vs Optimized Approaches

| Approach | Worst Time | Worst Space |
|---|---:|---:|
| Basic Recursion | `O(2^n)` | `O(n)` |
| Recursion + Memoization | `O(n)` | `O(n)` |
| Memoization with Parameter DP | `O(n)` | `O(n)` |
| Tabulation | `O(n)` | `O(n)` |

---

## 🎯 Learning Goal

My goal is to understand **how Bottom-Up Dynamic Programming eliminates recursion and builds the answer from smaller subproblems** instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
