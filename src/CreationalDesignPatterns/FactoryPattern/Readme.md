# Factory Method Pattern
Factory Method is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
The Factory method deals with the problem of needing to create the objects but not knowing exactly what type of 
objects needs to be created.

- Used when a class doesn't know which object type needs to be created.
## Advantages of Factory Method Design Pattern
Below are the main advantages of factory method:

- Separates object creation from client code, enhancing flexibility and maintainability since changes to creation 
don’t affect clients.
- New product types can be easily added without altering client code by simply creating new Concrete Creator subclasses.
- Simplifies unit testing by allowing mock product creation, enabling tests of various implementations without actual 
  object dependencies.
- The factory method can be reused across different application parts, centralizing and streamlining object creation 
  logic.
- Hides specific product classes from clients, reducing dependencies and improving maintainability.

## Disadvantages of Factory Method Design Pattern
Below are the main advantages of factory method:

- Adds more classes and interfaces, which can complicate understanding and maintenance, especially for newcomers.
- Polymorphism and dynamic binding may slightly affect performance, though this is usually minimal.
- Concrete creators remain closely linked to their products, necessitating changes across both when one is modified.
- Client code must be aware of concrete subclasses to make accurate factory calls.
- The pattern should be applied carefully to avoid unnecessary complexity; simple object creation may not need a 
  factory.
- Testing the factory logic can be more complicated compared to simpler designs.
