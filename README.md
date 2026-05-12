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