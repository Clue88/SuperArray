# SuperArray

The repo contains the SuperArray class and associated tester.

## To Test

```
$ javac Tester.java
$ java Tester
```

Output should say "All good!"

## Constructor Summary
* `SuperArray()` – initializes an empty SuperArray with size 0.

## Method Summary
* `int size()` – returns the current size of the SuperArray.
* `boolean add(String element)` – adds a new element to the end of the array and returns true.
* `String get(int index)` – returns the element at the given index.
* `String set(int index, String element)` – sets the given element at the given index and returns the replaced value.
* `boolean isEmpty()` – returns true if the SuperArray has size 0.
* `void clear()` – clears the SuperArray and sets size to 0.
* `String toString()` – returns a string formatted version of the SuperArray in the form [e0, e1, e2, ..., eN].
* `boolean contains(String s)` – returns true if an element in the array is equal to the given string.
