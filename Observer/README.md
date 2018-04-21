The [Observer pattern](https://en.wikipedia.org/wiki/Observer_pattern) is a software design pattern in which an object, called the subject, maintains a list of its dependents, called observers, and notifies them automatically of any state changes, usually by calling one of their methods.

It is mainly used to implement distributed event handling systems, in "event driven" software.

The observer pattern is also a key part in the familiar model–view–controller (MVC) architectural pattern.

## Intent
The Observer pattern addresses the following problems:
 1. A one-to-many dependency between objects should be defined without making the objects tightly coupled
 2. It should be ensured that when one object changes state an open-ended number of dependent objects are updated automatically
 3. It should be possible that one object can notify an open-ended number of other objects

## Solution
 * Define Subject and Observer objects
 * so that when a subject changes state, all registered observers are notified and updated automatically.

The sole responsibility of a subject is to maintain a list of observers and to notify them of state changes by calling their update() operation.

The responsibility of observers is to register (and unregister) themselves on a subject (to get notified of state changes) and to update their state (synchronize their state with subject's state) when they are notified.

This makes subject and observers loosely coupled. Subject and observers have no explicit knowledge of each other. Observers can be added and removed independently at run-time.

This notification-registration interaction is also known as publish-subscribe.


