# Time and Space Complexity

Efficient applications (apps/websites) aim to use minimal time and memory so they run smoothly.

---

## Time Complexity

### Definition
Time complexity describes how the running time of an algorithm grows with respect to input size `n`.

---

### Key Ideas
- Measures number of operations (not actual time).
- As input size `n` increases, runtime usually increases.
- Focus on growth rate, not small constant differences.

---

### Examples

Constant time:
```java
System.out.println("Hello World");
```
Time Complexity: O(1)

Linear time:
```java
for (int i = 0; i < n; i++) {
    System.out.println("Hello");
}
```
Time Complexity: O(n)

---

### Common Time Complexities

- O(1) → Constant
- O(n) → Linear
- O(n^2) → Quadratic
- O(log n) → Logarithmic

---

### Best, Average, Worst Case

- Best Case → Minimum time
- Average Case → Typical time
- Worst Case → Maximum time

Example: Linear Search

- Best Case → Element is first → O(1)
- Average Case → Element in middle → O(n)
- Worst Case → Element last/not found → O(n)

Note:
Average is sometimes written as (n+1)/2, but simplified to O(n)

---

### Important Notes
- Time complexity depends on input size, not code length
- Not all algorithms are O(n)
- Big-O usually refers to worst case

---

### Optimization
Ways to improve time complexity:
- Dynamic Programming
- Divide and Conquer
- Better Data Structures

---

## Space Complexity

### Definition
Space complexity measures how much memory an algorithm uses relative to input size `n`.

---

### Key Ideas
Includes:
- Variables
- Data structures
- Function call stack (recursion)

Focus is on extra (auxiliary) space.

---

### Examples

Constant space:
```java
int a = 5;
```
Space Complexity: O(1)

Linear space:
```java
int[] arr = new int[n];
```
Space Complexity: O(n)

---

## Summary

- Time Complexity → How fast the algorithm runs
- Space Complexity → How much memory it uses
- Both are important for writing efficient code