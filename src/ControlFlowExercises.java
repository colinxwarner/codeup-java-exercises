import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        System.out.println("Control Flow Exercises");

//        Exercises
//        For all of the following exercises, create a new class named ControlFlowExercises with a main method.
//        After each exercise, commit your changes, then replace your code in the main method with the next exercise.
//
//        Loop Basics
//
//        While
//
//        Create an integer variable i with a value of 5.
//        int i = 5;
//        Create a while loop that runs so long as i is less than or equal to 15
//        Each loop iteration, output the current value of i, then increment i by one.
//        Your output should look like this:
//         5 6 7 8 9 10 11 12 13 14 15

//          int i = 5;
//          while (i <= 15) {
//              System.out.print(i);
//              i++;
//          }

//        Do While
//
//        Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//
//          int i = 0;
//            do {
//                System.out.println(i);
//                i = Math.pow(i, 2);
//            } while (i < 1000000);

//        Alter your loop to count backwards by 5's from 100 to -10.
//
//          for (int i = 5; i <= 15; i++) {
//              System.out.println(i);
//          }

//        Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//        Output should equal:
//         2
//         4
//         16
//         256
//         65536

//              long i = 2;
//              do {
//                  System.out.println(i);
//                  i *= i;
//              } while (i <= 10000000);

//            for (double i = 2; i < 1000000; i = Math.pow(i, 2)) {
//                System.out.println( (int) i );
//            }


//        For
//
//        Refactor the previous two exercises to use a for loop instead.
//          (SEE ABOVE)

//        Fizzbuzz
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test.
//        Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.
//
//        Write a program that prints the numbers from 1 to 100.
//        For multiples of three: print “Fizz” instead of the number.
//        For the multiples of five: print “Buzz”.
//        For numbers which are multiples of both three and five: print “FizzBuzz”.
//        *** DO MORE SPECIFIC CASE FIRST OR CODE MAY NOT BE CORRECT ***

//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0) {
//            System.out.println("Fizz");
//            }
//            if (i % 5 ==0) {
//                System.out.println("Buzz");
//            }
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            }
//            else {
//                System.out.println(i);
//            }
//        }

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.
//        Example Output
//          What number would you like to go up to? 5
//
//          Here is your table!
//
//          number | squared | cubed
//          ------ | ------- | -----
//          1      | 1       | 1
//          2      | 4       | 8
//          3      | 9       | 27
//          4      | 16      | 64
//          5      | 25      | 125

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter an Integer:");
//        int userInt = sc.nextInt();
//        System.out.println(" number | square | cubed ");
//        System.out.println(" ------ | ------ | ----- ");
//        for (int i = 1; i < userInt; i++) {
//            System.out.println(" " + i + "      |" + " " + ((int)Math.pow(i, 2)) + "     |" + " " + ((int)Math.pow(i, 3)));
//
//        }

//        Convert given number grades into letter grades.

//         Prompt the user for a numerical grade from 0 to 100.
//         Display the corresponding letter grade.
//         Prompt the user to continue.
//         Assume that the user will enter valid integers for the grades.
//         The application should only continue if the user agrees to.
//         Grade Ranges:
//            A : 100 - 88
//            B : 87 - 80
//            C : 79 - 67
//            D : 66 - 60
//            F : 59 - 0

//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("What grade did you make on your exam?");
//        int yourGrade = sc.nextInt();
//
//        System.out.println("You made a: " + yourGrade);
//
//        System.out.println("Continue to see the letter grade?");
//        String response = sc.next();
//
//        if (response.equals("yes")) {
//            if (yourGrade == 100 || yourGrade >= 88) {
//                System.out.print("Your grade is an A");
//            } else if (yourGrade == 87 || yourGrade >= 80) {
//                System.out.print("Your grade is a B");
//            } else if (yourGrade == 79 || yourGrade >= 67) {
//                System.out.print("Your grade is a C");
//            } else if (yourGrade == 66 || yourGrade >= 60) {
//                System.out.print("Your grade is a D");
//            } else if (yourGrade == 59 || yourGrade >= 0) {
//                System.out.print("Your grade is an F!");
//            }



//          Bonus
//
//          Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

//

//       LECTURE       //https://java.codeup.com/appendix/slides/

//       SLIDE 3

// no >== ,or <==, or === because only value comparisons are available
// truthy and falsy values don't exist in Java

//       SLIDE 5

// && will only check second value if first is true
// & will check both
// this can be used to check what would otherwise result in a syntax error
// same comparison process for || and |

// x will only increment in second condition if first condition is true using &&
//                int x = 2;
//                int y = 3;
//
//                if (false && ++x == y) {                // - With the && both sides have to be true,
//                    System.out.println("Equal");        //   so the second value isn't even ran.
//                } else {                                // - If we us & both sides are evaluated no
//                    System.out.println("Not equal");    //   matter what the code will run and because
//                }                                       //   of this the value of x will change.
//                System.out.println(x);


