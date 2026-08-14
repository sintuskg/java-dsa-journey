# 🔎 LeetCode 9 — Palindrome Number

Palindrome Number is a number problem based on the **Two Pointer / Reverse Half** concept without converting the number into a string.

This problem is part of my Java DSA journey while preparing for coding interviews.

---

## 📚 Concepts Covered

- Numbers
- Palindrome
- Digit Manipulation
- Reverse Half of a Number
- Integer Division
- Constant Space

---

## 🧩 Problems

| # | Problem | Difficulty | Pattern | Solution |
|---|---|---|---|---|
| 9 | Palindrome Number | Easy | Reverse Half | [Java](./LeetCode-9-Palindrome-Number.java) |

---

## 💡 Important Techniques

### 1. Handle Edge Cases

Negative numbers are not palindromes. Also, a number ending in `0` cannot be a palindrome unless the number itself is `0`.

### 2. Reverse Only Half

Instead of reversing the complete number, reverse only the second half and compare it with the remaining first half.

This avoids unnecessary work and keeps the solution at `O(1)` extra space.

### 3. Handle Odd Number of Digits

For numbers with an odd number of digits, the middle digit does not affect whether the number is a palindrome. Therefore, compare `x` with `reversedHalf / 10` as the second condition.

---

## 🎯 Learning Goal

My goal is to understand **how digit manipulation can solve palindrome problems without converting the number into a String**.

> Solve → Understand → Optimize → Document 🚀
