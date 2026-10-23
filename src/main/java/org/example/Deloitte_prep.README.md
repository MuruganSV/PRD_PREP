Deloitte interviews for a Java Microservices Consultant (typically 3 to 6 years of experience) focus heavily on practical application, architectural design, core Java, and Spring Boot scenarios rather than pure theoretical definitions.

1. Project Architecture & System Design

• Project Walkthrough: Draw and explain your project’s complete architecture on a notepad or shared screen (from UI/API Gateway down to the database).
• Microservices Breakdown: How many microservices did you work on? Name them, describe their functions, and clarify which ones you owned end-to-end.
• Monolith vs. Microservices: When would you choose a monolithic architecture over microservices, and how do you handle monitoring/logging in distributed systems?
• Distributed Transactions: Explain how you manage distributed transactions using patterns like the Saga pattern or Outbox pattern.
• Resilience Patterns: How do you implement and handle Circuit Breaker (e.g., Resilience4j), Retry, and Fallback mechanisms when a downstream service is down?

2. Core Java & Java 8+ Features

• OOPs & SOLID Principles: Explain SOLID principles with real-time project examples (e.g., refactoring a payment app or service class).
• Immutability: What is an immutable class in Java, and how do you write one from scratch (using final, private fields, no setters)?
• Collections & Internal Workings:
• How does HashMap work internally, and how does it handle hash collisions?
• Differences between ArrayList and LinkedList, or Set and List.
• Differences between regular HashMap and ConcurrentHashMap.
• Java 8 & Java 21 Features:
• Working with Streams API (map() vs. flatMap()), Lambda expressions, Functional interfaces, and Optional.
• Writing simple lambda expressions or output-prediction code snippets.
• Multithreading & Concurrency: Thread lifecycle, wait() vs. notify(), and the use of keywords like volatile and transient.

3. Spring Boot & Microservices Ecosystem

• Dependency Injection & Annotations:
• How Spring handles @Autowired, @Qualifier, @Bean, and @ConditionalOnClass.
• Handling multiple database configurations or multiple beans in Spring Boot.
• Service Discovery & API Gateway:
• Role of Eureka Server for service discovery and responsibilities of an API Gateway.
• Security & Communication:
• Securing APIs using JWT and handling synchronous (REST/Feign) vs. asynchronous (Apache Kafka topics, partitions, offsets, consumer groups) communication.
• Exception Handling & Actuator:
• Implementing Global Exception Handling using @ControllerAdvice and @ExceptionHandler.
• Using Spring Boot Actuator, Micrometer, Prometheus, or Grafana for health checks and tracing.

4. Database & SQL

• Relational Mapping (Hibernate/JPA):
• Explaining One-to-Many or Many-to-Many mappings in Hibernate and understanding Lazy Loading vs. Eager Loading.
• SQL & Performance:
• Writing queries (e.g., finding the N-th highest salary).
• Database indexing, handling constraint violations, primary vs. foreign key differences, and database sharding vs. partitioning.
• Database Coding/Design:
• Drawing or writing a table schema from your project on the fly and justifying the need for each column.

5. Coding & Problem-Solving Rounds

• Data Structures / Logic: Often includes string manipulation, finding max-sum contiguous elements in an array, validating parentheses using a Stack, or file/collection counting problems without using Stream APIs.
• Live Coding / Notepad Coding: Expect interviewers to share a blank notepad or screen-share session to write raw Java code or REST endpoint creation steps line-by-line.
Note: You can review detailed candidate breakdowns and practice threads on platforms like AmbitionBox or discussion forums on Glassdoor.
