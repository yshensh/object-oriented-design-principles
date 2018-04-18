The [Singleton pattern](https://en.wikipedia.org/wiki/Singleton_pattern) is a software design pattern that restricts the instantiation of a class to one object.

## Where to use it
When only one instance or a specific number of instances of a class are allowed.

## Implementation
An implementation of the singleton pattern must:
* ensure that only one instance of the singleton class ever exists; and
* provide global access to that instance.

Typically, this is done by:
* declaring all constructors of the class to be private; and
* providing a static method that returns a reference to the instance.

The instance is usually stored as a private static variable; the instance is created when the variable is initialized, at some point before the static method is first called.
The following is a sample implementation written in Java.

```
public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```

### Static Method
Define static methods in the following scenarios only:
* If you are writing utility classes and they are not supposed to be changed.
* If the method is not using any instance variable.
* If any operation is not dependent on instance creation.
* If there is some code that can easily be shared by all the instance methods, extract that code into a static method.
* If you are sure that the definition of the method will never be changed or overridden. As static methods can not be overridden.
