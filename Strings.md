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
- 

## Substring

- `String s2 = s.substring(i, j)` - Return the substring of Chars in positions from i(inclusive) to j - 1(exclusive)
- `String s2 = s.substring(i)` - Return the substring of Chars from the i-th position to the end
- `"strawberry".substring(2, 5)` - "raw"
- `"unhappy".substring(2)` - "happy"
- `"emptiness".substring(9)` - Returns an empty string ""
- substring is an overloaded method
