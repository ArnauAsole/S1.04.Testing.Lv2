# S1.04.Testing.Lv2
S1.04.Testing.Lv1.Ex1-Ex7
📚🧪 Java Unit Testing Exercises - Assertions and Exceptions

Exercise Description
This set of exercises is aimed at practicing the use of JUnit 5 to test Java code, focusing on different types of assertions related to value equality, object references, arrays, collections, exceptions, and Optional.

Each exercise explores a core concept of testing using assertions or expected error handling.

✅ Requirements and Implemented Exercises
🔹 Exercise 1: Value Equality
Assertion to verify that two Integer objects have the same value.

Assertion to verify that two Integer objects have different values.

🔹 Exercise 2: Reference Equality
Assertion to verify that two references point to the same object.

Assertion to verify that two references point to different objects.

🔹 Exercise 3: Array Equality
Assertion to verify that two arrays of integers are identical (same content and order).

🔹 Exercise 4: Working with an ArrayList
Create a list with various custom object types.

Verify the order of the objects in the list matches the insertion order.

Verify the list contains all inserted objects, regardless of order.

Verify that a specific object appears only once.

Verify that a certain object (not inserted) is not in the list.

🔹 Exercise 5: Using a Map
Create a Map<K, V> and verify it contains a specific key.

🔹 Exercise 6: Exception Handling
Trigger an ArrayIndexOutOfBoundsException.

Create an assertion that validates the exception is correctly thrown.

🔹 Exercise 7: Empty Optional
Create an empty Optional and verify it is indeed empty using an assertion.

💻 Technologies Used
Java 17

IntelliJ IDEA (Community Edition)

JUnit 5

Maven or Gradle (optional, depending on setup)

📋 Prerequisites
Java JDK 17 installed

IntelliJ IDEA (Community Edition)

Maven or Gradle (if using dependency management)

🛠️ Installation and Setup
1. Install Required Tools
Download Java JDK 17

Download IntelliJ IDEA CE

Install Maven or Gradle (optional)
2. Clone the Repository (Optional)
3. bash
```
git clone https://github.com/ArnauAsole/S1.04.Testing.Lv2.git
cd S1.04.Testing.Lv2/
```

5. Open the Project in IntelliJ
In IntelliJ: go to File → Open and select the root project folder.

▶️ Running the Project
Open the corresponding test files for each exercise (Ex1Test.java, Ex2Test.java, etc.)

Right-click and select Run or use the green arrow to run the tests.

You should see all tests passing successfully.

📈 Sample Output (JUnit test results)

✓ testIntegerValuesAreEqual  
✓ testIntegerValuesAreNotEqual  
✓ testObjectReferencesAreSame  
✓ testObjectReferencesAreDifferent  
✓ testArraysAreEqual  
✓ testArrayListOrderPreserved  
✓ testArrayListContainsAll  
✓ testArrayListContainsOnlyOnce  
✓ testArrayListDoesNotContainElement  
✓ testMapContainsKey  
✓ testThrowsArrayIndexOutOfBoundsException  
✓ testOptionalIsEmpty
🌐 Deployment
This is a console-based Java project intended for local execution within your IDE. No web or server deployment is required.

🤝 Acknowledgements
Thanks to the instructors and peers for their guidance and support: Arnau, Adrià, Ignasi, Ana, Alejandro.
