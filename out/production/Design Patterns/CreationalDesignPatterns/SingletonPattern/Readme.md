# Singleton Pattern
The Singleton method or Singleton Design pattern is one of the simplest design patterns. It ensures a class only has one instance, and provides a global point of access to it.
- Limit instantiation of a class to one
- It is a well known and important pattern to understand
- Avoid overusing the singleton pattern

Usage:
1. Database Connectors
2. Logging a class
2. File Managers
3. Window managers
4. UI dialogs
5. Resource allocators and spoolers


## Initialization Types of Singleton
Singleton class can be instantiated by two methods:

**Early initialization** : In this method, class is initialized whether it is to be used or not. The main advantage of 
this method is its simplicity. You initiate the class at the time of class loading. Its drawback is that class is always initialized whether it is being used or not.

**Lazy initialization** : In this method, class in initialized only when it is required. It can save you from 
instantiating the class when you don’t need it. Generally, lazy initialization is used when we create a singleton class.

## Use Cases for the Singleton Design Pattern
Below are some common situations where the Singleton Design Pattern is useful:

- In applications where creating and managing database connections is resource-heavy, using a Singleton ensures that 
 there’s just one connection maintained throughout the application.
- When global settings need to be accessed by different parts of the application, a Singleton configuration manager 
  provides a single point of access for these settings.
- Singleton helps to centralize control and making it easier to manage the state and actions of user interface 
  components.
- Singleton can effectively organize print jobs and streamlines the process in the systems where document printing is 
  required.

## Advantages of the Singleton Design Pattern
Below are the advantages of using the Singleton Design Pattern:

- The Singleton pattern guarantees that there’s only one instance with a unique identifier, which helps prevent 
naming issues.
- This pattern supports both eager initialization (creating the instance when the class is loaded) and lazy 
  initialization (creating it when it’s first needed), providing adaptability based on the use case.
- When implemented correctly, a Singleton can be thread-safe, ensuring that multiple threads don’t accidentally 
  create duplicate instances.
- By keeping just one instance, the Singleton pattern can help lower memory usage in applications where resources are 
  limited.

## Disadvantages of the Singleton Design Pattern
Here are some drawbacks of using the Singleton Design Pattern:

- Singletons can make unit testing difficult since they introduce a global state. This can complicate testing 
components that depend on a Singleton, as its state can influence the test results.
- In multi-threaded environments, the process of creating and initializing a Singleton can lead to race conditions if 
  multiple threads try to create it simultaneously.
- If you later find that you need multiple instances or want to modify how instances are created, it can require 
  significant code changes.
- The Singleton pattern creates a global dependency, which can complicate replacing the Singleton with a different 
  implementation or using dependency injection.
- Subclassing a Singleton can be tricky since the constructor is usually private. This requires careful handling and 
  may not fit standard inheritance practices.
