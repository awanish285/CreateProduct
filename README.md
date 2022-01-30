# CreateProduct

# Description

This createProduct services is create the product with the following parameter like price,name of the product,description,price.

It used coupon services to give the discount on the product...


#Technology used
Java,Spring-data-jpa,SpringRest,springWeb
#tools
Spring-tool-suite,postman
#project Management tools
apache maveen

#VC
Git


======================================================================================================================================================

#RestTemplate

Rest Template is used to create applications that consume RESTful Web Services. 

You can use the exchange() method to consume the web services for all HTTP methods. 


You will have to follow the given points to consume the API −

Autowired the Rest Template Object.
Use HttpHeaders to set the Request Headers.
Use HttpEntity to wrap the request object.
Provide the URL, HttpMethod, and Return type for Exchange() method.


--------------------------------------------------------------------------------------------------------

The REST application follows the REST architectural approach. We use the REST application for developing and designing networked applications. 
It generates the HTTP request that performs CRUD operations on the data. Usually, it returns data in JSON or XML format.

=====================================================================================================================================================
REST stands for REpresentational State Transfer. It is developed by Roy Thomas Fielding, who also developed HTTP. 
The main goal of RESTful web services is to make web services more effective. 
RESTful web services try to define services using the different concepts that are already present in HTTP. 
REST is an architectural approach, not a protocol.

It does not define the standard message exchange format. We can build REST services with both XML and JSON. 
JSON is more popular format with REST. The key abstraction is a resource in REST. A resource can be anything. 
It can be accessed through a Uniform Resource Identifier (URI). 

For example:

The resource has representations like XML, HTML, and JSON. The current state capture by representational resource. 
When we request a resource, we provide the representation of the resource. The important methods of HTTP are:

GET: It reads a resource.
PUT: It updates an existing resource.
POST: It creates a new resource.
DELETE: It deletes the resource.

=========================================================================================================================================================
For example, if we want to perform the following actions in the social media application, we get the corresponding results.

POST /users: It creates a user.

GET /users/{id}: It retrieves the detail of a user.

GET /users: It retrieves the detail of all users.

DELETE /users: It deletes all users.

DELETE /users/{id}: It deletes a user.

GET /users/{id}/posts/post_id: It retrieve the detail of a specific post.

POST / users/{id}/ posts: It creates a post of the user.

==================================================================================================================================================================
HTTP also defines the following standard status code:

404: RESOURCE NOT FOUND
200: SUCCESS
201: CREATED
401: UNAUTHORIZED
500: SERVER ERROR

=====================================================================================================================================================================
RESTful Service Constraints
There must be a service producer and service consumer.
The service is stateless.
The service result must be cacheable.
The interface is uniform and exposing resources.
The service should assume a layered architecture.
================================================================================================================================================================
Advantages of RESTful web services
RESTful web services are platform-independent.
It can be written in any programming language and can be executed on any platform.
It provides different data format like JSON, text, HTML, and XML.
It is fast in comparison to SOAP because there is no strict specification like SOAP.
These are reusable.
They are language neutral.

==================================================================================================================================================================
SOAP vs REST Web Services
There are many differences between SOAP and REST web services. The important 10 differences between SOAP and REST are given below:

1)	SOAP is a protocol.
2)	SOAP stands for Simple Object Access Protocol.	
3)	SOAP can't use REST because it is a protocol.	
4)	SOAP uses services interfaces to expose the business logic.	
5)	JAX-WS is the java API for SOAP web services.	
6)	SOAP defines standards to be strictly followed.	
7)	SOAP requires more bandwidth and resource than REST.	
8)	SOAP defines its own security.	
9)	SOAP permits XML data format only.	
10)	SOAP is less preferred than REST.	

1) REST is an architectural style.
2) REST stands for REpresentational State Transfer.
3) REST can use SOAP web services because it is a concept and can use any protocol like HTTP, SOAP.
4) REST uses URI to expose business logic.
5) JAX-RS is the java API for RESTful web services.
6) REST does not define too much standards like SOAP.
7) REST requires less bandwidth and resource than SOAP.
8) RESTful web services inherits security measures from the underlying transport.
9) REST permits different data format such as Plain text, HTML, XML, JSON etc.
10) REST more preferred than SOAP.


============================================================================================================================================================================