//     SLIDE 7

// DO NOT COMPARE STRINGS WITH == !!!!
// Strings are not primitive values

// System.out.println("bob" == "bob");  // This will look like its comparing strings but its not.
// It is actually comparing objects.
// Instead use equals()

//                Scanner sc = new Scanner(System.in);
//                String cat1 = sc.nextLine();
//                String cat2 = "cat";
//                System.out.println(cat1);
//                System.out.println(cat2);
//                System.out.println(cat1 == cat2);

// do use equals(),

// boolean stringValuesAreEqual = "Test".equals("Tes"); // this would be false unless we change it to "Test"
// System.out.printf("The result is: %s", stringValuesAreEqual);

// or use equalsIgnoreCase()  // This will ignore the letter case

//String hello = "hello";
//System.out.println(hello.equalsIgnoreCase("HeLlO"));

// does not equal // Use a bang (!)

//String tech = "tech";
//System.out.println(!tech.equalsIgnoreCase("tool"));

//     SLIDES 8 - 16

// basically the same as JS :)

// Some thing to keep in mind are the for loops. not using var or let
//      for(int i = 0; ...

//            String caseSwitch = "Fred";
//            switch (caseSwitch) {
//                case "bob":
//                    System.out.println("Case 1");
//                    break;
//                case "fred":
//                    System.out.println("Case 2");
//                    break;
//                default :
//                    System.out.println("Default case");
//                    break;
//            }

    }

}

//NOTES

//public class ControlFlowExercises {
//    public static void main(String[] args) {


//                Loop Basics
//
//        ======================================================= While
//
//        Create an integer variable i with a value of 5.
//        Create a while loop that runs so long as i is
//        less than or equal to 15. Each loop iteration,
//        output the current value of i, then increment i by one.
//        Your output should look like this:
//
//        5 6 7 8 9 10 11 12 13 14 15

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }



//        ======================================================= Do While
//
//        Create a do-while loop that will count by 2's starting with 0
//        and ending at 100. Follow each number with a new line.

//        int i = 0;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= 100);



//        Alter your loop to count backwards by 5's from 100 to -10.

//        int i = 100;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= -10);



//        Create a do-while loop that starts at 2, and displays the number
//        squared on each line while the number is less than 1,000,000. Output should equal:
//
//        2
//        4
//        16
//        256
//        65536

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);


//        ======================================================= For

//        refactor the previous two exercises to use a for loop instead
//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1_000_000; i *= i) {
//            System.out.println(i);
//        }

        //        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while (i < 1000000);




        // 2 Fizzbuzz

//            for (i = 0; i <= 100; i += 1) {
//                if (i % 15 == 0) {
//                    System.out.println("FizzBuzz");
//                } else if (i % 5 == 0) {
//                    System.out.println("Buzz");
//                } else if (i % 3 == 0) {
//                    System.out.println("Fizz");
//                } else {
//                    System.out.println(i);
//                }
//            }

        // 3. table of powers

//            Scanner sc = new Scanner(System.in);
//
//            boolean userContinues = true;
//
//            do {
//                System.out.print("What number would you like to go up to? ");
//                int userInt = sc.nextInt();
//                System.out.println();
//                System.out.println("Here is your table!");
//                System.out.println();
//                System.out.println("number | squared | cubed");
//                System.out.println("------ | ------- | -----");
//                for (int i = 1; i <= userInt; i += 1) {
//                    System.out.format("%-7d", i);
//                    System.out.print("|");
//                    System.out.format(" %-8d", i * i);
//                    System.out.print("|");
//                    System.out.format(" %-9d", i * i * i);
//                    System.out.println();
//                }
//                System.out.print("Would you like to enter another number (y/n)? ");
//                String userResponse = sc.next();
//                if (!userResponse.equalsIgnoreCase("y")) {
//                    userContinues = false;
//                }
//            } while (userContinues);

        // 4. grade converter

//            Scanner sc = new Scanner(System.in);
//
//            boolean anotherGrade = true;
//            do {
//                System.out.print("Please enter a numerical grade from 0 to 100 ");
//
//                int numericGrade = sc.nextInt();
//
//                if (numericGrade >= 88) {
//                    System.out.println("A");
//                } else if (numericGrade >= 80) {
//                    System.out.println("B");
//                } else if (numericGrade >= 67) {
//                    System.out.println("C");
//                } else if (numericGrade >= 60) {
//                    System.out.println("D");
//                } else {
//                    System.out.println("F");
//                }
//                System.out.print("Do you wish to enter a new grade? (y/n) ");
//                String userResponse = sc.next();
//                if (!userResponse.equalsIgnoreCase("y")) {
//                    anotherGrade = false;
//                }
//            } while (anotherGrade);


//
//    }
//}