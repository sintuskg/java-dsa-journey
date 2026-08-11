# 🔎 LeetCode 15 — 3Sum

3Sum is an array problem based on **Sorting + Two Pointer** technique.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- Sorting
- Two Pointer Technique
- Triplet Search
- Duplicate Handling
- Search Space Reduction

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 15 | 3Sum | Medium | Sorting + Two Pointers | [Java](./LeetCode-15-3Sum.java) |

---

## 💡 Important Techniques

### 1. Sorting

Sort the array first so that the two-pointer technique can be applied efficiently and duplicate values can be handled easily.

### 2. Fix One Element

For every index `first`, treat `nums[first]` as the fixed element and search for two more elements whose sum is `-nums[first]`.

### 3. Two Pointers

Use:

- `left` → starts from `first + 1`
- `right` → starts from the end

If the sum is:

- Greater than `0` → move `right--`
- Less than `0` → move `left++`
- Equal to `0` → store the triplet and move both pointers

### 4. Skip Duplicates

Skip duplicate values for both the fixed element and the two-pointer positions so that the result does not contain duplicate triplets.

### 5. Early Break

Because the array is sorted, if `nums[first] > 0`, the loop can stop. Every remaining number will also be positive, so a sum of `0` is impossible.

---

## 🎯 Learning Goal

My goal is to understand **why** sorting plus two pointers reduces the brute-force triplet search and how duplicate handling works instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
