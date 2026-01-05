## Java Operators

Operators in Java are special symbols used to perform operations on variables and values.
They are commonly used for calculations, comparisons, and logical decisions in a program.

Java operators are mainly grouped into:
- **Arithmetic operators** – perform mathematical operations like addition, subtraction, multiplication, division,
- and modulus.
- **Relational operators** – compare two values and return `true` or `false`.
- **Logical operators** – combine or invert boolean expressions.
- **Assignment operators** – assign values to variables.
- **Unary operators** – operate on a single operand, such as increment and decrement.
- **Ternary operator** – a shorthand conditional operator that works like an `if-else` statement.

Operators help control program logic and manipulate data efficiently.

## Unary and Binary Operators in Java

- **Unary Operators** work with only one operand. They are used to increment, decrement, or negate a value.  
  Examples include increment (`++`), decrement (`--`), and logical NOT (`!`).

- **Binary Operators** work with two operands. They are the most commonly used operators in Java and include arithmetic,
- relational, logical, and assignment operations such as addition (`+`), comparison (`==`), logical AND (`&&`), 
- and assignment (`=`).

Unary operators affect a single value, while binary operators operate on two values to produce a result.

## Primitive Type Casting in Java

Primitive type casting is the process of converting a value from one primitive data type to another.

There are two types of primitive casting in Java:

- **Widening Casting (Implicit)**  
  Converts a smaller data type into a larger one automatically.  
  Example: `int` → `double`

- **Narrowing Casting (Explicit)**  
  Converts a larger data type into a smaller one manually.  
  Example: `double` → `int`

Widening casting is safe and does not cause data loss, while narrowing casting may result in data loss and
requires explicit casting.

## Mixed Operations in Java

Mixed operations occur when different primitive data types are used together in an expression. 
In such cases, Java automatically promotes smaller data types to larger ones before performing the operation.

During mixed operations:
- `byte`, `short`, and `char` are promoted to `int`
- If one operand is `long`, the result is `long`
- If one operand is `float`, the result is `float`
- If one operand is `double`, the result is `double`

This automatic type promotion helps prevent data loss and ensures consistent results during calculations.

### Types of Operators in detail


## Assignment Operator in Java

The assignment operator (`=`) is used to assign a value to a variable. It stores the value on the right-hand side 
into the variable on the left-hand side.

The assignment operator is commonly used during variable declaration and when updating variable values throughout 
a program.

Assignment in Java works from right to left and requires both sides to be of compatible data types.

## Shorthand Assignment Operators in Java

Shorthand assignment operators combine an arithmetic operation with assignment, making code shorter and more readable.

Examples:

- `+=` adds a value and assigns the result
  ```java
  int x = 5;
  x += 3;   // x = 8

## Java Operators - Interview Questions

1. What are operators in Java and why are they used?
2. What is the difference between unary and binary operators?
3. What are arithmetic operators and how are they used?
4. What are relational operators and what do they return?
5. What are logical operators and how do they work?
6. What is the assignment operator (`=`) and how does it work?
7. What are shorthand (compound) assignment operators?
8. What are bitwise operators and when are they used?
9. What are shift operators and how do they work?
10. What happens during mixed operations between different data types?
11. What is operator precedence and why is it important?
12. What is the difference between `==` and `=` in Java?  

  


