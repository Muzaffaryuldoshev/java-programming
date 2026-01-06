## Selection Statements in Java

Selection statements in Java are used to control the execution flow of a program based on conditions.
They allow the program to make decisions and execute different blocks of code depending on whether
a condition evaluates to `true` or `false`.

Instead of executing code line by line, selection statements help introduce logic and branching
into a program. This makes applications more flexible, dynamic, and responsive to different inputs
and situations.

Java selection statements are commonly used for:
- Decision making
- Validating conditions
- Controlling program behavior
- Handling multiple possible outcomes

Selection statements form a core part of Java fundamentals and are widely tested in interviews,
especially for understanding program flow and logical reasoning.


## if Statements in Java

The `if` statement is a selection statement used to control program flow by executing code based on
conditions. Java provides several forms of `if` statements to handle different decision-making
scenarios.

---

### 1. Single `if` Statement

A single `if` statement executes a block of code only when the specified condition evaluates to
`true`. If the condition is `false`, the block is skipped.

The condition must be a boolean expression. Non-boolean values are not allowed in Java conditions.

Single `if` statements are commonly used for simple validations and checks.

---


### 3. `if-else` Statement

The `if-else` statement provides two execution paths. If the condition evaluates to `true`, the `if`
block is executed. Otherwise, the `else` block is executed.

This structure ensures that exactly one of the two code blocks is executed.

`if-else` statements are useful when handling mutually exclusive conditions.

---

### 4. `if-else-if` Ladder

The `if-else-if` ladder is used when multiple conditions need to be checked. Conditions are evaluated
from top to bottom.

The first condition that evaluates to `true` is executed, and the remaining conditions are skipped.
If none of the conditions are `true`, the optional `else` block is executed.

This structure is commonly used when handling multiple possible outcomes based on a single or
multiple variables.

---

## Nested if Statement in Java

A **nested if statement** is an `if` statement placed **inside another if statement**.  
It allows more complex decision-making when one condition depends on another.

### How it works
1. The **outer `if`** condition is evaluated first.
2. If the outer condition is `true`, the **inner `if`** condition is evaluated.
3. If the outer condition is `false`, the inner `if` is **skipped entirely**.

Nested `if` statements are useful when:
- Decisions are dependent on multiple conditions
- You want to check a condition only if a previous condition is true
- You need **fine-grained control** over program flow

### Syntax

if (condition1) {
    // outer if block
    if (condition2) {
        // inner if block
    }
}

---

`if` statements form the foundation of decision-making logic in Java and are frequently tested in
technical interviews.

if statements make decisions based on a boolean expression.

Based on the true or false evaluation of the expression, these
statements take one of the two possible courses.

Multi-branch “if” (“if - else if - else”) allows us to perform different actions
based on multiple conditions.

Use nested if statements with caution. It might decrease readability.

Cover all possible conditions in conditional statements.

Debugging is essential to ensure that a program runs as intended.

## switch Statement in Java

The `switch` statement is a selection control statement that allows a variable to be tested for
equality against a list of values, called **cases**. Each case executes a block of code if it
matches the value of the variable.

The `switch` statement is often used as an alternative to multiple `if-else-if` statements, especially
when comparing a single variable against multiple constant values.

---

### Syntax

switch (variable) {
    case value1:
        // code block for value1
        break;
    case value2:
        // code block for value2
        break;
    ...
    default:
        // code block if no case matches
}

---
### Key Takeaways
The switch-expression must be a value of byte, short, int, char, or String
type and must always be enclosed in parentheses.

The case values must have the same data type as the value of the
switch-expression.

After the first match, the statements are executed until either a break
statement or the end.

--- 
## Interview Questions

What is a selection statement in Java?

What is the difference between a single if and an if-else statement?

How does an if-else-if ladder work?

Can an if-else-if ladder work without a final else?

What is a nested if statement? When is it useful?

What types of variables can be used in a switch statement?

What happens if you forget the break statement in a switch?

How do you check if a number is a multiple of another number in Java?

How can you calculate the average of three numbers in Java?

How can you validate that a number is within a specific range before performing calculations?

In the FINRA problem, which condition should be checked first: multiple of 3, multiple of 5, or multiple of both 3 and 5? Why?

What is the role of the modulus operator % in selection statements?