## Inheritance 

### Inheritance problems
- Problem 1. Breaks encapsulation. Check [strings example](src/main/java/strings)
- Problem 2. Adding a new method to parent class could break the child class
![inheritance problem 2](images/inheritance-problem-two.png)
- Problem 3. Multiple inheritance, you do not know which parent class to use.
Multiple inheritance is not allowed in Java


![Inheritance Problem 3](images/inheritance-problem-three.png)

- Problem 4: Liskov substitution principle. If one class has a reference to another class. If that class is in an heritance hieracy. I should be able to substitute with another class in that hieracy.

## Solution to all inheritance problems
- Favor composition over inheritance