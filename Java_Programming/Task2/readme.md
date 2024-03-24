TASK 2
Studen Grade Calculator

Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user

My Approch

Main Method:

The main method initializes a Scanner object to read input from the user.
It prompts the user to input the number of subjects.
It creates an array marks to store the marks for each subject and initializes totalMarks to zero.

Input Marks:

Inside a for loop, the program prompts the user to enter marks for each subject.
The marks are stored in the marks array, and totalMarks is updated by adding each mark.

Calculate Average Percentage:

After inputting marks for all subjects, the program calculates the average percentage by dividing totalMarks by the number of subjects (numSubjects).
The average percentage is stored in the variable averagePercentage.

Calculate Grade:

The calculateGrade method takes the average percentage as input and determines the corresponding grade based on predefined grade boundaries.
Grades are determined using if-else statements:
If the percentage is greater than or equal to 85, the grade is 'A+'.
If the percentage is between 75 and 84, the grade is 'A'.
If the percentage is between 65 and 74, the grade is 'B+'.
If the percentage is between 55 and 64, the grade is 'B'.
If the percentage is between 45 and 54, the grade is 'C+'.
If the percentage is between 35 and 44, the grade is 'C'.
Otherwise, the grade is 'F'.
The calculated grade is returned to the main method and stored in the variable grade.

Output Results:

Finally, the program prints out the total marks, average percentage, and grade.

Closing Resources:

The Scanner object is closed to release system resources.
