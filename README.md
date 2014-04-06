PruebaSpring
============
Diferentes ejemplos de aplicaciones Web con tecnología Spring y JEE
-----------------------------------------------

* **PruebaSpringWeb**: Módulo Web Spring MVC, que renderiza JSP para la primera petición de un recurso y JSON para el resto de peticiones AJAX (jQuery).
* **PruebaSpringWebRemote**: Módulo Web Spring MVC con servidor Spring HttpInvoker.
* **PruebaSpringClienteHttpinvoker**: Módulo Web Spring MVC con cliente Spring HttpInvoker.
* **PruebaJAX-RS**: Módulo web de servicios REST con JAX-RS.
* **PruebaService**: Fachada para los servicios de negocio.
* **PruebaSpringService**: Implementación de la fachada PruebaService, con Spring.
* **PruebaEJBService**: Implementación de la fachada PruebaService, con EJB.
* **PruebaEntity**: Modelo de negocio orientado a objetos, que es utilizado por la fachada.

¡Aún queda mucho por hacer!
---------------------------
* Webservices SOA
	* Implementar con RESTlet http://restlet.org/
	* Ejemplo con AsyncResponse de JAX-RS para ReverseAJAX.
* Sacar la persistencia del módulo PruebaEJBService.
* Todo el testing.
* Probar transaccionalidad
* Probar AOP
* Diseñar módulo web orientado a recursos RESTful
* Crear un módulo web con JSF
* Implementar una llamada con un @Remote EJB

