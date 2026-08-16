# 🔎 LeetCode 746 — Min Cost Climbing Stairs

This solution uses **Recursion + Memoization (Top-Down Dynamic Programming)** to find the minimum cost required to reach the top of the staircase.

---

## 📚 Concepts Covered

- Recursion
- Memoization
- Dynamic Programming
- Top-Down DP
- Overlapping Subproblems
- Minimum Cost Optimization

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 746 | Min Cost Climbing Stairs | Easy | Recursion + Memoization | [Java](./LeetCode-746-Min-Cost-Climbing-Stairs-Memoization.java) |

---

## 💡 Important Techniques

### 1. Recursive Relation

For every stair `idx`, the minimum cost is:

`cost[idx] + min(minCost(idx - 1), minCost(idx - 2))`

We can reach the current stair from either one stair below or two stairs below.

### 2. Base Cases

For the first two stairs:

- `idx == 0` → `cost[0]`
- `idx == 1` → `cost[1]`

### 3. Memoization

The `dp` array stores the minimum cost already calculated for each index.

If `dp[idx] != -1`, we return the stored result instead of calculating the same subproblem again.

### 4. Final Answer

The top can be reached from either the last stair or the second-last stair, so we return:

`min(minCost(n - 1), minCost(n - 2))`

---

## 📊 Complexity

**Worst Case Time Complexity:** `O(n)`  
**Worst Case Space Complexity:** `O(n)`

Memoization ensures that every state is calculated only once.

---

## 🎯 Learning Goal

My goal is to understand **how recursion + memoization solves overlapping subproblems and reduces repeated calculations** instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
