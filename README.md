# Java # Java for Testers


# Java for Testers

Detta repo dokumenterar min förberedelse inför kursen Programmering för testare på EC Utbildning.

Målet är att bygga en stabil grund i Java inför höstens kurs och kommande testautomatisering.

Jag läser detta parallellt med min ordinarie utbildning till mjukvarutestare. Fokus är inte att bli utvecklare, utan att förstå programmering tillräckligt bra för att kunna arbeta bättre med testdesign, testautomation och CI.

## Fokus

- Java-grunder
- logiskt tänkande
- testbar kod
- enkel felsökning
- koppling mellan programmering och mjukvarutestning
- förberedelse inför testautomation

## Structure

java-for-testers  
README.md  
week-01-hello-java  
HelloTester.java  
MyGoal.java  

## Week 01 - Hello Java

I created my first Java files and ran them in IntelliJ.

Files:

- HelloTester.java
- MyGoal.java

## What I learned

- how to create a Java class
- how the main method starts the program
- how to print text with System.out.println
- how to run Java code in IntelliJ
- how to read output in the Run window
- how a small syntax error can stop the program
- how to correct a simple syntax error
- that exit code 0 means the program finished successfully

## QA reflection

Running code and observing the result is similar to executing a test case.

A small change in the code can change the actual result.

Error messages are not failures. They are clues.

This first lesson connects programming to testing because I:

- changed the code
- executed the program
- observed the actual result
- compared it with the expected result
- corrected an error
- ran the program again

## Example manual test case

### Test case: Run HelloTester

Precondition:  
HelloTester.java exists in IntelliJ.

Steps:

1. Open HelloTester.java.
2. Click the green play button.
3. Read the output in the Run window.

Expected result:  
The program prints three text lines.

Actual result:  
The program printed three text lines.

Status:  
Pass.

## Lesson 01 summary

Today I created my first Java files and ran them in IntelliJ.

I learned that:

- Java programs start in the main method
- System.out.println prints text to the console
- exit code 0 means the program finished successfully
- error messages are useful clues when something is wrong

## Next step

Next lesson:

Lesson 02 - Variables and data types

Focus:

- String = text
- int = whole number
- double = decimal number
- boolean = true/false

## Week 02 - Variables and data types

I learned how to use basic Java data types:

- String for text
- int for whole numbers
- double for decimal numbers
- boolean for true/false values

Files:

- UserProfile.java
- TestDataExample.java

QA reflection:

Variables are similar to test data.

Different data types can represent different kinds of input:

- String can represent text fields
- int can represent numeric input
- double can represent prices, scores or measurements
- boolean can represent yes/no choices or checkboxes

I also learned that `"49"` and `49` are not the same thing in Java.

- `"49"` is text
- `49` is a number

This matters when testing input validation.

## Week 03 - If statements and decisions

I learned how to use if statements in Java.

Files:

- AgeCheck.java
- AgeCategory.java
- LoginCheck.java

Key concepts:

- if
- else
- else if
- comparison operators
- boolean conditions
- && for AND logic
- equals() for comparing text

QA reflection:

If statements are closely connected to test design.

They make it possible to define rules such as:

- under 18 = Child
- 18 and above = Adult
- under 65 = Adult
- 65 and above = Senior
- correct username and password = Login successful
- invalid username or password = Login failed

I practiced boundary value analysis with age values:

- 17
- 18
- 64
- 65

I also practiced positive and negative test data for login:

- valid username and valid password
- valid username and invalid password
- invalid username and valid password
- empty username
- empty password

This helped me connect Java logic to:

- input
- business rules
- expected results
- actual results
- test cases
## Week 04 - Methods

I learned how to create and use methods in Java.

Files:

- AgeMethod.java
- AgeCategoryMethod.java
- LoginMethod.java

Key concepts:

- method
- parameter
- return value
- input
- output
- reusable logic
- testable code

QA reflection:

Methods are important because they make code easier to test.

A method can take input and return output.

Examples:

- age 17 returns Child
- age 18 returns Adult
- age 65 returns Senior
- valid login data returns Login successful
- invalid login data returns Login failed

This connects directly to test design:

- test data
- expected result
- actual result
- boundary values
- positive tests
- negative tests

I also learned that logic inside a method can later be tested with automated tests, for example with JUnit.

## Week 05 - Loops

I learned how to use loops in Java.

Files:

- SimpleLoop.java
- AgeLoop.java
- AgeCategoryLoop.java
- LoginLoop.java

Key concepts:

- for loop
- enhanced for loop
- array
- index
- repeated execution
- multiple test data values

QA reflection:

Loops are important for testing because they make it possible to run the same logic against multiple test values.

Examples:

- testing several age values
- testing boundary values
- testing several login combinations
- running positive and negative test data in one execution

This connects to:

- regression testing
- data-driven testing
- test automation
- repeated test execution