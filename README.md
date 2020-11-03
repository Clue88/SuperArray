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
| `SuperArray()` | Initializes an empty SuperArray with size 0. |

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
