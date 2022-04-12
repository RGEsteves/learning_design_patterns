# learning_design_patterns
https://www.tutorialspoint.com/design_pattern/index.htm

Design patterns are well-proven solutions for solving specific problems/tasks. Design patterns are programming language independent strategies for solving the common object-oriented design problems. That means, a design pattern represents an idea, not a particular implementation. 

## Factory Pattern (creational)
Factory pattern is one of the most used design patterns in Java. In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.

## Abstract Factory Pattern (creational)
Abstract Factory patterns work around a super-factory which creates other factories. This factory is also called as factory of factories. In Abstract Factory pattern an interface is responsible for creating a factory of related objects without explicitly specifying their classes. Each generated factory can give the objects as per the Factory pattern.

## Singleton Pattern (creational)
Singleton pattern is one of the simplest design patterns in Java. This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

## Builder Pattern (creational)
Builder pattern builds a complex object using simple objects and using a step by step approach. A Builder class builds the final object step by step. This builder is independent of other objects.
