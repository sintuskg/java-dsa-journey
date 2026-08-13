# 🔎 LeetCode 169 — Majority Element

Majority Element is an array problem based on the **Boyer-Moore Voting Algorithm**.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- Boyer-Moore Voting Algorithm
- Candidate Selection
- Frequency Cancellation
- Constant Space Optimization

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 169 | Majority Element | Easy | Boyer-Moore Voting | [Java](./LeetCode-169-Majority-Element.java) |

---

## 💡 Important Techniques

### 1. Boyer-Moore Voting Algorithm

Maintain two variables:

- `candidate` → current possible majority element
- `count` → current voting count

When `count` becomes `0`, choose the current number as the new candidate.

### 2. Vote Cancellation

If the current number is equal to the candidate, increase the count. Otherwise, decrease it.

A majority element appears more than `n / 2` times, so it cannot be completely cancelled by all other elements.

### 3. Constant Space

Unlike a HashMap frequency approach, the Boyer-Moore algorithm only uses two variables, giving `O(1)` extra space.

---

## 🎯 Learning Goal

My goal is to understand **why** the Boyer-Moore Voting Algorithm can find the majority element in one pass using constant space instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
