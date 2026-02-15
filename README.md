# Exceptions-in-Java
# Learning about Exceptions and Exception Handling in Java

## What is an Exception?
* An Exception is an event which acn occur during the progam execution that disrupts the normal flow of instructions.
* Exception handling enables the programmer to throw an exception to the caller rather than handle the exception locally.
* There are two types of execptions:
* * Checked Exception - Exceptions that can occur and the programmer is forced to handle them.
  * Unchecked Exception - Exceptions that can occur and the programmer is not forced to handle them.
 
### Checked Exceptions
* Characteristics of Checked Exceptions:
* * They are checked at compile time, meaning the compiler enforces handling of these exceptions.
  * They are direct classes of the Exception class.
* The primary purpose of Checked Exception is to ensure that the programmer doesn't ignore the error handling.
* Common examples of checked Exceptions:
  * <code>IOException</code> - Occurs during input and output operations.
