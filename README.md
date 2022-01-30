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
