import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("Console Exercises");

//         ============================ IO EXERCISE
//
//         Explore the Scanner Class
//
//         Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();

        System.out.println(first + second + third);

//            System.out.print("Please enter an integer: ");
//            int userInt = sc.nextInt();
//            System.out.println(userInt);
//
//         What happens if you input something that is not an integer
//             input mismatch exception
//
//         Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.
//             System.out.print("Enter 3 words: ");
//             String word1 = sc.next();
//             String word2 = sc.next();
//             String word3 = sc.next();
//             System.out.println(word1);
//             System.out.println(word2);
//             System.out.println(word3);

//         What happens if you enter less than 3 words?
//             It won't let you continue with out finishing the inputs
//
//          What happens if you enter more than 3 words?
//             It will take only the first three inputs
//
//         Prompt a user to enter a sentence, then store that sentence in a String variable using the .next method, then display that sentence back to the user.
//             System.out.println("Please enter a sentence:");
//             String sentence = sc.next();
//             System.out.println(sentence);

//         do you capture all of the words?
//             no
//
//         Rewrite the above example using the .nextLine method.
//
//            System.out.println("Please enter a sentence:");
//            String sentence = sc.nextLine();
//            System.out.println(sentence);
//
//         Calculate the perimeter and area of Codeup's classrooms. Prompt the user to enter values of length and width of the class. Use the .nextLine method to get user input and cast the resulting string to a numeric type.
//
//            System.out.println("Enter the length: ");
//            String lengthInput = sc.nextLine();
//            System.out.println("Enter the width: ");
//            String widthInput = sc.nextLine();

//
//            double length = Double.parseDouble(lengthInput);
//            double width = Double.parseDouble(widthInput);
//            System.out.println("The area is: " + (length * width) + ".");
//            System.out.println("The perimeter is: " + (length * 2 + width * 2) + ".");
//
//
//         Assume that the rooms are perfect rectangles.
//
//
//
//         Assume that the user will enter valid numeric data for length and width.
//         Display the area and perimeter of that classroom.
//
//         area = length x width
//         perimeter = 2 x length + 2 x width
//
//         Bonus
//
//         Accept decimal entries
//         Calculate the volume of the rooms

    }

}

/** Exercises
 For all of the following exercises, create a new class named ControlFlowExercises with a main method. After each exercise, commit your changes, then replace your code in the main method with the next exercise.

 Loop Basics

 While

 Create an integer variable i with a value of 5.
 Create a while loop that runs so long as i is less than or equal to 15
 Each loop iteration, output the current value of i, then increment i by one.
 Your output should look like this:

 5 6 7 8 9 10 11 12 13 14 15

 Do While

 Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
 Alter your loop to count backwards by 5's from 100 to -10.
 Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. Output should equal:
 2
 4
 16
 256
 65536

 For

 Refactor the previous two exercises to use a for loop instead.
 Fizzbuzz

 One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

 Write a program that prints the numbers from 1 to 100.
 For multiples of three: print “Fizz” instead of the number.
 For the multiples of five: print “Buzz”.
 For numbers which are multiples of both three and five: print “FizzBuzz”.
 Display a table of powers.

 Prompt the user to enter an integer.
 Display a table of squares and cubes from 1 to the value entered.
 Ask if the user wants to continue.
 Assume that the user will enter valid data.
 Only continue if the user agrees to.
 Example Output
 What number would you like to go up to? 5

 Here is your table!

 number | squared | cubed
 ------ | ------- | -----
 1      | 1       | 1
 2      | 4       | 8
 3      | 9       | 27
 4      | 16      | 64
 5      | 25      | 125
 Convert given number grades into letter grades.

 Prompt the user for a numerical grade from 0 to 100.
 Display the corresponding letter grade.
 Prompt the user to continue.
 Assume that the user will enter valid integers for the grades.
 The application should only continue if the user agrees to.
 Grade Ranges:

 A : 100 - 88
 B : 87 - 80
 C : 79 - 67
 D : 66 - 60
 F : 59 - 0
 Bonus

 Edit your grade ranges to include pluses and minuses (ex: 99-100 = A+).

 **/