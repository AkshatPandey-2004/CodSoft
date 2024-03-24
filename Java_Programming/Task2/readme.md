TASK 2
Studen Grade Calculator

Input: Take marks obtained (out of 100) in each subject.
Calculate Total Marks: Sum up the marks obtained in all subjects.
Calculate Average Percentage: Divide the total marks by the total number of subjects to get the
average percentage.
Grade Calculation: Assign grades based on the average percentage achieved.
Display Results: Show the total marks, average percentage, and the corresponding grade to the user

My Approch

Main Method (main):

The main method serves as the entry point of the program.
It starts by creating a Scanner object to read input from the user.
It prompts the user to enter the number of subjects for which they want to input marks.
It initializes an array marks to store the marks for each subject and a variable totalMarks to accumulate the total marks entered by the user.
It then iterates through each subject, prompting the user to input marks for each subject and updating totalMarks accordingly.
After inputting marks for all subjects, it calculates the average percentage by dividing the total marks by the number of subjects.

Calculate Grade Method (calculateGrade):

The calculateGrade method takes the average percentage as input and determines the corresponding grade based on predefined grade boundaries.
Grades are represented as strings with + signs appended where appropriate:
If the percentage is greater than or equal to 85, the grade is "A+".
If the percentage is between 75 and 84, the grade is "A".
If the percentage is between 65 and 74, the grade is "B+".
If the percentage is between 55 and 64, the grade is "B".
If the percentage is between 45 and 54, the grade is "C+".
If the percentage is between 35 and 44, the grade is "C".
Otherwise, the grade is "F".
The method returns the calculated grade as a string.

Output:

Finally, the program prints out the total marks, average percentage, and calculated grade.
It formats the average percentage to two decimal places using String.format().
Input Validation and Resource Management:

The program does not include input validation or explicit resource management (like closing the Scanner object). Adding these features would enhance the robustness of the program.

Functionality:

Users can input marks for multiple subjects and obtain the average percentage and corresponding grade based on those marks.
Grades are represented with + signs where appropriate, providing a detailed grading scale.
