## Loops in Java

Loops in Java are control flow statements that allow a block of code to be executed repeatedly based on a condition.
They help reduce code duplication, improve readability, and make programs more efficient
when performing repetitive tasks.

Loops are widely used for iterating over data, performing calculations, validating input, and 
automating repetitive logic. Understanding loops is essential for problem-solving, algorithm design,
and technical interviews.

A loop generally consists of:
- An initialization step
- A condition that controls execution
- A block of code to execute repeatedly
- An update that changes the loop state

If the condition evaluates to `true`, the loop continues running. If it becomes `false`, the loop terminates.

### Why Loops Are Important
- Enable efficient repetition of logic
- Reduce code redundancy
- Improve maintainability
- Essential for working with arrays, collections, and algorithms

### Types of Loops in Java

Java provides several types of loops, each designed for different use cases:

- **for loop** – Used when the number of iterations is known in advance.
- **while loop** – Used when the number of iterations depends on a condition evaluated before each iteration.
- **do-while loop** – Similar to `while`, but guarantees at least one execution.
- **Enhanced for loop (for-each)** – Used for iterating over arrays and collections without using an index.

Each loop type serves a specific purpose, and choosing the correct one improves code clarity and efficiency.

## for Loop in Java

The `for` loop is a control flow statement used to execute a block of code repeatedly when the number of iterations
is known in advance. It is commonly used for counting, iterating over ranges, and working with array indices.

A `for` loop consists of three main parts:
- **Initialization** – executed once before the loop starts and used to declare and initialize the loop control variable.
- **Condition** – evaluated before each iteration; if it is `true`, the loop continues, otherwise it terminates.
- **Update** – executed after each iteration to modify the loop control variable.

The `for` loop checks the condition before executing the loop body, meaning it may execute zero or more times.

### Common Use Cases
- Iterating over a fixed range of numbers
- Traversing arrays using index values
- Repeating logic a known number of times
- Implementing counting and accumulation logic

### Key Characteristics
- Best suited for counter-controlled loops
- All loop control logic is defined in one line
- Reduces the risk of infinite loops when used correctly
- Frequently used in algorithms and interview problems

Understanding the `for` loop is essential for solving coding challenges and writing efficient, readable Java code.

The **while loop** is a pre-test loop, meaning the condition is checked **before executing** the loop body. 
It may execute **zero or more times**, depending on whether the condition is initially true. 
The syntax is: `while (condition) { // code to execute }`. 
For example, `int i = 1; while (i <= 5) { System.out.println(i); i++; }`
will print numbers from 1 to 5.
Key points: condition checked before execution, may execute zero times, used when the number of iterations is unknown, 
and common for input validation or dynamic iteration.

The **do-while loop** is a post-test loop, meaning the loop body executes **first**, 
and then the condition is checked. It **always executes at least once**, even if the condition is initially false. 
Syntax: `do { // code } while(condition);`.
For example, `int i = 1; do { System.out.println(i); i++; } while(i <= 5);` 
also prints numbers 1 to 5.
Key points: condition checked after execution, executes at least once, useful for menu-driven programs 
or mandatory first execution, ensures code runs before checking a condition.

The main **differences** between while and do-while are: 
the while loop checks the condition before executing and may execute zero times, 
whereas the do-while loop checks the condition after executing and always executes at least once. 
While loops are used when the number of iterations is unknown, and do-while loops are used when at least one execution 
is required. 
Syntax differs slightly: `while(condition) { ... }` vs `do { ... } while(condition);`.

## Key Takeaways
Loops provide a way to automate repetitive tasks and
perform iterative operations.
Most of the time loops can be used interchangeably.
Branching Statements are powerful tools for manipulating
the execution flow and implementing specific logic.
