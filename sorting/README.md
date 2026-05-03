# Sorting Algorithms

This folder contains my implementations and practice of fundamental sorting algorithms. The goal is to understand how different sorting techniques work, compare their efficiency, and build a strong foundation for more advanced algorithms.

---

## Algorithms Covered

- Bubble Sort  
- Selection Sort  
- Insertion Sort  
- Merge Sort  
- Quick Sort  

---

## Key Concepts

### Time Complexity
Sorting algorithms vary in efficiency depending on input size:

- O(n²): Bubble Sort, Selection Sort, Insertion Sort  
- O(n log n): Merge Sort, Quick Sort  

Understanding time complexity is essential for choosing the right algorithm in real-world scenarios.

---

### Stability
A sorting algorithm is **stable** if it preserves the relative order of equal elements.

- Stable: Bubble Sort, Insertion Sort, Merge Sort  
- Not Stable: Selection Sort, Quick Sort (in most implementations)

---

### In-Place vs Not In-Place

- In-Place: Bubble Sort, Selection Sort, Insertion Sort, Quick Sort  
- Not In-Place: Merge Sort (requires extra memory)

---

### Divide and Conquer
Merge Sort and Quick Sort use a **divide-and-conquer** approach:
- Break the problem into smaller subproblems  
- Solve each recursively  
- Combine results  

---

## Comparison

| Algorithm       | Time Complexity | Stable | In-Place |
|----------------|----------------|--------|----------|
| Bubble Sort    | O(n²)          | Yes    | Yes      |
| Selection Sort | O(n²)          | No     | Yes      |
| Insertion Sort | O(n²)          | Yes    | Yes      |
| Merge Sort     | O(n log n)     | Yes    | No       |
| Quick Sort     | O(n log n)*    | No     | Yes      |

\* Quick Sort has a worst-case time complexity of O(n²), but performs O(n log n) on average.

---

## Key Takeaways

- Simple sorting algorithms are useful for learning but inefficient for large datasets  
- O(n log n) algorithms are significantly faster and used in practice  
- Stability and memory usage can matter depending on the problem  
- Divide-and-conquer is a powerful technique used in advanced algorithms  

---

## Future Improvements

- Analyze worst-case vs average-case performance  
- Visualize sorting algorithms  
- Compare runtime with large datasets  
- Explore hybrid algorithms (e.g., TimSort)  

---

## Goal

To build a strong understanding of sorting algorithms and develop the problem-solving skills needed for technical interviews and real-world applications.