# Recursion

## Properties of Algorithms
- Compactness => an algorithm can use iterations or recursion to repeat the same steps multiple times

- Generality => the same algorithm applies to any "size" or task or any input values

- Abstractness => an algorithm does not depend on a particular computer language or platform

## Recursive Methods
- A recursive solution describes a procedure for a particular task in terms of applying the asme procedure to similar, but smalle rtasks
- You must have a case => cases that do not need recursion

`1^2 + 2^2 + ... + n^2`
if n is simply 1 : then return 1 (base case)
if n > 1; calculate the sum of 1^2 + 2^2 + (n-1)^2, then add n^2

````
public static int addSquares(int n) {
	if (n == 1) {
		return n;
	} else {
		return addSquares(n-1) + n*n;
	}
}
````