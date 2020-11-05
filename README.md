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
| `int` | `size()` | Returns the current size of the SuperArray. |
| `boolean` | `add(String element)` | Adds a new element to the end of the array and returns true. |
| `String` | `get(int index)` | Returns the element at the given index. |
| `String` | `set(int index, String element)` | Sets the given element at the given index and returns the replaced value. |
| `boolean` | `isEmpty()` | Returns true if the SuperArray has size 0. |
| `void` | `clear()` | Clears the SuperArray and sets size to 0. |
| `String` | `toString()` | Returns a string formatted version of the SuperArray in the form [e0, e1, e2, ..., eN]. |
| `boolean` | `contains(String s)` | Returns true if an element in the array is equal to the given string. |
| `void` | `add(int index, String element)` | Inserts the element at the given index and shifts subsequent values right. |
| `String` | `remove(int index)` | Removes the element at the given index and shifts subsequent values left. Returns removed element. |
| `int` | `indexOf(String s)` | Returns the index of the first occurence of the given element or -1 if the element is not contained. |
| `String[]` | `toArray()` | Returns a String[] array of the elements in the SuperArray.
| `void` | `Demo.removeDuplicates(SuperArray s)` | Removes duplicate elements and keeps the first copy of each element. |
| `SuperArray` | `Demo.findOverlap(SuperArray a, SuperArray b)` | Returns the intersection of a and b, in order with the first occurances in a. |
| `int` | `lastIndexOf(String value)` | Returns the index of the last occurence of the given element or -1 if the element is not contained. |
| `boolean` | `equals(SuperArray other)` | Returns true if every element in each array is equal. |
