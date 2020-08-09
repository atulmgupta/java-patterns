---
description: >-
  Proxy is a structural design pattern that provides an object that acts as a
  substitute for a real
---

# Proxy

**Proxy** is a structural design pattern that provides an object that acts as a substitute for a real service object used by a client. A proxy receives client requests, does some work \(access control, caching, etc.\) and then passes the request to a service object.

**Usage examples:** While the Proxy pattern isn’t a frequent guest in most Java applications, it’s still very handy in some special cases. It’s irreplaceable when you want to add some additional behaviors to an object of some existing class without changing the client code.

Some examples of proxies in standard Java libraries:

* [`java.lang.reflect.Proxy`](https://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html)
* [`java.rmi.*`](https://docs.oracle.com/javase/8/docs/api/java/rmi/package-summary.html)
* [`javax.ejb.EJB`](https://docs.oracle.com/javaee/7/api/javax/ejb/EJB.html) \([see comments](https://stackoverflow.com/questions/25514361/when-using-ejb-does-each-managed-bean-get-its-own-ejb-instance)\)
* [`javax.inject.Inject`](https://docs.oracle.com/javaee/7/api/javax/inject/Inject.html) \([see comments](https://stackoverflow.com/questions/29651008/field-getobj-returns-all-nulls-on-injected-cdi-managed-beans-while-manually-i/29672591#29672591)\)
* [`javax.persistence.PersistenceContext`](https://docs.oracle.com/javaee/7/api/javax/persistence/PersistenceContext.html)

**Identification:** Proxies delegate all of the real work to some other object. Each proxy method should, in the end, refer to a service object unless the proxy is a subclass of a service.

### Caching proxy <a id="example-0-title"></a>

In this example, the Proxy pattern helps to implement the lazy initialization and caching to an inefficient 3rd-party YouTube integration library.

Proxy is invaluable when you have to add some additional behaviors to a class which code you can’t change.



