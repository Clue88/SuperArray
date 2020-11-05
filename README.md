# SuperArray

The repo contains the SuperArray class and associated tester.

## To Test

```
$ javac Tester.java
$ java Tester
```

Output should say "All good!"

## Constructor Summary

| Constructor | Description |
| - | - |
| `SuperArray()` | Initializes an empty SuperArray with size 0 and capacity 10. |
| `SuperArray(int initialCapacity)` | Initializes an empty SuperArray with size 0 and the given capacity. |

## Method Summary

| Output | Method | Description |
| - | - | - |
| `boolean` | `add(String element)` | Adds a new element to the end of the array and returns true. |
| `void` | `add(int index, String element)` | Inserts the element at the given index and shifts subsequent values right. |
| `void` | `clear()` | Clears the SuperArray and sets size to 0. |
| `boolean` | `contains(String s)` | Returns true if an element in the array is equal to the given string. |
| `SuperArray` | `Demo.findOverlap(SuperArray a, SuperArray b)` | Returns the intersection of a and b, in order with the first occurances in a. |
| `boolean` | `equals(SuperArray other)` | Returns true if every element in each array is equal. |
| `String` | `get(int index)` | Returns the element at the given index. |
| `int` | `indexOf(String s)` | Returns the index of the first occurence of the given element or -1 if the element is not contained. |
| `boolean` | `isEmpty()` | Returns true if the SuperArray has size 0. |
| `int` | `lastIndexOf(String value)` | Returns the index of the last occurence of the given element or -1 if the element is not contained. |
| `String` | `remove(int index)` | Removes the element at the given index and shifts subsequent values left. Returns removed element. |
| `void` | `Demo.removeDuplicates(SuperArray s)` | Removes duplicate elements and keeps the first copy of each element. |
| `int` | `size()` | Returns the current size of the SuperArray. |
| `String` | `set(int index, String element)` | Sets the given element at the given index and returns the replaced value. |
| `String[]` | `toArray()` | Returns a String[] array of the elements in the SuperArray. |
| `String` | `toString()` | Returns a string formatted version of the SuperArray in the form [e0, e1, e2, ..., eN]. |
| `SuperArray` | `Demo.zip(SuperArray a, SuperArray b)` | Merges a and b in the form [a0, b0, a1, b1, ...]. |
