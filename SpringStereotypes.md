##Stereotypes

* @Component
  * @Controller
    * @RestController
  * @Repository
  * @Service

Stereotypes are class level annotations which will automatically load when Spring does the component scan.

  Component scan will scan the hierarchy of the package below the starting package.

Check "Domain Driven Design" book by Evans 2003.


##Spring Bean Scope
  * Singleton - only one instance is created. One instance is used across multiple beans. This is the default scope, and 99% time this is used.
  * Prototype - when an object is needed, a new instance is created. 
  * Request
  * Session
    * Global-Session
    * Application
    * Websocket
  * Custom Scope  - available, but not used that much.

  * You can use @Scope Annotation for defining the scope.
