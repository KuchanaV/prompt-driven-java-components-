I want to implement curd operations for product service. 
Consider following points 
* Entities with lombok support  
* Repository classes with spring Data JPA
* Services classes with proper Custom Exception handling
* Controller with Curd Operations 
* Input validation with Javax annotation
* ResponseEntity with Http codes
* Update pom.xml also with required dependencies

I want to implement Security for this service 
Consider below points
* Authorization and authentication with spring security
* Add role based autorization
* Should follow clean code structure
* Best security practices
* Handling authentication and Authorization errors
* Dont use depricated security methods

I want to implement rest service call communication using Feign cliet
consider below points
* add feign client dependency in pom.xml
* Service class payment processing,refunds and status codes
* Implement timeout for 2 minutes.
* Add retry logic and stop retry after 3 consecutive failures 
* Adding loggers using lombok for each transaction.
* Create model classes for request and response mapping.
* add required third party url application property file

I want to implement rest order service call using Resttemplate
* All methods calls Response should be generic response wrapper class with below information
* Include metadata like timestamp, requestId, and optional pagination info.
* Add 2 classes SuccessResponse<T> and ErrorResponse in Generic class.
* It should support any data type (like Order, List<User>, etc.).
* Use Lombok @Builder, @Getter, @AllArgsConstructor, @NoArgsConstructor.
* Fields must be accessible via builder.

I want to implement global exception handler using Spring boot
 * Should handle different type of exceptions.
 * Handling validation,custom exception and System errors.
 * Error response consist Http status code and user friendly exception messages
 * Add debug loggers as per requirement
 * updated Controller classes with required annotation like controller advice to support Global exception
