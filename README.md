# Exceptions-in-Java
# Learning about Exceptions and Exception Handling in Java (Mini Project at the end)

## What is an Exception?
* An Exception is an event which acn occur during the progam execution that disrupts the normal flow of instructions.
* Exception handling enables the programmer to throw an exception to the caller rather than handle the exception locally.
* There are two types of execptions:
  * Checked Exception - Exceptions that can occur and the programmer is forced to handle them.
  * Unchecked Exception - Exceptions that can occur and the programmer is not forced to handle them.
 
### Checked Exceptions
* Characteristics of Checked Exceptions:
  * They are checked at compile time, meaning the compiler enforces handling of these exceptions.
  * They are direct classes of the Exception class.
* The primary purpose of Checked Exception is to ensure that the programmer doesn't ignore the error handling.
* Common examples of checked Exceptions:
  * <code>IOException</code> - Occurs during input and output operations.
  * <code>SQLException</code> - Arises during onteractions with databases.
  * <code>ClassNotFoundException</code> - Occurs when trying to access a class that doesn't exist.
* Best Practices for handling Checked Exceptions:
  * Use a <code>try-catch</code> block.
  * Use the <code>Throws Exception</code> clause appropriately. If it makes sense for the exception to be handled by the caller of the method, declare the exception in the method's throw clause.
  * Provide useful errors.
  * Avoid the <code>Throws</code> clause - Do not declare many Exceptions in the throw clause of the method signature, as it can make your API difficult to use.
 
### Unchecked Exception
* Characteristics of Unchecked Exception:
  * They are not checked at compile time, meaning the compiler does not enforce handling them (Runtime checking).
  * They are subclasses of <code>RuntimeException</code>.
  * They indicate the programmer's errors. That is, they often result from flaws in the program logic such as accessing invalid array indexes or null objects.
 
* Unchecked Exceptions typically represnt defects in the program.
* They are used for issues that the application should not attempt to catch, as they are often irrecoverable. For instance, <code>NullPointerException</code> or <code>IndexOutOfBoundsException</code> usually points to bugs in the code that need to be fixed rather than caught and handled.
* Some common examples of Unchecked Exceptions:
  * <code>NullPointerException</code> - Throws when attempting to acceess an Object with a reference variable whose current value is null.
  * <code>ArrayOutOfBoundsException</code> - Occurs when an array has been accessed with an illegal index.
  * <code>ArithmeticException</code> - Throw when exceptional arithmetic conditions occur, such as dividing by zero.
 
* Best practices for dealing with Unchecked Exceptions:
  * Preventative programming
  * Use Assertions
  * Avoid using <code>try-catch</code> blocks for unchecked exceptions
  * Document the exception to inform other programmers
 

# Mini Project: Student Grade Management System (Exception Handling)

Create a console-based system where:
1. User enter:
   * Student name
   * Number of Subjects
2. User enters marks for each subject.
3. System calculates average.
4. Assign grade:
   * 75+ = Distinction
   * 50 - 74 = Pass
   * Below 50 = Fail
### Exception Handling Requirements (Important):
You must handle:
1. <code>InputMismatchException</code>
2. <code>NegativeMarkException</code>
3. <code>MarkOutOfRangeException</code>
4. Division by zero (if subjects = 0)
5. Invalid menu choice
6. Use:
   * At least 2 custom exception
   * <code>finally</code> block
   * Multi-catch
   * <code>Throws</code>
