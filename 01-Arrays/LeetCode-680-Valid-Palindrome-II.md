# 🔎 LeetCode 680 — Valid Palindrome II

Valid Palindrome II is a string problem based on the **Two Pointer** technique with one allowed deletion.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- String Traversal
- Two Pointer Technique
- Palindrome Checking
- At Most One Deletion
- Helper Method
- Boundary Management

---

## 🧩 Problem

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 680 | Valid Palindrome II | Easy | Two Pointers | [Java](./LeetCode-680-Valid-Palindrome-II.java) |

---

## 💡 Important Techniques

### 1. Two Pointer

Compare characters from both ends and move the pointers toward the center while the characters match.

### 2. One Deletion

When the first mismatch occurs, only two possibilities need to be checked: delete the left character or delete the right character.

### 3. Helper Method

The helper method checks whether the remaining range is a palindrome without creating another string.

---

## 🎯 Learning Goal

My goal is to understand **why** checking both deletion possibilities works instead of simply memorizing the solution.

> Solve → Understand → Optimize → Document 🚀
