
| Fitness Repetition Exercise                                           |
|                                                                       |
| In this exercise you are going to make a program that can show lists  |
| of Employees and members of a Fitness Club.                           |
|                                                                       |
| Employees {#employees}                                                |
| =========                                                             |
|                                                                       |
| There are 2 types of Employees:                                       |
|                                                                       |
| -   Administration personnel                                          |
|                                                                       |
| -   Instructors                                                       |
|                                                                       |
| The administration personnel are employed full time (37 hours a       |
| week), and all have a fixed salary of 23000 kr a month, and have 5    |
| weeks of vacation a year.                                             |
|                                                                       |
| Instructors are hired on an hourly basis, and are payed 456 kr per    |
| hour. They don\'t have any paid vacation.                             |
|                                                                       |
| Members {#members}                                                    |
| =======                                                               |
|                                                                       |
| The members can have 2 types of membership                            |
|                                                                       |
| -   Basic                                                             |
|                                                                       |
| -   Full                                                              |
|                                                                       |
| The Basic membership costs 199.- a month, and the Full membership     |
| 299,-                                                                 |
|                                                                       |
| You should make a console program that makes use of inheritance and   |
| polymorphism and that can print out something like the following:     |
|                                                                       |
| You are allowed to work in groups, but each one of you have to code   |
| your own program.                                                     |
|                                                                       |
| When you have finished your program, you should push it to github and |
| send a link to this repository to                                     |
| [jart[\@kea.dk]{.underline}](mailto:jart@kea.dk). If you have a       |
| private repository make sure to invite me as a collaborator           |
| (JarlTuxen)                                                           |
|                                                                       |
| Extra: Read data from a text file {#extra-read-data-from-a-text-file} |
| =================================                                     |
|                                                                       |
| Now make a text file named persons.txt. This file should contain the  |
| name and cpr of all employees and all members. Every person should be |
| on a separate line and there should be a blank space between the name |
| and the cpr number.                                                   |
|                                                                       |
| Make a new file called fileHandling.java and in this file should be   |
| the code for reading from the persons.txt file and adding it to an    |
| ArrayList of Person. You will have to use a Scanner Object to read    |
| from the file. Make one method that reads from the text file and adds |
| it to the ArrayList (this method could be private). and make a get    |
| method that returns an ArrayList of Person and call that method in    |
| your main method. Then print out the content in the console. The      |
| console should look something like this:                              |
|                                                                       |
| If you made it this far you should be happy !!                        |
|                                                                       |
| If you feel like it you could do the same for Employees only and      |
| Members Only. Keep it "simple" and create a unique text file for each |
| so you will end up with 3 text files: persons.txt, employees.txt and  |
| members.txt                                                           |
|                                                                       |
| *© kea, clbo 26-08-2019*                                              |
