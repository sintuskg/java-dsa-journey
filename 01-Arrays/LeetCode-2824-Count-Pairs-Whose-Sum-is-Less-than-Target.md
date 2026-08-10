# 🔎 LeetCode 2824 — Count Pairs Whose Sum is Less than Target

Count Pairs Whose Sum is Less than Target is an array problem based on the **Two Pointer** technique after sorting the input.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- Sorting
- Two Pointer Technique
- Pair Counting
- Search Space Reduction
- Boundary Management

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 2824 | Count Pairs Whose Sum is Less than Target | Easy | Two Pointers | [Java](./LeetCode-2824-Count-Pairs-Whose-Sum-is-Less-than-Target.java) |

---

## 💡 Important Techniques

### 1. Sorting

Sort the list first so that the relationship between the left and right values can be used efficiently.

### 2. Two Pointer

Use one pointer at the beginning and another at the end of the sorted list.

### 3. Count Multiple Pairs at Once

If `nums[left] + nums[right] < target`, then every element between `left` and `right` can form a valid pair with `nums[left]`.

Therefore, we can add `right - left` pairs at once instead of checking every pair individually.

### 4. Move the Correct Boundary

- If the sum is less than `target`, move `left` forward.
- Otherwise, move `right` backward to reduce the sum.

---

## 🎯 Learning Goal

My goal is to understand **why** `right - left` gives the number of valid pairs instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
