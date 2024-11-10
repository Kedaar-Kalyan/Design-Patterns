# Prototype Pattern

- Prototype is a creational design pattern that lets you copy existing objects without making your code dependent on 
their classes.
- It is useful when making new Objects memory intensive. It will make the application run faster and make the code 
  shorter and cleaner.
- Cloned Objects can be modified
- It is useful when class are loaded dynamically.
- Cloming saves memory
 

## Advantages
- We can clone objects without coupling to their concrete classes.
- We can get rid of repeated initialization code in favor of cloning pre-built prototypes.
- We can produce complex objects more conveniently.
- We get an alternative to inheritance when dealing with configuration presets for complex objects.

## Disadvantages
- Cloning complex objects that have circular references might be very tricky.
  
## When to use the Prototype Design Pattern
Below is when to use prototype design pattern:

- Use the Prototype pattern when creating new objects is more complex or costly than copying existing ones. Cloning 
can be more efficient if significant resources are needed.
- The Prototype pattern is helpful for managing various objects with minor differences. Instead of creating multiple 
  classes, you can clone and modify prototypes.
- Consider the Prototype pattern for dynamic configurations where you need to create objects at runtime. You can 
  clone a base configuration and adjust it as necessary.
- The Prototype pattern can lower initialization costs, as cloning is often faster than building a new object from 
  scratch, especially if initialization is resource-intensive.

## When not to use the Prototype Design Pattern
Below is when not to use Prototype design pattern:

- Avoid using the Prototype pattern when your application predominantly deals with unique object instances, and the 
overhead of implementing the pattern outweighs its benefits.
- If object creation is simple and does not involve significant resource consumption, and there are no variations of 
  objects, using the Prototype pattern might be unnecessary complexity.
- If objects are immutable (unchangeable) and do not need variations, the benefits of cloning may not be 
  significant.
- If system has a clear and straightforward object creation process that is easy to understand and manage, 
  introducing the Prototype pattern may add unnecessary complexity.