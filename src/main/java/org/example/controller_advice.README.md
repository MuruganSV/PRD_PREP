If you are building REST APIs that return JSON responses, you will typically use @RestControllerAdvice, which combines @ControllerAdvice and @ResponseBody.


Applications and Uses of @ControllerAdvice

There are three primary use cases for @ControllerAdvice:
1. Global Exception Handling (Most Common): Instead of scattering try-catch blocks across all your controllers, you can handle exceptions in one global class. When any controller throws an exception, this class intercepts it, formats a user-friendly error response (like a JSON payload), and returns the appropriate HTTP status code.
2. Global Data Binding (@InitBinder): You can centralize how request parameters are bound to Java objects. For example, you can register a custom property editor to automatically trim all incoming string parameters or format incoming dates globally.
3. Global Model Attributes (@ModelAttribute): In traditional Spring MVC applications, you can expose common data (like a logged-in user's profile info or layout configurations) to the model so that every web view template can access it automatically without adding it manually to each controller method.