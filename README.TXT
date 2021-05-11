------------------------------------------------------------------------
The purpose of this program is to test 4 iterations of a password strength identifier. Iterations 1, 3, and 4 simply
specify whether or not a password is accepted, according to the guidelines described below. Iteration 2 also explains
to the programmer why a particular password entry is not valid, whether it be for a short length or a missing letter or
number, or a combination. 

Iteration 1: Is the password at least 8 letters long, containing at least one letter and one number?
Iteration 2: see above, informing the programmer of why the password fails if it does
Iteration 3: Is the user a regular user? If so, run iteration 1. If the user is an admin instead, check to see
that the password also has at least 13 letters and at least one special character ($%^&*!@#).
Iteration 4: Is the user a regular user? If so, run iteration 1 but require that the password be at least 10
characters long rather than 8. If the user is an admin instead, run the requirements of iteration 3, but instead
require that there at least 3 special characters rather than just one.

------------------------------------------------------------------------

PROJECT TITLE: PasswordStrength
PURPOSE OF PROJECT: The purpose of this program is to run a wide variety of passwords through 4 
VERSION or DATE: 5/11/2021
HOW TO START THIS PROJECT: Run the main method of the Password Strength class. 
AUTHORS: Alexander Stoddard
USER INSTRUCTIONS: Run the main method of the Password Strength class. 
