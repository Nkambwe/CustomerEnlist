# Building Microservices with Spring Boot

## Introduction
This project serves as a comprehensive guide to building microservices leveraging cutting-edge frameworks. Embracing the Aggregator design pattern, it provides an insightful exploration into modern microservices architecture. Key topics covered include containerization with Docker, seamless service discovery implementation, robust integration of message queues using RabbitMQ, alongside a myriad of other essential microservices paradigms.

## Project Overview
The project is a customer enlisting service and includes services that capture required documents for enlisting and the organization that they are affliated to. The two services are aggregated to a single service called UIFeed that connects the clients to the microservices

## Creating the project
We start by creating the root project for our project. We'll be creating a Maven project using the IntelliJ IDE
![Create Project](images/create_project.png)

## Modifying Project Configuration
The root `pom.xml` file is modified to manage dependencies for shared dependencies among microservices and include dependencies specific to each microservice.

## Creating Microservices
Microservices are created starting with the customer microservice. New modules are added to the project for each microservice.

## Creating Customer Service Classes
Customer service classes including models, controllers, request objects, and service classes are created within the microservice modules.

## Creating Models
Models representing customer entities are defined within the microservice package.

## Creating Request Objects
Request objects are created to handle various types of customer requests.

## Creating Customer Service
A service class is implemented to handle customer-related operations.

## Creating Controllers
Controllers are added to handle HTTP requests for customer and affiliation functionalities.


