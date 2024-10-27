<!-- ![riser_lang](https://github.com/user-attachments/assets/85e9b1b6-c763-4160-a530-299843639079) -->
![status: 200](https://img.shields.io/badge/status-active-green)
![status: 200](https://img.shields.io/badge/environment-windows-blue)

![2](https://github.com/user-attachments/assets/c44d0653-44e4-4e2f-ae97-76e3a21bd835)

## 🟠 **Language Overview**

**riser_** is a dynamically-typed programming language that supports basic programming constructs like variables, control structures, functions, and operators.

### 🟡 **Language Features**

- **Dynamically Typed**: Types are determined at runtime, no need for type declarations.
- **Primitive Data Types**:
  - `int` - Integer values (e.g., `1`, `-42`)
  - `float` - Floating-point numbers (e.g., `3.14`, `-0.5`)
  - `string` - Sequence of characters (e.g., `"Hello, World"`)
  - `bool` - Boolean values (`true`, `false`)
- **Variables**: 
  - Variables are declared using the `let` keyword. Example:
    ```plaintext
    let x = 10;
    let name = "India";
    ```

- **Operators**:
  - Arithmetic: `+`, `-`, `*`, `/`, `%`
  - Comparison: `==`, `!=`, `<`, `>`, `<=`, `>=`
  - Logical: `&&` (and), `||` (or), `!` (not)

- **Control Structures**:
  - Conditional statements:
    ```plaintext
    if (x > 10) {
        print("Greater than 10");
    } else {
        print("Less than or equal to 10");
    }
    ```
  - Loops (`while`, `for`):
    ```plaintext
    let i = 0;
    while (i < 5) {
        print(i);
        i = i + 1;
    }
    
    for (let i = 0; i < 5; i = i + 1) {
        print(i);
    }
    ```

- **Functions**:
  - Define and call functions:
    ```plaintext
    func greet(name) {
        print("Hello, " + name);
    }

    greet("World");
    ```
  - Return values from functions:
    ```plaintext
    func add(a, b) {
        return a + b;
    }

    let result = add(5, 10);
    ```

- **Built-in Functions**:
  - `print()` - Outputs text to the console.
  - `input()` - Reads user input (optional for your implementation).

- **Comments**:
  - Single-line comments using `//`:
    ```plaintext
    // This is a comment
    ```

- **Error Handling**:
  - Basic error detection for common issues like division by zero.

## 🟠 **Example Program in riser_**

```plaintext
// comment

func add(a, b) {
    return a + b;
}

let x = 5;
let y = 10;
let result = add(x, y);

if (result > 10) {
    print("Result is greater than 10");
} else {
    print("Result is 10 or less");
}
```
- Save the file **name.rr**
- Run **make** if the **.class** files are not present (one time).
- Run **java Riser name.rr**


> Note: This implementation does not purely follow standard compiler/interpreter design principles and the theoretical aspects of formal languages and automata.
