# Building Microservices with Spring Boot

## Introduction
This project demonstrates how to build microservices using the latest frameworks. The architecture used follows the Aggregator design pattern. The project covers various aspects including containerizing microservices with Docker, implementing service discovery in microservices, integrating message queues with RabbitMQ, and more.

## Project Overview
The project focuses on developing microservices using Spring Boot and Maven archetype project setup. It involves creating a root project with Maven dependencies and then creating individual microservices. Each microservice is designed to handle specific functionalities related to customer enlistment.

## Project Structure
After setting up the Maven archetype project, the project structure will resemble the following:

enlist/
├── pom.xml
├── customer/
│   ├── pom.xml
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── enlist/
│   │                   └── customer/
│   │                       ├── CustomerApplication.java
│   │                       ├── controllers/
│   │                       │   ├── CustomerController.java
│   │                       │   └── AffiliationController.java
│   │                       ├── models/
│   │                       │   ├── Customer.java
│   │                       │   ├── Person.java
│   │                       │   ├── Business.java
│   │                       │   └── Affiliation.java
│   │                       ├── requests/
│   │                       │   ├── IndividualRequest.java
│   │                       │   ├── BusinessRequest.java
│   │                       │   └── AffiliationRequest.java
│   │                       └── services/
│   │                           └── CustomerService.java
│   |
├── attachments/
│   ├── pom.xml
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── enlist/
│   │                   └── attachments/
│   │                       ├── AttachmentApplication.java
│   │                       ├── controllers/
│   │                       │   ├── AttachmentController.java
│   │                       │  
│   │                       ├── models/
│   │                       │   ├── Document.java
│   │                       │   ├── DocumentType.java
│   │                       │   ├── DocumentSetting.java
│   │                       │   
│   │                       ├── requests/
│   │                       │   ├── DocumentRequest.java
│   │                       │   ├── TypeRequest.java
│   │                       │   └── SettingsRequest.java
│   │                       └── services/
│   │                           └--AttachmentService.java
│   └── src/
│       └── main/
│           └── resources/
│               ├── application.yml
│               └── banner.txt
├── UIFeed/
│   ├── pom.xml
│   ├── src/
│   │   └── main/
│   │       └── java/
│   │           └── com/
│   │               └── enlist/
│   │                   └── uifeed/
│   │                       ├── UIApplication.java
│   │                       ├── controllers/
│   │                       │   ├── AppController.java
│   │                       │  
│   │                       ├── models/
│   │                       │   ├── Customer.java
├   |                       |   |---Documents.java
│   │                       │   ├── DocumentType.java
│   │                       │   ├── DocumentSetting.java
│   │                       │   
│   │                       ├── requests/
│   │                       │   ├── DocumentRequest.java
│   │                       │   ├── TypeRequest.java
│   │                       │   └── SettingsRequest.java
│   │                       └── services/
│   │                           └--AppService.java
│   └── src/
│       └── main/
│           └── resources/
│               ├── application.yml
│               └── banner.txt


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


