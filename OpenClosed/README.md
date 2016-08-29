# Open-Closed Principle
The open/closed principle states "software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification"; that is, such an entity can allow its behaviour to be extended without modifying its source code.

In this example, it refers to the use of abstracted interfaces, where the implementation can be changed and multiple implementations could be created and ploymorphically substitued for each other.  This definition advocates inheritance from abstract base classes. Interface specifications can be reused through inheritance but implementation need not be. The existing interface is closed to modifications and new implementations must, at a minimum, implement that interface.

