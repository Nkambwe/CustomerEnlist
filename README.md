# Building Microservices with Spring Boot

## Introduction
This project serves as a comprehensive guide to building microservices leveraging cutting-edge frameworks. Embracing the Aggregator design pattern, it provides an insightful exploration into modern microservices architecture. Key topics covered include containerization with Docker, seamless service discovery implementation, robust integration of message queues using RabbitMQ, alongside a myriad of other essential microservices paradigms.

## Project Overview
The project is a customer enlisting service and includes services that capture required documents for enlisting and the organization that they are affliated to. The two services are aggregated to a single service called UIFeed that connects the clients to the microservices

## Creating the project
We start by creating the root project for our project. We'll be creating a Maven project using the IntelliJ IDE
![Create Project](create_project.png)

This will create a root project for our so let it install the dependencies required. Once we’re done, our project structure will look like this:
![Create Project](create_project_02.png)

Since this is our root project, we do not need the src folder so we need to delete it out

## Modifying Project Configuration
Next, we’ll modify our pm.xml file to create both dependency management for shared dependencies in all our microservices from the root project and also include other dependencies that each microservice will have in their pom.xml file, So we modify the pom.xml file to look like this:

## Maven Project Configuration

````
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>com.enlist</groupId>
  <artifactId>enlist</artifactId>
  <version>1.0-SNAPSHOT</version>
  <name>enlist</name>
  <url>https://www.corvus.com</url>
  <properties>
    <java.version>22</java.version>
    <spring.boot.maven.plugin.version>3.2.4</spring.boot.maven.plugin.version>
  </properties>
  <dependencyManagement>
    <dependencies>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-dependencies</artifactId>
        <version>3.2.1</version>
        <type>pom</type>
      </dependency>
      <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
        <type>pom</type>
      </dependency>
    </dependencies>
  </dependencyManagement>

  <dependencies>

    <dependency>
      <groupId>org.projectlombok</groupId>
      <artifactId>lombok</artifactId>
      <version>1.18.32</version>
    </dependency>
    <dependency>
      <groupId>org.springframework.boot</groupId>
      <artifactId>spring-boot-starter-test</artifactId>
      <version>3.2.4</version>
    </dependency>
    <dependency>
      <groupId>org.modelmapper</groupId>
      <artifactId>modelmapper</artifactId>
      <version>3.1.1</version>
    </dependency>
    <dependency>
      <groupId>org.apache.commons</groupId>
      <artifactId>commons-lang3</artifactId>
      <version>3.14.0</version>
    </dependency>
    <dependency>
      <groupId>ch.qos.logback</groupId>
      <artifactId>logback-classic</artifactId>
      <version>1.5.3</version>
    </dependency>
    <dependency>
      <groupId>org.hibernate.validator</groupId>
      <artifactId>hibernate-validator</artifactId>
      <version>8.0.1.Final</version>
    </dependency>
    <dependency>
      <groupId>org.postgresql</groupId>
      <artifactId>postgresql</artifactId>
      <scope>runtime</scope>
      <version>42.6.2</version>
    </dependency>
  </dependencies>
  <build>
    <pluginManagement>
      <plugins>
        <plugin>
          <groupId>org.springframework.boot</groupId>
          <artifactId>spring-boot-maven-plugin</artifactId>
          <version>${spring.boot.maven.plugin.version}</version>
        </plugin>
      </plugins>
    </pluginManagement>
  </build>

</project>
````
## Creating Microservices
Next, we’ll create our microservices starting with the customer microservices. Right click the enlist project, choose New and Module. 

![Create Service](create_service_01.png)

We’ll create a customer service with these details

![Create Service](create_service_02.png)

Click, Next and leave the Maven version the same. Do not add any dependencies. Click create to add the project

![Create Service](create_service_03.png)

In our project root pom.xml file a new module node is added with the customer service name
![Create Service](service_pom_01.png)

Next, we need to add the dependency for spring-boot-starter-web for the customer service
````
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
    <parent>
        <artifactId>enlist</artifactId>
        <groupId>com.enlist</groupId>
        <version>1.0-SNAPSHOT</version>
    </parent>
    <modelVersion>4.0.0</modelVersion>
    <artifactId>customer</artifactId>
    <name>customer</name>
    <url>http://maven.apache.org</url>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <type>pom</type>
        </dependency>
    </dependencies>
</project>
````
## Creating Customer Service Classes
First we will add a new package in the java package of the customer service called com.enlist.customer and in there we’ll create our CustomerApplication class that contains the main method
![Create Service](service_pom_02.png)

In our resource folder, we will add the application.yml file, however you can use properties for configurations if i t serves you better. Right click the resource folder and choose New >> File and add that file name. Set the details of the file to:
````
server:
  port: 5480

spring:
  application:
    name: customer-service
````
Mind the indentation so the file does not have errors.
## Create Banner for your service
In addition, we will add a spring boot banner file in the resource folder. So again, right click the resource folder and choose New >> File and add a banner.txt file.
Open Google and search for ‘create spring boot banner’ and click on ‘spring boot banner’ generator’. Generate banner by filling in details
![Banner](banner.png)
Copy everything and page in your banner file
![Banner](banner_02.png)
Run the customer service and you will see in the Run window this:
![Banner](banner_03.png)
## Creating Models
Models representing customer entities are defined within the microservice package.
## Creating Request Objects
Request objects are created to handle various types of customer requests.
## Creating Customer Service
A service class is implemented to handle customer-related operations.
## Creating Controllers
Controllers are added to handle HTTP requests for customer and affiliation functionalities.


