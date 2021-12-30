# Maharishi University Question

### <a href="src/com/practice/BalancedArray.java">Balanced Array</a>
````
A balanced array is defined to be an array where for every value n in the array, -n also is in the
array. For example {-2, 3, 2, -3} is a balanced array. So is {-2, 2, 2, 2}. But {-5, 2, -2} is not
because 5 is not in the array.
Write a function named isBalanced that returns 1 if its array argument is a balanced array.
Otherwise it returns 0.
If you are programming in Java or C#, the function signature is
int isBalanced (int [ ] a);
If you are programming in C or C++, the function signature is
int isBalanced(int a[ ], int len) where len is the number of elements in the array.
````

### <a href="src/com/practice/TwinoidArray.java">Twinoid Array</a>
````
A twinoid is defined to be an array that has exactly two even values that are adjacent to one
another. For example {3, 3, 2, 6, 7} is a twinoid array because it has exactly two even values (2 and
6) and they are adjacent to one another. The following arrays are not twinoid arrays.
{3, 3, 2, 6, 6, 7} because it has three even values.
{3, 3, 2, 7, 6, 7} because the even values are not adjacent to one another
{3, 8, 5, 7, 3} because it has only one even value.
Write a function named isTwinoid that returns 1 if its array argument is a twinoid array. Otherwise
it returns 0.
If you are programming in Java or C#, the function signature is
int isTwinoid (int [ ] a);
If you are programming in C or C++, the function signature is
int isTwinoid(int a[ ], int len) where len is the number of elements in the array.
````
### <a href="src/com/practice/EvenSubset.java">Even Subset</a>
````
An integer is defined to be an even subset of another integer n if every even factor of m is also a
factor of n. For example 18 is an even subset of 12 because the even factors of 18 are 2 and 6 and
these are both factors of 12. But 18 is not an even subset of 32 because 6 is not a factor of 32.
Write a function with signature int isEvenSubset(int m, int n) that returns 1 if m is an even subset
of n, otherwise it returns 0.
````