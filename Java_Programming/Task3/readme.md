TASK 3
ATM Interface
1.Create a class to represent the ATM machine.

2. Design the user interface for the ATM, including options such as withdrawing, depositing, and
checking the balance.

3. Implement methods for each option, such as withdraw(amount), deposit(amount), and
checkBalance().

4. Create a class to represent the user's bank account, which stores the account balance.

5. Connect the ATM class with the user's bank account class to access and modify the account
balance.

6. Validate user input to ensure it is within acceptable limits (e.g., sufficient balance for withdrawals).

7. Display appropriate messages to the user based on their chosen options and the success or failure
of their transactions.



My Approch
Main Class: ATM

This class represents an Automated Teller Machine (ATM).
It has a constructor that takes a BankAccount object as a parameter. This BankAccount represents the account associated with the ATM.
The displayMenu() method prints out the ATM menu options.
The processChoice(int choice) method takes an integer choice as input and processes the user's selection based on the menu options.
Three private methods handle the core functionalities of the ATM:
  withdrawCash(): Allows the user to withdraw cash from the account.
  depositCash(): Allows the user to deposit cash into the account.
  checkBalance(): Displays the current balance of the account.
Additional private methods handle input validation (readValidAmount() and readValidChoice()), ensuring that the user inputs valid amounts and menu choices.
The main method initializes an instance of BankAccount with an initial balance, creates an instance of ATM, and starts a loop to display the menu and process user choices.
The loop continues until the user chooses to exit (choice == 4), at which point the Scanner object is closed.

BankAccount Class

This class represents a bank account.
It has a constructor that initializes the account balance.
Methods are provided to retrieve the current balance (getBalance()), withdraw funds (withdraw(double amount)), and deposit funds (deposit(double amount)).

Input Validation

The program ensures that the user inputs valid numeric values for amounts and menu choices. It loops until valid input is provided, displaying appropriate error messages for invalid input.

Functionality

Users can perform the following actions:
Withdraw cash: The user inputs the amount to withdraw, and if the account has sufficient funds, the withdrawal is processed.
Deposit cash: The user inputs the amount to deposit, and the deposit is added to the account balance.
Check balance: The current balance of the account is displayed.
Exit: The program exits the loop, ending the ATM session.

Resource Management

The Scanner object is properly closed to prevent resource leaks when the program terminates.
