# SchoolManagmentSystem
This code is a part of a larger system for managing teachers and courses, and it provides basic functionality for retrieving and displaying information about teachers and courses.
This Java code defines three classes, Teacher, and Course, which are part of a system for managing and calculating payments for teachers based on the courses they teach. Below is a description of each class and its functionality:

Teacher Class
Attributes:

name: A private String attribute representing the teacher's name.
ID: A private integer attribute representing the teacher's ID.
basicSalary: A private double attribute representing the teacher's basic salary.
extraPaymentRate: A private double attribute representing the rate of extra payment.
coursesTaught: An array of Course objects representing the courses taught by the teacher.
Constructors:

Default constructor: Initializes the class with default values.
Parameterized constructor: Initializes the class with values for all attributes.
Getter and Setter Methods: Provides methods for getting and setting the values of the private attributes.

printInfo() Method: Prints the full information of the teacher, including name, ID, extra payment rate, and basic salary.

countCourseLevel(int level) Method:

Takes an integer argument level (1 to 4).
Counts the number of courses taught by the teacher at the specified level.
Returns the count of courses at that level or the total count of courses if level is not in the range [1, 4].
printCourses() Method: Prints the names and IDs of the courses taught by the teacher.

calculateExtraPayment() Method:

Calculates the extra payment for the teacher based on the formula provided.
The formula multiplies the extraPaymentRate by the sum of products of each course level's count and the level itself.
Returns the calculated extra payment.
Course Class
Attributes:

name: A private String attribute representing the course's name.
ID: A private integer attribute representing the course's ID.
Constructors:

Default constructor: Initializes the class with default values.
Parameterized constructor: Initializes the class with values for both attributes.
printInfo() Method: Prints the name and ID of the course.

Getter and Setter Methods: Provides methods for getting and setting the values of the private attributes.

Usage Notes
The Teacher class represents information about a teacher, including their name, ID, basic salary, extra payment rate, and the courses they teach.
The Course class represents information about a course, including its name and ID.
The code contains getter and setter methods for accessing and modifying the attributes of both classes.
The calculateExtraPayment method calculates the extra payment for a teacher based on their courses' levels and the provided rate.
The printCourses method prints the names and IDs of the courses taught by a teacher.
The countCourseLevel method counts the number of courses at a specified level taught by a teacher.
The code includes constructors to initialize objects of both classes.
The code has a printInfo method in both classes to display the details of a teacher or course.
