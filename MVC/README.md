The [Model–view–controller pattern](https://en.wikipedia.org/wiki/Model%E2%80%93view%E2%80%93controller)  is an architectural pattern commonly used for developing user interfaces that divides an application into three interconnected parts.

* Model - Model represents an object or JAVA POJO carrying data. It can also have logic to update controller if its data changes.
* View - View represents the visualization of the data that model contains.
* Controller - Controller acts on both model and view. It controls the data flow into model object and updates the view whenever data changes. It keeps view and model separate.
