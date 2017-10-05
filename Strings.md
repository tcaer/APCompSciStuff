# Strings

Strings in `""` are recognized as literal constants or literal strings

If you use `+` or `+=` then you use concatenation
`"Catch" + 22;` -> `"Catch22"`

# Escape Sequences

`\n` -> newline
`\r` -> charriage return
`\t` -> tab
`\\` -> backslash
`\"` -> double quote
`\'` -> single quote

# String Class

- An object of the String class represents a string of characters
- String class is built into the `java.lang` package which is a default package of java
- String class has a constructor and its own specified methods
- The String class has two operators: `+` and `+=` - used for concatenation

## Literal Strings

- Objects in the String class that are defined as text in double quotes `(" ")`
- Can be asseinged to `String var`;
- Can be passed as parameters to methods & constructors - can be `"".method()`
- string text may include "escape" characters

## Immutability

- Once created, a string cannot be changed; none of its methods can change the String - such objects are known as immutable
- Advantage: more efficient, no need to copy

## Empty Strings

- An empty string has no charge; its length is 0
- `private String pratham` is `null`

## String Methods

- `int length()` - Returns number of characters in String
- `char charAt(k)` - Return a character at a position, k
- `"flower".length()` -> 6
- `"wind".charAt(2)` -> 'n'
- `String result = s1 + s2`
- `indexOf(Char)`
- `indexOf(String)`
- `indexOf(Char, int)`
- `indexOf(String, int)`

### Comparisons

- `boolean b = s1.equals(s2)` - returns true if the String s1 equals s2
- `boolean b = s1.equalsIgnoreCase(s2)` - returns true if the String s1 equals s2, case-blind
- `int diff = s1.compareTo(s2)`
- `int diff = s1.compareToIgnoreCase(s2)`
- `compareTo` - compares two strings lexicographically, based on the unicode value of each character in the String. Result is negative if the string object is smaller. Result is positive if the string object is bigger. Result if 0 if the String object is equals to the argument

### Replacements

- `String s2 = s1.trim();` - Returns a new string formed from s1 by removing whitespace from both ends
- `String s2 = s1.replace(oldCh, newCh);` - Returns a new string that replaces every instance of the old character with the new character
- `String s2 = s1.toUpperCase();` - Returns a new String that makes all characters upper case
- `String s2 = s1.toLowerCase();` - Returns a new String that makes all characters lower case

### Numbers to Strings

- `String s = "" +n;`
- `String s = Integer.toString(int);`
- `String s = Double.toString(double);`

````
import java.text.DecimalFormat;

DecimalFormat money = new DecimalFormat("0.00");

double amt = 56.7381
String s = money.format(amt); <- 56.74
````
 
## Substring

- `String s2 = s.substring(i, j)` - Return the substring of Chars in positions from i(inclusive) to j - 1(exclusive)
- `String s2 = s.substring(i)` - Return the substring of Chars from the i-th position to the end
- `"strawberry".substring(2, 5)` - "raw"
- `"unhappy".substring(2)` - "happy"
- `"emptiness".substring(9)` - Returns an empty string ""
- substring is an overloaded method

````
public static void main(String[] args) {
	String str1 = "String method tutorial";
	String str2 = "compareTo method example";
	String str3 = "String method tutorial";

	int var1 = str1.compareTo(str2); // is -16
	int var2 = str1.compareTo(str3); // is 0
	int var3 = str2.compareTo("compareTo method example"); // is 0
}
````

# Numbers from Strings

`int n = Integer.parseInt("-123");`
`double x = Double.parseDouble("123.45");`

- int => Integer
- double => Double
- char => Character

`NumberFormatException` => `Integer.parseInt("I went to the store 7 days ago");`

# Character

- `int d = Character.digit(ch, radix);` - Returns the int value of the digit ch in the given int radix
- `Char ch = Character.forDigit(d, radix);` - Returns a char that represents int d in a given int radix
- `Character.digit('7', 10);` - Returns 7
- `Character.digit('A', 16);` - Returns 10

## Character methods

- `java.lang.Character` <= the "wrapper" class that represents characters in objeccts
- `Character.isDigit(c);`
- `Character.isLetter(c);`
- `Character.isUpperCase(c);`
- `Character.isLowerCase(c);`
- `Character.isWhiteSpace(c);` - If the character is a space, tab, newline, etc.
- `Character.toUpperCase(c);`
- `Character.toLowerCase(c);`

# StringBuffer Class

- Represents a string of Characters as a mutable object
- Constructors:
`StringBuffer()` - empty string buffer of default capacity
`StringBuffer(n)` - empty string buffer of a given capacity
`StringBuffer(str)` - converts str into a string buffer

- Methods: `setCharAt`, `insert`, `append`, `delete`, `toString`

