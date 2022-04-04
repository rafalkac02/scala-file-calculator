# Calculator Again
Create a command-line application that reads a file with a series of math operations (one on each line) and gives the total at the end.

The following operations are supported:

1. `+` (sum)
2. `-` (subtract)
3. `*` (multiply)
4. `/` (divide)
5. `-` (negation) (WARNING: The same symbol with subtraction)

The application should suppport PRINT operation that prints out the current total to the standard output (stdout) when it appears in a operation file. There can be zero, one or many PRINT commands.

Operation file should support comments (as lines starting with # or //).

A sample operation file:
```
# + 4 5
- 8
+ 5
-
PRINT
- 7
PRINT
PRINT
/ 2
```