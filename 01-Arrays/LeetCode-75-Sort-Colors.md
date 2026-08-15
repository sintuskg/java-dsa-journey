# 🔎 LeetCode 75 — Sort Colors

Sort Colors is an array problem based on the **Dutch National Flag Algorithm** and the **Three Pointer** technique.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Arrays
- Three Pointer Technique
- Dutch National Flag Algorithm
- In-place Array Manipulation
- Partitioning
- Search Space Reduction

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 75 | Sort Colors | Medium | Three Pointers | [Java](./LeetCode-75-Sort-Colors.java) |

---

## 💡 Important Techniques

### 1. Three Pointers

We maintain three pointers:

- `i` → position where the next `0` should be placed
- `k` → current element being processed
- `j` → position where the next `2` should be placed

### 2. Dutch National Flag Algorithm

The array contains only `0`, `1`, and `2`, so we can partition it into three regions:

- `0` → left side
- `1` → middle
- `2` → right side

### 3. Pointer Movement

- If `nums[k] == 0`, swap with `nums[i]`, then move `i` and `k` forward.
- If `nums[k] == 1`, move `k` forward.
- If `nums[k] == 2`, swap with `nums[j]` and move `j` backward.

When a `2` is swapped from the right, `k` is not immediately increased because the newly swapped element still needs to be processed.

### 4. In-Place Processing

The solution rearranges the array without using an additional array, so it uses constant extra space.

---

## 🎯 Learning Goal

My goal is to understand **why** three pointers can sort the array in a single pass without using extra space instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
