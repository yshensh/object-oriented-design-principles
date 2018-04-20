The [open/closed principle](https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle) states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

## Example
In examples, it refers to the use of abstracted interfaces, where the implementation can be changed and multiple implementations could be created and ploymorphically substituted for each other.  This definition advocates inheritance from abstract base classes. Interface specifications can be reused through inheritance but implementation need not be. The existing interface is closed to modifications and new implementations must, at a minimum, implement that interface.

References:

[Abstract Methods and Classes](https://stackoverflow.com/questions/56860/what-is-an-example-of-the-liskov-substitution-principle)

[The Open/Closed Principle – A real world example](http://joelabrahamsson.com/the-openclosed-principle-a-real-world-example/)