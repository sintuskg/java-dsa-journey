# 🔎 LeetCode 509 — Fibonacci Number (Memoization with Parameter DP)

This is another optimized version of **LeetCode 509 — Fibonacci Number** using **Recursion + Memoization**.

In this version, the `dp` array is passed as a parameter to the recursive helper instead of being stored as a static class-level variable.

---

## 📚 Concepts Covered

- Recursion
- Memoization
- Top-Down Dynamic Programming
- Passing Arrays to Recursive Functions
- Avoiding Repeated Calculations
- Call Stack

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 509 | Fibonacci Number | Easy | Recursion + Memoization | [Java](./LeetCode-509-Fibonacci-Number-Memoization-Parameter-DP.java) |

---

## 💡 Important Techniques

### 1. DP Array as a Parameter

Instead of declaring `dp` as a static class-level variable, create it inside `fib()` and pass it to `fibo()`.

This keeps the memoization state local to the current calculation.

### 2. Memoization

Before calculating a Fibonacci value, check whether it is already stored in `dp`.

If it is available, return it directly and avoid repeated recursive work.

### 3. Recursive Relation

For `n > 1`:

`F(n) = F(n - 1) + F(n - 2)`

The result is stored in `dp[n]` after calculation.

### 4. Complexity

Each Fibonacci state is calculated only once.

**Worst Case Time Complexity:** `O(n)`  
**Worst Case Space Complexity:** `O(n)`

---

## 🔄 Memoization Versions

| Version | DP Storage | Worst Time | Worst Space |
|---|---|---:|---:|
| Memoization | Static `dp` | `O(n)` | `O(n)` |
| Parameter DP | `dp` passed to helper | `O(n)` | `O(n)` |

The second version avoids relying on a static class-level variable while keeping the same optimized complexity.

---

## 🎯 Learning Goal

My goal is to understand **how the DP array can be passed through recursive calls and how memoization removes repeated calculations**.

> Solve → Understand → Optimize → Document 🚀
