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
