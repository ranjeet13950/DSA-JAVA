# DSA-JAVA

A comprehensive collection of Java implementations for common Data Structures and Algorithms (DSA). This repository is designed for learning, practice, and interview preparation.

## Table of Contents

- [Description](#description)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Project Structure](#project-structure)
- [Data Structures](#data-structures)
- [Algorithms](#algorithms)
- [Contributing](#contributing)
- [License](#license)
- [Author](#author)

## Description

This repository contains Java implementations of a wide range of data structures (e.g., arrays, linked lists, stacks, queues, trees, graphs) and algorithms (e.g., sorting, searching, recursion, backtracking). Each implementation is organized into packages under `src/` and can be run independently for testing and demonstration purposes.

## Prerequisites

- Java Development Kit (JDK) 21.0.4  or higher
- Git (for cloning the repository)
- IntelliJ IDEA or any other Java IDE (optional but recommended)

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/ranjeet13950/DSA-JAVA.git
   ```
2. Change into the project directory:
   ```bash
   cd DSA-JAVA
   ```
3. (Optional) Open the project in IntelliJ IDEA:
   - File > Open... > Select the cloned folder

## Usage

### Running via IDE

- Navigate to the `src/` directory in the Project view.
- Expand the package containing the class you want to run.
- Right-click the `main` method or class and select **Run**.

### Running via Command Line

1. Compile the Java files:
   ```bash
   javac -d out src/**/*.java
   ```
2. Run a specific class (e.g., `BinarySearch`):
   ```bash
   java -cp out Arrays.Binary_search
   ```

## Project Structure

```
DSA-JAVA/
├── src/
│   ├── Arrays/
│   ├── ArrayList/
│   ├── Backtracking/
│   ├── Linked_List/
│   ├── Recursion/
│   ├── Sorting/
│   └── ...
├── out/           # Compiled classes (ignored in Git)
└── README.md      # This file
```

## Data Structures

Implemented data structures:

- Arrays (dynamic operations, two-dimensional arrays)
- ArrayList (basic operations, practice questions)
- Linked List (singly, doubly, cycle detection)
- Stack (array-based, linked-list-based)
- Queue (circular queue, priority queue)
- Trees (binary tree, binary search tree)
- Graphs (adjacency list, traversal)

## Algorithms

Implemented algorithms:

- **Sorting**: Bubble Sort, Insertion Sort, Selection Sort, Merge Sort, Quick Sort
- **Searching**: Linear Search, Binary Search
- **Recursion**: Factorial, Fibonacci, Sum of Natural Numbers
- **Backtracking**: Permutations, Subsets
- **Other**: Kadane's Algorithm, Two-pointer techniques

## Contributing

Contributions are welcome! To contribute:

1. Fork the repository
2. Create a new branch: `git checkout -b feature/YourFeatureName`
3. Make your changes and commit: `git commit -m "Add feature ..."`
4. Push to the branch: `git push origin feature/YourFeatureName`
5. Open a Pull Request

Please follow the existing code style and include appropriate tests/examples.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

## Author

- **Ranjeet Kumar** - [GitHub Profile](https://github.com/ranjeet13950)

