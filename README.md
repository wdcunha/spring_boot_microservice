# Devdojo Tutorial for Spring Boot Microservice

 Requirements
 ------------
 Below is the list of technologies used to make it work:
 
 * Docker desktop community
 * Java SE Development Kit 8 (1.8.0_231) and tested with version 11.0.5 and both worked fine
 * IDEA 2019.2.4 Ultimate Edition 
 
 > Extra: Postman was used to test endpoints
 
 
## Instructions to run microservices

* create/instantiate stack of mysql image in docker to put it up and to not have problem when running services:

`docker-compose -f stack.yml up`

> When running it for the first time, it is necessary to create the database, what was done using the Database tool from intelliJ


