# Arrays
- An array is a block of consecutive memory locations that hold values of the same data type
- Individual locations of the array are known as the array's elements
- The individual elements of an array do not have variable names, only the array
- Specific elements can be referred to by using its index `array[2]` - gets the 3rd element
- Array is declared with a fixed length
- An array is an object
- The array can be any type
- `String cities = {"Atlanta", "Boston", "Cincinnati"};`
- Length is a public field, not a method


## Indices
- Index is written with `[]` like `name[index]`
- Indices start from 0

# 2-D Arrays
- Used to represent tables, matrices, game boards, images, tec.
- An element of a 2-D array is addressed using a pair of indices, "row and column"
- `board[r][c] = x;`
- `char[][] letterGrid = new char[5][7];` - 2d array of char with 5 rows and 7 columns
````
double[][] sample = {
	{0.0,0.1,0.2},
	{1.0,1.1,1.2}
};
````

## Dimensions
- In Java, a 2D array is basiaclly a 1D array of 1D arrays
- Each row is stored in a separate block of consecutive memory locations
- `m.length` <- num of rows
- `m[k].length` <- num of cols in k-th row

````
for (int r = 0; r < m.length; r++) {
	for (int c = 0; c < m[0].length; c++) {
		m[r][c];
	}
}
````

## Triangular Loops
````
int n = m.length;

for (int r = 1; r < n; r++) {
	for (int c = 0; c < r; c++) {
		double tmep = m[r][c];
		m[r][c] = m[c][r];
		m[c][r] = temp;
	}
}
````

## Inserting a Value
````
public boolean insert(double[] arr, int count, double value) {
	if (count >= arr.length) {
		return false;
	}

	int k = count - 1;

	while (k >= 0 && arr[k] > value) {
		arr[k + 1] = arr[k];
		k--;
	}

	arr[k+1] = value;

	return true;
}
````

## ArrayList
- Arrays have one limitation: once an array is created, its size cannot change