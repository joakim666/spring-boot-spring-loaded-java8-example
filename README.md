# Spring-boot Spring-loaded java 8 example

This super simple example application shows how to use [spring-boot](http://projects.spring.io/spring-boot/) together
with [spring-loaded](https://github.com/spring-projects/spring-loaded), [spring-security](http://projects.spring.io/spring-security/),
Maven and Java 8 to develop standalone application with hot-reloading of changes done to classes and resource files during development.

This makes it as easy and fast to develop in plain java as with [grails](https://grails.org) or
[Ruby on Rails](http://rubyonrails.org).

## Quickstart

1. Clone this git repo
1. Open two terminal windows and change to the cloned directory
1. In terminal window 1 run: `mvn spring-boot:run`
1. Open **http://localhost:8080/greeting** in a browser window. Login with user/password
1. Make changes in the **GreetingController** class and/or the **greeting.html** template file
1. In terminal window 2 run: `mvn compile`
1. Reload the web page in the browser to see the changes

Instead of manually running mvn compile you can make the compilation from within your favorite IDE as long as:

1. The version of the java compiler is the same
1. The IDE puts the compiled classes in the **target/classes** directory

You can even enable auto-compilation if your IDE supports that, for totally seamless development.


## Technologies

* [Java 8](http://java.oracle.com)
* [Maven](http://maven.apache.org)
* [spring-boot](http://projects.spring.io/spring-boot/)
* [spring-loaded](https://github.com/spring-projects/spring-loaded)
* [spring-security](http://projects.spring.io/spring-security/)
    * Showing how to use @AuthenticationPrincipal to get the details for the currently logged in user
* [Thymeleaf](http://www.thymeleaf.org)
* [Thymeleaf Custom Layout - Template layouts in Spring MVC application with no extensions](https://github.com/kolorobot/thymeleaf-custom-layout)