# Builder Pattern
The main purpose of this builder pattern is to avoid using complex construtors which has large number of parameters

Con's of Large Listed Parameters:
1. Large Listed Parameters are confusing and doesn't give much flexibility while creating a class

To create an object we need to pass all the values for the parameters. If we doesn't want to pass one way to do it 
is by having multiple constructors. This is called **telescoping constructor pattern**

- The problem with this technique is the class having a very large number of constructors. For ex: if we have 8 
  parameters we need 254 constructors fo various permutations and combinations of parameters to initialize the object.
- Code become too long and complex.
- The **Builder Pattern** is better alternative for this problem - it keeps all the flexibility of the telescoping 
  approach but without the complexity.

Builder Pattern
1. It moves the construction of complex objects out of the constructor
2. It also allows for different combination of fields with one single construction process
3. Improves scalability

In Builder Pattern there are several components including a director, a product and a builder
In the example 
- Director is the Architect Class. Dircetor is used for constructing objects using the builder.
- Product is the complex object that needs to be constructed
- Complex Object is the Bedroom Class.
- Builder is used for constructing the parts for the complex object.
- 

