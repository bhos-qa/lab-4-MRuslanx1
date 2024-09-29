 
# Coverage Research

## Statement Coverage
- Definition: Statement coverage refers to executing individual program statements and observing the outcome. 100% statement coverage is achieved when all statements in the code have been executed at least once.
- Learning Output:
  - It is the simplest form of code coverage and ensures that every line of code runs at least once during testing.
  - While it can help find certain bugs, statement coverage does not guarantee that all conditions within the code are tested.
  - Achieving 100% statement coverage is often necessary but not sufficient for robust testing, as it doesn't address logical paths in conditional statements.

## Branch Coverage
- Definition: Branch coverage measures whether both the true and false branches of decision points (e.g., `if` statements) in the code are executed. Full branch coverage means that every branch of the decision points has been tested.
- Learning Output:
  - Branch coverage is more thorough than statement coverage because it ensures that both outcomes of each decision (true/false) are tested.
  - It can uncover issues that statement coverage misses, especially in complex decision-making logic.
  - Achieving 100% branch coverage requires carefully designed test cases that consider all decision outcomes.

## Predicate Coverage
- Definition: Predicate coverage ensures that all possible combinations of true and false outcomes for conditions affecting a selected path have been explored.
- Learning Output:
  - This type of coverage is more detailed than branch coverage, as it explores the internal logic of compound conditions (e.g., `&&` or `||` operators).
  - Predicate coverage tests for logical correctness in complex conditions, which is critical in ensuring the robustness of decision-making processes.
  - Achieving full predicate coverage requires designing test cases that consider all possible combinations of conditions, which can be complex but offers higher confidence in the code’s reliability.
