# Week 4 – S4: Programming Fundamentals (Java Arrays)

Practice assignment covering six Java array fundamentals and five array programming problems. All solutions use basic arrays, loops, and conditionals.

## Array fundamentals

`ArrayFundamentals.java` demonstrates:
1. Creating an array: `int[] numbers = new int[5];`
2. Initializing an array: assigning values with `numbers[index] = value` (new `int` arrays start with zero values)
3. Accessing an element: `numbers[0]`
4. Accessing all elements with a `for` loop
5. Modifying an element by assigning to its index
6. Finding the size using `numbers.length`

## Practice problems

| File | Problem | Approach | Time complexity |
| --- | --- | --- | --- |
| `TwoSum.java` | Two Sum | Check each distinct pair | O(n²) |
| `MaxProfit.java` | Best Time to Buy and Sell Stock | Track lowest earlier price and best profit | O(n) |
| `ContainsDuplicate.java` | Contains Duplicate | Compare each pair | O(n²) |
| `MergeSortedArrays.java` | Merge Two Sorted Arrays | Two pointers and a result array | O(n + m) |
| `RotateArray.java` | Rotate Array | Place each value at its rotated index | O(n) |

## Running the programs

Install a Java JDK and open a terminal in this folder. Compile all files:

```bash
javac *.java
```

Run each program individually:

```bash
java ArrayFundamentals
java TwoSum
java MaxProfit
java ContainsDuplicate
java MergeSortedArrays
java RotateArray
```

Each class has a `main` method with the sample inputs from the assignment.

## Expected sample outputs

**Two Sum:** `[0, 1]`, `[1, 2]`  
**Max Profit:** `5`, `0`  
**Contains Duplicate:** `true`, `false`  
**Merge Sorted Arrays:** `[1, 2, 3, 4, 5, 6]`, `[1, 2, 3]`  
**Rotate Array:** `[5, 6, 7, 1, 2, 3, 4]`, `[2, 1]`

## Notes

- All positions (indices) in Java arrays start at zero.
- `TwoSum` returns indices, not the values themselves.
- `MaxProfit` returns zero when no profitable transaction exists.
- `RotateArray` creates a new array rather than changing the input array.
- These are standalone Java demonstrations; if submitting on LeetCode itself, adapt the method into its required `Solution` class.
