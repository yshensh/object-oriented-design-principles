The [Interface Segregation Principle](https://en.wikipedia.org/wiki/Interface_segregation_principle) states that no clients should be forced to depend on methods they do not use.

## Intent
This often becomes a problem when clients have dependencies on "fat" classes ( which refers to classes have too many responsibilities).
Having an interface to separate behaviors is good idea. It prevents tight coupling between objects.