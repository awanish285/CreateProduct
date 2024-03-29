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

1) Rest Template is used to create applications that consume RESTful Web Services. 

2) You can use the exchange() method to consume the web services for all HTTP methods. 


#You will have to follow the given points to consume the API −

1) Autowired the Rest Template Object.
2) Use HttpHeaders to set the Request Headers.
3) Use HttpEntity to wrap the request object.
4) Provide the URL, HttpMethod, and Return type for Exchange() method.


--------------------------------------------------------------------------------------------------------

#The REST application follows the REST architectural approach. 
1) We use the REST application for developing and designing networked applications. 
2) It generates the HTTP request that performs CRUD operations on the data. Usually, it returns data in JSON or XML format.

=====================================================================================================================================================
1) REST stands for REpresentational State Transfer. 
2) It is developed by Roy Thomas Fielding, who also developed HTTP. 
3) The main goal of RESTful web services is to make web services more effective. 
4) RESTful web services try to define services using the different concepts that are already present in HTTP. 
5) REST is an architectural approach, not a protocol.

1) It does not define the standard message exchange format. We can build REST services with both XML and JSON. 
2) JSON is more popular format with REST. The key abstraction is a resource in REST. A resource can be anything. 
3) It can be accessed through a Uniform Resource Identifier (URI). 

#For example:

The resource has representations like XML, HTML, and JSON. The current state capture by representational resource. 
When we request a resource, we provide the representation of the resource. The important methods of HTTP are:

1) GET: It reads a resource.
2) PUT: It updates an existing resource.
3) POST: It creates a new resource.
4) DELETE: It deletes the resource.

=========================================================================================================================================================
# For example, if we want to perform the following actions in the social media application, we get the corresponding results.

1) POST /users: It creates a user.

2) GET /users/{id}: It retrieves the detail of a user.

3) GET /users: It retrieves the detail of all users.

4) DELETE /users: It deletes all users.

5) DELETE /users/{id}: It deletes a user.

6) GET /users/{id}/posts/post_id: It retrieve the detail of a specific post.

7) POST / users/{id}/ posts: It creates a post of the user.

==================================================================================================================================================================
# HTTP also defines the following standard status code:

1) 404: RESOURCE NOT FOUND
2) 200: SUCCESS
3) 201: CREATED
4) 401: UNAUTHORIZED
5) 500: SERVER ERROR

=====================================================================================================================================================================
#RESTful Service Constraints

1) There must be a service producer and service consumer.
2) The service is stateless.
3) The service result must be cacheable.
4) The interface is uniform and exposing resources.
5) The service should assume a layered architecture.
================================================================================================================================================================
#Advantages of RESTful web services

1) RESTful web services are platform-independent.
2) It can be written in any programming language and can be executed on any platform.
3) It provides different data format like JSON, text, HTML, and XML.
4) It is fast in comparison to SOAP because there is no strict specification like SOAP.
5) These are reusable.
6) They are language neutral.

==================================================================================================================================================================
#SOAP vs REST Web Services

#There are many differences between SOAP and REST web services. The important 10 differences between SOAP and REST are given below:

#SOAP

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
============================================================================================================================================================
#REST Web Services

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
# Json VS XML

#Json:
1) JSON stands for javascript object notation.	
2) The extension of json file is .json.	
3) The internet media type is application/json.	
4) The type of format in JSON is data interchange.	
5) It is extended from javascript.	
6) It is open source means that we do not have to pay anything to use JSON.	
7) The object created in JSON has some type.	
8) The data types supported by JSON are strings, numbers, Booleans, null, array.	
9) It does not have any capacity to display the data.	
10) JSON has no tags.	
11) JSON is quicker to read and write.	
12) JSON can use arrays to represent the data.	
13) It can be parsed by a standard javascript function. 
14) It can be easily parsed and little bit code is required to parse the data.	
15) File size is smaller as compared to XML.	
16) JSON is data-oriented.	
17) It is less secure than XML.	

#XML:
1) XML stands for an extensible markup language.
2) The extension of xml file is .xml.
3) The internet media type is application/xml or text/xml.
4) The type of format in XML is a markup language.
5) It is extended from SGML.
6) It is also open source.
7) XML data does not have any type.
8) XML data is in a string format.
9) XML is a markup language, so it has the capacity to display the content.
10)XML data is represented in tags, i.e., start tag and end tag.
11) XML file is larger. If we want to represent the data in XML then it would create a larger file as compared to JSON.
12) XML file takes time to read and write because the learning curve is higher.
13) XML does not contain the concept of arrays.
14) It has to be parsed before use.	XML data which is used to interchange the data, must be parsed with respective to their programming language to use that.
15) It is difficult to parse.
16) File size is larger.
17) XML is document-oriented.
18) It is more secure than JSON.

==============================================================================================================================================================
#Maven

1) Maven is a powerful project management tool that is based on POM (project object model). 
2) It is used for projects build, dependency and documentation.

3) It simplifies the build process like ANT. But it is too much advanced than ANT.

#Understanding the problem without Maven

There are many problems that we face during the project development. They are discussed below:

# 1) Adding set of Jars in each project: 

In case of struts, spring, hibernate frameworks, we need to add set of jar files in each project. It must include all the dependencies of jars also.

# 2) Creating the right project structure: 

We must create the right project structure in servlet, struts etc, otherwise it will not be executed.

# 3) Building and Deploying the project: 

We must have to build and deploy the project so that it may work.

==========================================================================================================================================================

#What it does?

Maven simplifies the above mentioned problems. It does mainly following tasks.

1) It makes a project easy to build
2) It provides uniform build process (maven project can be shared by all the maven projects)
3) It provides project information (log document, cross referenced sources, mailing list, dependency list, unit test reports etc.)
4) It is easy to migrate for new features of Maven

==============================================================================================================================================

#Apache Maven helps to manage

1) Builds
2) Documentation
3) Reporing
4) SCMs
5) Releases
6) Distribution

=====================================================================================================================================================

#What is Build Tool
A build tool takes care of everything for building a process. It does following:

1) Generates source code (if auto-generated code is used)
2) Generates documentation from source code
3) Compiles source code
4) Packages compiled code into JAR of ZIP file
5) Installs the packaged code in local repository, server repository, or central repository

=============================================================================================================================================================

#How to install Maven on windows

You can download and install maven on windows, linux and MAC OS platforms. Here, we are going to learn how to install maven on windows OS.

To install maven on windows, you need to perform following steps:

1) Download maven and extract it
2) Add JAVA_HOME and MAVEN_HOME in environment variable
3) Add maven path in environment variable
4) Verify Maven


# Add MAVEN_HOME in environment variable

1) Right click on MyComputer -> properties -> Advanced System Settings -> Environment variables -> click new button

2) Now add MAVEN_HOME in variable name and path of maven in variable value. It must be the home directory of maven i.e. outer directory of bin. For example: E:\apache-maven-3.1.1 .

# Verify maven
To verify whether maven is installed or not, open the command prompt and write:

mvn −version  

===============================================================================================================================================================