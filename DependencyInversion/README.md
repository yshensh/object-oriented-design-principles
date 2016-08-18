#Dependency Inversion Principle
Dependency Inversion principle states that "highlevel modules should not depend on lowlevel modules. both should be depending upon abstractions".
Abstractions should not depend on details. Details should depend upon abstractions.
Abstract Classses and Interfaces change far less than classes that extend and implement them. Abstract methods and interfaces define a contract that their derivatives must materialize. That contract is not meant to change that often.