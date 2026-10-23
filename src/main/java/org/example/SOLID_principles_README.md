The SOLID principles are five object-oriented design guidelines created to make software more maintainable, flexible, and scalable, while reducing tight coupling.

1. S — Single Responsibility Principle (SRP)

• Definition: A class should have one, and only one, reason to change — meaning it should only have one job or responsibility.
• Interview Example:
• Violation: An Employee class that holds employee data and calculates monthly salary and saves the record to a database. If the database schema changes or the tax logic updates, this class has to change.
• Fix: Split it into dedicated classes: an Employee (data model), a SalaryCalculator (business logic), and an EmployeeRepository (database operations).

2. O — Open/Closed Principle (OCP)

• Definition: Software entities (classes, modules, functions) should be open for extension, but closed for modification. You should be able to add new features without rewriting existing tested code.
• Interview Example:
• Violation: A PaymentProcessor class with a switch statement that handles Credit Card, then later you have to edit the class directly to add PayPal.
• Fix: Create a PaymentMethod interface with a processPayment() method. Implement CreditCardPayment and PayPalPayment classes separately. To add Crypto later, just implement a new class without touching existing code.

3. L — Liskov Substitution Principle (LSP)

• Definition: Objects of a superclass should be replaceable with objects of its subclasses without breaking the application's correctness. A child class should never violate the expectations set by the parent class.
• Interview Example:
• Violation: A base Rectangle class with setWidth() and setHeight() methods, and a Square subclass that forces both dimensions to be equal. If a function expects a Rectangle and sets width and height independently, passing a Square breaks the logic.
• Fix: Design cleaner abstractions or separate interfaces rather than forcing inheritance where the behavior doesn't truly substitute (e.g., separating Shape behaviors or using immutable value objects).

4. I — Interface Segregation Principle (ISP)

• Definition: No client should be forced to depend on methods it does not use. It is better to have many small, specific interfaces than one large, all-purpose interface.
• Interview Example:
• Violation: A massive Worker interface containing work() and eat(). If you create a RobotWorker class, it doesn't eat, so it is forced to implement a dummy or throw an exception for eat().
• Fix: Split the interface into smaller ones: Workable (with work()) and Feedable (with eat()). Then HumanWorker implements both, while RobotWorker implements only Workable.

5. D — Dependency Inversion Principle (DIP)

• Definition: High-level modules should not depend on low-level modules; both should depend on abstractions (interfaces). Abstractions should not depend on details; details should depend on abstractions.
• Interview Example:
• Violation: A ReportService (high-level) directly instantiates a MySQLDatabase (low-level) class inside its constructor. If you switch to MongoDB, you have to rewrite ReportService.
• Fix: Create a Database interface. Inject Database into ReportService via constructor injection. Now ReportService depends on an abstraction, letting you swap MySQL for MongoDB seamlessly.