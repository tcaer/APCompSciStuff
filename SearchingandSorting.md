 - Learn 3 ways to compare objects in Java
 - Learn the following algorithms
 1) Sequential and Binary Search
 2) Selection Sort and Insertion Sort
 3) Mergesort and Quicksort

## Comparing Objects in Java
- `boolean result = obj1.equals(obj2);`
	- Boolean method from the OBject class
	- Object's `equals()` is not useful - only compares the addresses (memory location) of objects
		- Normally we override with another class
	- Equals is called polymorphically from library methods, such as:
		- ArrayList's contains()/indexOf()
	- Properly defined in:
		- String, Integer, Double, etc.
- `int diff = obj1.compareTo(obj2);`
	- compareTo is an abstract method created in the `java.util.Comparable<T>` interface
		- `public int compareTo(Type other) {}`
	- Returns a positive int if obj1 is greater than obj2
	- Returns a negative int if obj1 is less than obj2
	- Returns 0 if obj1 and obj2 are equal
- `int diff = c.compare(obj1, obj2);` <= not on AP

## Binary Search
#### Recursive Implementation
````
public int binarySearch(int[] arr, int value, int left, int right) {
	if (right < left) {
		return -1;
	}

	int middle = (left + right) / 2;

	if (value == arr[middle]) {
		return middle;
	} else if (value < arr[middle]) {
		return binarySearch(arr, value, left, middle - 1);
	} else {
		return binarySearch(arr, value, middle + 1, right);
	}
}
````

#### Iterative implementation
````
public int binarySearch(int[] arr, int value, int left, int right) {
	while (left <= right) {
		int middle = (left + right) / 2;

		if (value == arr[middle]) {
			return middle;
		} else if (value < arr[middle]) {
			right = middle - 1;
		} else {
			left = middle + 1;
		}
	}
}
````

### Sorting
- To sort means to rearrange the elements of a list in ascending or descending order
- Examples of sorting applications
	- A directory of files sorted by name or date
	- Bank checks sorted by account #
	- Addresses in a mailing list sorted yb zip code
- How fact can we sort an array of n elements
	- If we compare each element to each other we need `n(n - 1) / 2` comparisons (that is, `n^2` by the order of magnitude)
	- Faster "divide and conquer" need approximately `n*log2n` comparisons

### Selection Sort
- Select the max value amongst the first n elements
- Swap it with the n-th element
- Decrement n by 1 and repeat from step 1 (while n > 1)
- Iterative implementation
````
public void selectionSort(double[] arr, int n) {
	while (n > 1) {
		int maxPos = 0;

		for (int k = 1; i < n; k++) {
			if (arr[k] > arr[maxPos]) {
				maxPos = k;
			}
		}

		double temp = arr[maxPos];
		arr[maxPos] = arr[n - 1];

		n--;
	}
}
````
- The total number of comparisons `(n - 1) + (n - 2) + 1 = n(n - 1) / 2`

### Insertion Sort
- `k = 1;` keep the first k elements in order
- Take the (k + 1)-th element and insert among the first k in the right place
- Increment k by 1; repeat from step 2 (while k < n)
- Iterative Implementation
````
public void insertionSort(double[] arr, int n) {
	for (int k = 1; k < n; k++) {
		double temp = arr[k];

		int i = k;

		while (i > 0 && arr[i - 1] > temp) {
			arr[i] = arr[i - 1];
			i--;
		}

		arr[i] = temp;
	}
}
````
- The total number of comparis is have that of selection sort
	- The best case is when the array is already sorted => `(n - 1)` comparison
	- The worst case is `n(n - 1) / 2` when the array is sorted in reverse
	- On average, an `O(n^2)` algorithm