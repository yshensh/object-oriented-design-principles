The [Dependency Inversion Principle](https://en.wikipedia.org/wiki/Dependency_inversion_principle) refers to a specific form of decoupling software modules.

The "inversion" concept does not mean that lower-level layers depend on higher-level layers.
Both layers should depend on abstractions that draw the behavior needed by higher-level layers.


## Intent
* High-level modules should not depend on low-level modules. Both should depend on abstractions.
* Abstractions should not depend on details. Details should depend on abstractions.

Abstract Classses and Interfaces change far less than classes that extend and implement them.
Abstract methods and interfaces define a contract that their derivatives must materialize.
That contract is not meant to change that often.